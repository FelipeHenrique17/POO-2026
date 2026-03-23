package Ex07VendasSupermercado;

public class ItemVenda {
    private int id;
    private int quantidade;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double calcularSubtotal() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return produto.getNome() +
                " | Qtd: " + quantidade +
                " | Subtotal: R$ " + calcularSubtotal();
    }
}
