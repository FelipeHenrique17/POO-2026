package Ex05ComputadorComponentes;

public class TestaComputador {
    public static void main(String[] args) {
        Computador pc = new Computador(1, "Positivo", "VisionR15", "i7", 3.5);

        System.out.println(pc);

        pc = null;

        System.out.println("\nComputador foi removido da memória.");
    }
}
