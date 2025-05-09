import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;
    private Emprestimo emprestimo;

    @BeforeEach
    public void setup() {
        dataRetirada = new Date();
        dataDevolucao = new Date();
        livro = new Livro("Java Basics", "Tecnologia", new Autor("Alan Turing", 41));
        usuario = new Usuario("Gabriel", 21);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro);

        emprestimo = new Emprestimo(usuario, livros, dataRetirada, dataDevolucao);
    }

    @Test
    public void testGetUsuario() {
        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
    }

    @Test
    public void testGetLivros() {
        assertEquals(1, emprestimo.getLivros().size());
        assertEquals("Java Basics", emprestimo.getLivros().get(0).getTitulo());
    }

    @Test
    public void testDatas() {
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testLivroFicaIndisponivel() {
        assertFalse(livro.isDisponivel());
    }
}

