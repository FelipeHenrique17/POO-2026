package Ex07VendasSupermercado;

public class TestaMercado {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz", 25.0);
        Produto p2 = new Produto(2, "Feijão", 10.0);

        Cliente cliente = new Cliente(1, "Felipe");

        Venda venda = new Venda(1, cliente);

        venda.adicionarItem(1, 4, p1);
        venda.adicionarItem(2, 2, p2);

        System.out.println(venda);
    }
}
