import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Usuario usuario;
    private List<Livro> livros;
    private Date dataRetirada;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, List<Livro> livros, Date dataRetirada, Date dataDevolucao) {
        this.usuario = usuario;
        this.livros = livros;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;

        for (Livro livro : livros) {
            livro.setDisponivel(false);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void imprimirDetalhes() {
        for (Livro livro : livros) {
            if (!livro.isDisponivel()) {
                System.out.println("O livro não está disponível");
            }
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Genero: " + livro.getGenero());
        }

        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + dataRetirada);
        System.out.println("Data de Devolucao: " + dataDevolucao);
    }
}
