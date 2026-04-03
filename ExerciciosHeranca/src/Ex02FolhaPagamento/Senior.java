package Ex02FolhaPagamento;

public class Senior extends Desenvolvedor {

    public Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println("Senior arquitetando e codando sistemas complexos...");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
