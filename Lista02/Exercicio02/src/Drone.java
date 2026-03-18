public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.codigo = codigo;
        setAltura(altura);
        setBateria(bateria);
        this.emVoo = emVoo;
    }

    // validação altura
    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura inválida! O drone deve estar entre 0 e 120 metros.");
        }
    }

    // validação bateria
    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Bateria inválida! Deve estar entre 0 e 100.");
        }
    }

    public void decolar() {
        if (bateria > 20) {
            if (testarMotores()) {
                emVoo = true;
                setAltura(2);
                System.out.println("Drone decolou com sucesso!");
            } else {
                System.out.println("Falha nos motores. Não foi possível decolar.");
            }
        } else {
            System.out.println("Bateria muito baixa para decolar.");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        int numero = (int) (Math.random() * 10);

        if (numero < 8) {
            return true;
        } else {
            return false;
        }
    }

    // subir
    public void subir(float x) {
        setAltura(this.altura + x);
    }

    // descer
    public void descer(float x) {
        setAltura(this.altura - x);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nAltura: " + altura + "m" +
                "\nBateria: " + bateria + "%" +
                "\nEm voo: " + emVoo;
    }
}