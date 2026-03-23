package Ex06EdificiosApartamentos;

public class TestaEdificio {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Residencial Morada do Verde", "Rua A, 2232");

        edificio.construirApartamento(123, 1);
        edificio.construirApartamento(456, 2);
        edificio.construirApartamento(789, 3);

        System.out.println(edificio);

        edificio = null;

        System.out.println("\nEdifício removido da memória.");
    }
}
