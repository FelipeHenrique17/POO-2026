package ExIntegrador01;

public class TestaSistema {
    public static void main(String[] args) {
        EmpresaLogistica empresa = new EmpresaLogistica("Transportadora");

        Caminhao c1 = new Caminhao("ABC-1234", 10000, 4);
        Caminhao c2 = new Caminhao("DEF-5678", 15000, 6);

        Van v1 = new Van("GHI-9012", 2000, true);
        Van v2 = new Van("JKL-3456", 2500, false);

        empresa.adicionarVeiculo(c1);
        empresa.adicionarVeiculo(c2);
        empresa.adicionarVeiculo(v1);
        empresa.adicionarVeiculo(v2);

        empresa.gerarRelatorioCustos(300);
    }
}
