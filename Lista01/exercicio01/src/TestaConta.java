public class TestaConta {
    public static void main(String args[]){
        // cria um objeto (instância da classe Conta)
        Conta c1 = new Conta(123123123, 1234, "João Silva");
        System.out.println(c1.toString());
        c1.depositar(500f);
        c1.sacar(200f);
        System.out.println(c1);

        Conta c2 = new Conta(456456456, 4567, "Maria Souza");
        System.out.println(c2.toString());
        c2.sacar(50f);
        c1.encerrarConta();
        c1.sacar(300f);
        c1.encerrarConta();
        System.out.println(c1);
    }
}

