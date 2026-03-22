public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    // validação marca
    public void setMarca(String m) {
        if (m != null && m.length() >= 3) {
            this.marca = m;
        } else {
            System.out.println("Marca inválida");
        }
    }

    // validação temperatura
    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo Turbo ativado!");
        } else {
            System.out.println("Falha no compressor. Não foi possível ativar o modo turbo.");
        }
    }

    private boolean verificarCompressor() {
        double numero = Math.random() * 5;
        if (numero > 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura +
                "\nLigado: " + ligado;
    }
}