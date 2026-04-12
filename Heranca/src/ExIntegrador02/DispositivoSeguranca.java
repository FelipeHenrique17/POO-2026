package ExIntegrador02;

public abstract class DispositivoSeguranca {
    protected String localizacao;
    protected boolean ativo;

    public DispositivoSeguranca() {
    }

    public DispositivoSeguranca(String localizacao, boolean ativo) {
        this.localizacao = localizacao;
        this.ativo = ativo;
    }

    public void status() {
        System.out.println("Localização: " + localizacao);
        System.out.println("Status: " + (ativo ? "Ativo" : "Inativo"));
    }

    public abstract void dispararAlerta();
}
