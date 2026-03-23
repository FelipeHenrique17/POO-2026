package Ex03TimeBasquete;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    public Time() {
        atletas = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico, ArrayList<Atleta> atletas) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public void contratarAtleta(Atleta a) {
        atletas.add(a);
    }

    @Override
    public String toString() {
        String resultado = "---Escalação---" +
                "\nID: " + id +
                "\nNome: " + nome +
                "\nTécnico: " + tecnico +
                "\n--- Atletas ---";

        for (Atleta a : atletas) {
            resultado += "\n" + a;
        }

        return resultado;
    }
}
