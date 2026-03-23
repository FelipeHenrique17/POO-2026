package Ex08CineTeatro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    // Agregação
    private Filme filme;

    // Composição
    private ArrayList<Ingresso> ingressos;

    // Construtor
    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // Agregação
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // Composição
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String resultado = "---Sessão---" +
                "\nSala: " + sala +
                "\nHorário: " + horario.format(formato) +
                "\nFilme: " + filme +
                "\n---Ingressos---";

        for (Ingresso i : ingressos) {
            resultado += "\n" + i;
        }

        return resultado;
    }
}
