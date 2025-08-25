public class Professor {
    String nome;
    String formacao;

    // CONSTRUTOR da classe Professor
    public Professor(String nome, String formacao) {
        this.nome = nome;
        this.formacao = formacao;
    }

    void exibirDetalhes() {
        System.out.println("Professor(a): " + nome);
        System.out.println("Formação: " + formacao);
    }
}