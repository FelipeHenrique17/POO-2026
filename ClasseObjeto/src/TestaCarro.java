public class TestaCarro {
    public static void main(String args[]){
        // cria um objeto (instância da classe Carro)
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "E2D31F0";
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(120);
        obj1.frear(80);
        obj1.frear(80);
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("Volks", "Polo", "E9473F2");
        System.out.println(obj2.toString());
        obj2.desligar();
        System.out.println(obj2.toString());
    }
}
