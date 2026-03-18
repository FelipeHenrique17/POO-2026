import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        questoes.add(q);
    }

    @Override
    public String toString() {
        String resultado = "\n Avaliação: " + nome;
        for (Questao q : questoes) {
            resultado += q.toString();
        }
        return resultado;
    }
}