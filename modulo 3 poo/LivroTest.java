import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    private Autor autor;
    private Livro livro1;
    private Livro livro2;

    @BeforeEach
    public void setup() {
        autor = new Autor("Jess", 30);
        livro1 = new Livro("Java Basico", "tecnologia", autor);
        livro2 = new Livro("Java Avançado", "tecnologia", autor);
        livro2.setDisponivel(false);
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testGetGenero() {
        assertEquals("tecnologia", livro2.getGenero());
    }

    @Test
    public void testGetAutor() {
        assertEquals("Jess", livro1.getAutor().getNome());
    }

    @Test
    public void testDisponibilidadeLivro1() {
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testDisponibilidadeLivro2() {
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSetDisponivel() {
        livro2.setDisponivel(true);
        assertTrue(livro2.isDisponivel());
    }
}
