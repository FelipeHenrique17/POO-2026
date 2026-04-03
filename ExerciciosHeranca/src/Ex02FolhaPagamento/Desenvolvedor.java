package Ex02FolhaPagamento;

public class Desenvolvedor {
    String nome;
    double salario;

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void codar() {
        System.out.println("Desenvolvedor codando...");
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Salário: " + salario;
    }
}
