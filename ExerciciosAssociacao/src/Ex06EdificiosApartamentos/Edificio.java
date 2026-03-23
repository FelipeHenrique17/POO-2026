package Ex06EdificiosApartamentos;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio() {
        apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar) {
        Apartamento ap = new Apartamento(num, andar);
        apartamentos.add(ap);
    }

    @Override
    public String toString() {
        String resultado = "---Edificio---" +
                "\nNome: " + nome +
                "\nEndereço: " + endereco +
                "\n---Apartamentos---";

        for (Apartamento ap : apartamentos) {
            resultado += "\n" + ap;
        }

        return resultado;
    }
}
