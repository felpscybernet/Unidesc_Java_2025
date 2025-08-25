public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Gerenciamento de Alunos ---");

        // Criando o primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Felipe";
        aluno1.idade = 22;
        aluno1.matricula = "20251001";

        // Criando o segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 20;
        aluno2.matricula = "20251002";

        // Criando um curso
        Curso cursoDeJava = new Curso();
        cursoDeJava.nome = "Desenvolvimento de Sistemas com Java";
        cursoDeJava.codigo = "ADS-JAVA";
        cursoDeJava.cargaHoraria = 80;


        // Exibindo as informações
        System.out.println("\n--- Detalhes do Curso ---");
        cursoDeJava.exibirDetalhes();

        System.out.println("\n--- Alunos Matriculados ---");
        System.out.println("Aluno 1:");
        aluno1.exibirDetalhes();

        System.out.println("\nAluno 2:");
        aluno2.exibirDetalhes();
    }
}