import java.util.*;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 35);
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);

        Usuario usuario = new Usuario("Isabelle Amaral", 26);

        Date dataAtual = new Date();

        List<Livro> livrosEmprestados = new ArrayList<>();
        livrosEmprestados.add(livro);

        Emprestimo emprestimo = new Emprestimo(usuario, livrosEmprestados, dataAtual, dataAtual);

        emprestimo.imprimirDetalhes();
    }
}
