import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCriacaoAutor() {
        Autor autorTradicional = new Autor("Clarice Lispector", "Brasileira", Autor.TipoAutor.AUTOR_TRADICIONAL);
        assertEquals("Clarice Lispector", autorTradicional.getNome());
        assertEquals(Autor.TipoAutor.AUTOR_TRADICIONAL, autorTradicional.getTipo());
        assertEquals("Brasileira", autorTradicional.getNacionalidade());

        Autor usuarioAutor = new Autor("João Silva", "Português", Autor.TipoAutor.USUARIO);
        assertEquals("João Silva", usuarioAutor.getNome());
        assertEquals(Autor.TipoAutor.USUARIO, usuarioAutor.getTipo());
        assertEquals("Português", usuarioAutor.getNacionalidade());
    }
}

