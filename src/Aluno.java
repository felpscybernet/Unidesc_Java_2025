public class Aluno {
    String nome;
    int idade;
    String matricula;
    double nota1;
    double nota2;

    // CONSTRUTOR da classe Aluno
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // NOVO: Método para verificar o status do aluno
    String verificarStatus() {
        if (calcularMedia() >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média Final: " + calcularMedia());
        System.out.println("Status: " + verificarStatus()); // Adicionamos o status aqui
    }
}