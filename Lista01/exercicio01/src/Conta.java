public class Conta {
    // atributos / propriedades (variaveis)
    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status; //true se a conta estiver ativa e false se estiver encerrada

    // método construtor - tem o mesmo nome da classe
    public Conta(){

    }
    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }
    // depositar
    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Conta inativa. Não é possível depositar.");
        }
    }
    // sacar
    public void sacar(float valor) {
        if (!status) {
            System.out.println("Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    // encerrar Conta
    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar a conta. Saque o saldo restante primeiro.");
        }
    }
    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa o objeto que chama o método
        return "Número da Conta: " + this.numeroConta +
                " Agência: " + this.agencia +
                " Cliente: " + this.nomeCliente +
                " Saldo Atual: R$" + this.saldo +
                " Status: " + (this.status ? "Ativa": "Encerrada");
    }
}

