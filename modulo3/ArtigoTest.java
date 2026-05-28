import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    private Autor autor;
    private Artigo artigo;

    @BeforeEach
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
        artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
    }

    @Test
    public void testGetters() {
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testSetters() {
        artigo.setTitulo("Novos Compiladores");
        Autor novoAutor = new Autor("Alan Turing", "Inglês");
        artigo.setAutor(novoAutor);
        artigo.setGenero("Ciência da Computação");
        artigo.setPublicado(false);

        assertEquals("Novos Compiladores", artigo.getTitulo());
        assertEquals(novoAutor, artigo.getAutor());
        assertEquals("Ciência da Computação", artigo.getGenero());
        assertFalse(artigo.isPublicado());
    }
}