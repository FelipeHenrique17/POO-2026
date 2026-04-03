package Ex02FolhaPagamento;

public class Junior extends Desenvolvedor {

    public Junior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println("Junior codando com supervisão...");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}
