package Ex03TimeBasquete;

import java.util.ArrayList;

public class TestaTime {
    public static void main(String[] args) {

        Atleta a1 = new Atleta(1, "Lucas Dias", "Armador");
        Atleta a2 = new Atleta(2, "Georginho", "Ala");

        Time time = new Time(1, "Sesi Franca Basquete", "Helinho", new ArrayList<>());

        time.contratarAtleta(a1);
        time.contratarAtleta(a2);

        System.out.println(time);

        time = null;

        System.out.println("\nTime foi removido da memória.");

        System.out.println("\nAtleta ainda existe:");
        System.out.println(a1);
        System.out.println(a2);
    }
}
