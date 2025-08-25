import java.util.Scanner;

public class Sistema {

    private Curso curso; // O sistema vai gerenciar um único curso por enquanto
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println("--- Bem-vindo ao Sistema de Gerenciamento de Alunos ---");

        // Inicializa o curso
        Professor professor = new Professor("Dr. Alan Turing", "Doutor em Matemática");
        this.curso = new Curso("Desenvolvimento de Sistemas com Java", "ADS-JAVA", 80);
        this.curso.definirProfessor(professor);

        int opcao = 0;
        while (opcao != 9) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    lancarNotas();
                    break;
                case 3:
                    curso.exibirDetalhes();
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Cadastrar novo aluno");
        System.out.println("2. Lançar notas de um aluno");
        System.out.println("3. Exibir detalhes do curso e alunos");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void cadastrarAluno() {
        System.out.println("\n--- Cadastro de Aluno ---");
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        Aluno novoAluno = new Aluno(nome, idade, matricula);
        curso.matricularAluno(novoAluno);
    }

    private void lancarNotas() {
        System.out.println("\n--- Lançamento de Notas ---");
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        // Procura o aluno na lista do curso
        for (Aluno aluno : curso.alunosMatriculados) {
            if (aluno.matricula.equals(matricula)) {
                System.out.print("Digite a Nota 1 para " + aluno.nome + ": ");
                aluno.nota1 = scanner.nextDouble();
                System.out.print("Digite a Nota 2 para " + aluno.nome + ": ");
                aluno.nota2 = scanner.nextDouble();
                scanner.nextLine(); // Consome a quebra de linha
                System.out.println("Notas lançadas com sucesso!");
                return; // Sai do método após encontrar e atualizar o aluno
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
    }
}