import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor("Alan Turing", "Inglês");
    }

    @Test
    public void testGettersESetters() {
        autor.setNome("Ada Lovelace");
        autor.setNacionalidade("Britânica");

        assertEquals("Ada Lovelace", autor.getNome());
        assertEquals("Britânica", autor.getNacionalidade());
    }

    @Test
    public void testObrasPublicadas() {
        Livro livro1 = new Livro("Livro A", autor, "Ficção", true);
        Livro livro2 = new Livro("Livro B", autor, "Tecnologia", true);
        Livro livro3 = new Livro("Livro C", autor, "Tecnologia", true);

        List<Livro> obras = autor.getObrasPublicadas();
        assertTrue(obras.contains(livro1));
        assertTrue(obras.contains(livro2));
        assertEquals(3, obras.size());

        List<Livro> obrasTecnologia = autor.getObrasPublicadasPorGenero("Tecnologia");
        assertEquals(2, obrasTecnologia.size());
        assertTrue(obrasTecnologia.contains(livro2));
        assertTrue(obrasTecnologia.contains(livro3));
        assertFalse(obrasTecnologia.contains(livro1));
    }
}