package Ex07VendasSupermercado;

import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda() {
        itens = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(int idItem, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(idItem, quantidade, produto);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String resultado = "---Venda---" +
                "\n" + cliente +
                "\n---Itens---";

        for (ItemVenda item : itens) {
            resultado += "\n" + item;
        }

        resultado += "\nTOTAL: R$ " + calcularTotal();

        return resultado;
    }
}
