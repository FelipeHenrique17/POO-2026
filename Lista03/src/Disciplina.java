import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // Agregação
    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    // Composição
    public void criarAvaliacao(int id, String nome) {
        Avaliacao av = new Avaliacao(id, nome);
        avaliacoes.add(av);
    }

    public Avaliacao getUltimaAvaliacao() {
        if (avaliacoes.size() > 0) {
            return avaliacoes.get(avaliacoes.size() - 1);
        }
        return null;
    }

    @Override
    public String toString() {
        String resultado = "\nDisciplina: " + nome + " | Professor: " + professor;

        resultado += "\n\nAlunos:";
        for (Aluno a : alunos) {
            resultado += "\n - " + a.toString();
        }

        resultado += "\n\nAvaliações:";
        for (Avaliacao av : avaliacoes) {
            resultado += av.toString();
        }

        return resultado;
    }
}