public class Curso {
    String nome;
    String codigo;
    int cargaHoraria;

    void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
}