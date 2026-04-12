package ExIntegrador01;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao() {
        super();
    }

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }
    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 5.00) + (quantidadeEixos * 50.00);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}




