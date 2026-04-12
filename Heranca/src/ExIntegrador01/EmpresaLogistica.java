package ExIntegrador01;

import java.util.ArrayList;

public class EmpresaLogistica {
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;

    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia) {
        System.out.println("=== Relatório de Custos - " + nomeEmpresa + " ===");

        for (Veiculo v : frota) {
            v.exibirDados();
            double custo = v.calcularCustoViagem(distancia);
            System.out.println("Custo da viagem (" + distancia + " km): R$ " + custo);
            System.out.println("-----------------------------------");
        }
    }
}
