import java.util.Date;

public class Main {

    public static void main(String[] args) {

        
        Autor autor = new Autor("Lucas Lima", "Brasileiro", Autor.TipoAutor.USUARIO, 30);

    
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);

        Usuario usuario = new Usuario("Gabriel", 21);

        
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataRetirada, dataDevolucao);

    
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        
        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Idade do Autor: " + autor.getIdade());  
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade do Usuário: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + dataRetirada);
        System.out.println("Data de Devolução: " + dataDevolucao);
        System.out.println("Artigo: " + artigo.getTitulo() + " (Publicado: " + artigo.isPublicado() + ")");
    }
}

