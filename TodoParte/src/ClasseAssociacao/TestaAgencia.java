package ClasseAssociacao;
import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main (String[] args) {
        Passageiro p1 = new Passageiro("Felipe", "22233344456");

        LocalDateTime data = LocalDateTime.of(2026, 7, 10, 19, 00, 00);

        Voo vo1 = new Voo(777, "Ribeirão Preto", "EUA", data);

        Reserva re1 = new Reserva(111, LocalDateTime.now(), 10, p1, vo1);
        System.out.println(re1.toString());
    }
}

