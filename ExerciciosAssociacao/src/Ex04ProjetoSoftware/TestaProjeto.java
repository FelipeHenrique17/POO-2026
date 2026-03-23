package Ex04ProjetoSoftware;

public class TestaProjeto {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Felipe", "Java");
        Programador p2 = new Programador(2, "Gabriel", "JavaScript");
        Programador p3 = new Programador(3, "Moisés", "Python");

        Projeto projeto = new Projeto(1, "Sistema para ONG");

        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.adicionarProgramador(p3);

        projeto.listarProgramadores();
    }
}
