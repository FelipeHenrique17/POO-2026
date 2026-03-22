public class Painel {
    // atributos / propriedades (variaveis)
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    // método construtor - tem o mesmo nome da classe
    public Painel(){

    }
    public Painel(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }
    //registrarPonto
    public void registrarPonto(String time, int tipo) {
        System.out.println("O time: " + time + " fez " + tipo + " pontos");
        if (periodoQuarto > 4) {
            System.out.println("O jogo já terminou.");
            return;
        }
        if (tipo != 1 && tipo != 2 && tipo != 3) {
            System.out.println("Tipo de ponto inválido.");
            return;
        }
        if (time.equalsIgnoreCase(this.nomeTimeCasa)) {
            pontosCasa += tipo;
            System.out.println("Ponto para o time " + this.nomeTimeCasa);
        } else if (time.equalsIgnoreCase(this.nomeTimeVisitante)) {
            pontosVisitante += tipo;
            System.out.println("Ponto para o time " + this.nomeTimeVisitante);
        } else {
            System.out.println("Time inválido. Use ' time casa' ou ' time visitante'.");
        }
    }
    //proximo Quarto
    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
            System.out.println("Iniciando o " + periodoQuarto + "º quarto.");
        } else {
            periodoQuarto++;
            System.out.println("O jogo terminou!");
        }
    }
    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa o objeto que chama o método
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] "
                + nomeTimeVisitante + " - Período: "
                + (periodoQuarto <= 4 ? periodoQuarto : "Encerrado");
    }
}
