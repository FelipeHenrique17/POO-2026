package ExIntegrador01;

public abstract class Veiculo {
    protected String placa;
    protected double capacidadeCarga;

    public Veiculo() {
    }

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " kg");
    }

    public abstract double calcularCustoViagem(double distancia);
}
