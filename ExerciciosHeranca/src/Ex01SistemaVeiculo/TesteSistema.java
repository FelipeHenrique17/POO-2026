package Ex01SistemaVeiculo;

public class TesteSistema {
    public static void main(String[] args) {

        Aviao aviao = new Aviao("Boeing", "747", 900, 12000);
        CarroEletrico carro = new CarroEletrico("Tesla", "Model S", 120, 500);

        // Polimorfismo
        Veiculo v;

        v = aviao;
        v.mover();

        v = carro;
        v.mover();
    }
}
