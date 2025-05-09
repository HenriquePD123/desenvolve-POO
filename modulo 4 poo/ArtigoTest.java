import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testCriacaoArtigo() {
        Autor autor = new Autor("Alan Turing", "Inglês", Autor.TipoAutor.AUTOR_TRADICIONAL);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testArtigoNaoPublicado() {
        Autor autor = new Autor("Ada Lovelace", "Inglês", Autor.TipoAutor.AUTOR_TRADICIONAL);
        Artigo artigo = new Artigo("Matemática para todos", autor, "Ciência", false);

        assertEquals("Matemática para todos", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("Ciência", artigo.getGenero());
        assertFalse(artigo.isPublicado());
    }
}

