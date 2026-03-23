package Ex02SistemaBiblioteca;

import java.time.LocalDateTime;

public class TestaEmprestimo {
    public static void main(String[] args) {

        Leitor leitor = new Leitor(1, "Felipe");
        Livro livro = new Livro(1, "Homem Aranha", "Stan Lee");

        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime dataDevolucao = dataEmprestimo.plusDays(7);

        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, leitor, livro);

        System.out.println(emprestimo);
    }
}
