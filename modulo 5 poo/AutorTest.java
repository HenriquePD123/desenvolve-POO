import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("Arthur Morgan", "Britânico", Autor.TipoAutor.AUTOR_TRADICIONAL, 55);
        EstrategiaPublicacaoLivro estrategiaLivro = new EstrategiaPublicacaoLivro();
        
        
        autor.setEstrategiaPublicacao(estrategiaLivro);
        
        
        autor.publicar();  
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("John Marston", "Americano", Autor.TipoAutor.USUARIO, 40);
        EstrategiaPublicacaoArtigo estrategiaArtigo = new EstrategiaPublicacaoArtigo();
        
        
        autor.setEstrategiaPublicacao(estrategiaArtigo);
        
        
        autor.publicar();
    }

    @Test
    public void testPublicacaoSemEstrategia() {
        Autor autor = new Autor("Charles", "Canadense", Autor.TipoAutor.USUARIO, 28);
        
        
        autor.publicar();  
    }
}
