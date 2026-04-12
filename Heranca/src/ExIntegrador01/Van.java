package ExIntegrador01;

public class Van extends Veiculo {
    private boolean refrigerada;

    public Van() {
        super();
    }

    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custo = distancia * 3.00;
        if (refrigerada) {
            custo += 100.00;
        }
        return custo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Refrigerada: " + (refrigerada ? "Sim" : "Não"));
    }
}

