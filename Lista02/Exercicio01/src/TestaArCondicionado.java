public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("Philco", "Dual Inverter", 24, true);

        System.out.println(ar);

        ar.ativarModoTurbo();

        System.out.println("\nApós modo turbo:");
        System.out.println(ar);
    }
}
