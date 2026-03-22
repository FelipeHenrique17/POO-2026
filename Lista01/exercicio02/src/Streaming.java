public class Streaming {
    // atributos / propriedades (variaveis)
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    // método construtor - tem o mesmo nome da classe
    public Streaming(){

    }
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equalsIgnoreCase("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        } else {
            System.out.println("Plano inválido. Definido como Básico por padrão.");
            this.plano = "Básico";
            this.mensalidade = 25.90f;
        }

        this.ativo = true; // inicia ativo
        this.ultimoFilmeAssistido = ""; // inicia vazio
    }
    // assistir filme
    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. É necessário pagar a fatura.");
        }
    }
    // cancelar assinatura
    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura cancelada com sucesso.");
    }
    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa o objeto que chama o método
        return "Usuário: " + this.usuario +
                " Plano: " + this.plano +
                " Mensalidade: R$" + this.mensalidade +
                " Status: " + (ativo ? "Ativo" : "Suspenso") +
                " Último Filme Assistido: " + (ultimoFilmeAssistido.isEmpty() ? "Nenhum": ultimoFilmeAssistido);
    }
}