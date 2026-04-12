package ExIntegrador02;

import java.util.ArrayList;

public class Condominio {
    private String nome;
    private ArrayList<DispositivoSeguranca> dispositivos;

    public Condominio(String nome) {
        this.nome = nome;
        this.dispositivos = new ArrayList<>();
    }

    public void adicionarDispositivo(DispositivoSeguranca d) {
        dispositivos.add(d);
    }

    public void testeGeralSeguranca() {
        System.out.println("=== Teste Geral de Segurança - " + nome + " ===");
        for (DispositivoSeguranca d : dispositivos) {
            d.status();
            d.dispararAlerta();
            if (d instanceof DispositivoConectado) {
                DispositivoConectado dc = (DispositivoConectado) d;
                dc.realizarAutodiagnostico();
            }
            System.out.println("----------------------------------");
        }
    }
}
