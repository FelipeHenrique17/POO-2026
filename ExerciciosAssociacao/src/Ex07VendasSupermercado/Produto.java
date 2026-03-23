package Ex07VendasSupermercado;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "Id: " + id +
                ", Nome: " + nome +
                ", Preço: " + preco;
    }
}
