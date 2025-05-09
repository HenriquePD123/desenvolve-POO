public class AutorTest {

    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("Clarice Lispector", 56);
        assertEquals("Clarice Lispector", autor.getNome());
        assertEquals(56, autor.getIdade());
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor("Nome Antigo", 50);
        autor.setNome("Novo Nome");
        assertEquals("Novo Nome", autor.getNome());
    }

    @Test
    public void testSetIdade() {
        Autor autor = new Autor("Alguém", 50);
        autor.setIdade(60);
        assertEquals(60, autor.getIdade());
    }
}
