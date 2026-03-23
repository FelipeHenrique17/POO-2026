package Ex05ComputadorComponentes;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador() {
    }

    public Computador(int id, String marca, String marcaProc, String modeloProc, double freq) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, freq);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "---Computador---" +
                "\nId: " + id +
                "\nMarca: " + marca +
                "\n" + processador;
    }
}
