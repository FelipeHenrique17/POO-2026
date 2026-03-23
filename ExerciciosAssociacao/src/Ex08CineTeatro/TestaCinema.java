package Ex08CineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Ação", 180);

        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao(1, data, 1);

        sessao.vincularFilme(f1);

        sessao.venderIngresso(1, "A1", "Inteira", 30f);
        sessao.venderIngresso(2, "A2", "Meia", 15f);
        sessao.venderIngresso(3, "A3", "Inteira", 30f);

        System.out.println(sessao);
    }
}
