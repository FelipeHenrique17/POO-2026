public class TestaDrone {
    public static void main(String[] args) {
        Drone d = new Drone("DRONE001", 0, 80, false);

        System.out.println(d);

        d.decolar();

        d.subir(10);
        d.descer(3);

        System.out.println("\nEstado atual do drone:");
        System.out.println(d);
    }
}
