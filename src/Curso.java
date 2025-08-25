import java.util.ArrayList;

public class Curso {
    String nome;
    String codigo;
    int cargaHoraria;
    ArrayList<Aluno> alunosMatriculados = new ArrayList<>();
    Professor professorResponsavel;

    // CONSTRUTOR da classe Curso
    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    // ... resto dos métodos (matricularAluno, definirProfessor, exibirDetalhes) ...
// ...
    void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        System.out.println("Aluno(a) " + aluno.nome + " matriculado(a) com sucesso no curso " + this.nome + "!");
    }

    // Novo método para definir o professor do curso
    void definirProfessor(Professor professor) {
        this.professorResponsavel = professor;
    }

    void exibirDetalhes() {
        System.out.println("--- Detalhes do Curso ---");
        System.out.println("Curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");

        // Exibe os detalhes do professor, se houver um
        if (professorResponsavel != null) {
            System.out.println("\n--- Professor Responsável ---");
            professorResponsavel.exibirDetalhes();
        }

        System.out.println("\n--- Desempenho dos Alunos (" + alunosMatriculados.size() + ") ---");
        if (alunosMatriculados.isEmpty()) {
            System.out.println("Nenhum aluno matriculado neste curso.");
        } else {
            // Alteração aqui: agora exibimos os detalhes completos de cada aluno
            for (Aluno aluno : alunosMatriculados) {
                System.out.println("--------------------");
                aluno.exibirDetalhes();
            }
        }
    }
}