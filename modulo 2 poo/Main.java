import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jack Marston", 34);
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);

        Usuario usuario = new Usuario("Dutch", 25);

        List<Livro> livrosEmprestados = new ArrayList<>();
        livrosEmprestados.add(livro);

        Date data = new Date(); // Para simplificar, usamos a mesma data

        Emprestimo emprestimo = new Emprestimo(usuario, livrosEmprestados, data, data);

        // Verifica se o livro está disponível
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }

        // Impressão das informações
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
