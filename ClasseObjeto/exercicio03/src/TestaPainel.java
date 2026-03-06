public class TestaPainel {
    public static void main(String[] args) {
        Painel jogo = new Painel("Sesi Franca", "Bauru");
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 1);
        System.out.println(jogo);

        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto();

        jogo.registrarPonto("casa", 2);

        System.out.println(jogo);
    }
}