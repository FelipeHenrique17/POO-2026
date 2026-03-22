public class TestaPainel {
    public static void main(String[] args) {
        Painel jogo = new Painel("Sesi Franca", "Bauru");
        jogo.registrarPonto("Sesi Franca", 2);
        System.out.println();

        jogo.registrarPonto("Bauru", 3);
        System.out.println();

        jogo.registrarPonto("Sesi Franca", 1);
        System.out.println();

        System.out.println(jogo);

        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        System.out.println();

        System.out.println(jogo);
    }
}