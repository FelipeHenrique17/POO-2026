package ExIntegrador02;

public class TestaSistema {
    public static void main(String[] args) {
        Camera c1 = new Camera("Entrada", true, "Full HD");
        Camera c2 = new Camera("Garagem", true, "4K");

        SensorMovimento s1 = new SensorMovimento("Portão", true, 0.8);
        SensorMovimento s2 = new SensorMovimento("Corredor", false, 0.5);

        Condominio cond = new Condominio("Morada do Verde");

        cond.adicionarDispositivo(c1);
        cond.adicionarDispositivo(c2);
        cond.adicionarDispositivo(s1);
        cond.adicionarDispositivo(s2);

        cond.testeGeralSeguranca();
    }
}
