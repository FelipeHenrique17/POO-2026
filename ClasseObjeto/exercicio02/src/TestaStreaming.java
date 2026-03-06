public class TestaStreaming {
    public static void main(String[] args) {
        Streaming s1 = new Streaming("Felipe Henrique", "Premium");
        System.out.println(s1.toString());
        s1.assistirFilme("Os Vingadores");
        System.out.println(s1);
        s1.cancelarAssinatura();
        System.out.println(s1);

        Streaming s2 = new Streaming("Gabriel", "Família");
        System.out.println(s2.toString());
        s2.assistirFilme("Homem Aranha");
        System.out.println(s2);
    }
}
