import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    private Autor autor;
    private Livro livro1;
    private Livro livro2;

    @BeforeEach
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
        livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    }

    @Test
    public void testGetters() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getGenero());
        assertTrue(livro1.isDisponivel());
        
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSetters() {
        livro1.setTitulo("Java para Iniciantes");
        livro1.setGenero("Programação");
        livro1.setDisponivel(false);
        Autor novoAutor = new Autor("Novo Autor", "Brasileiro");
        livro1.setAutor(novoAutor);

        assertEquals("Java para Iniciantes", livro1.getTitulo());
        assertEquals("Programação", livro1.getGenero());
        assertFalse(livro1.isDisponivel());
        assertEquals(novoAutor, livro1.getAutor());
    }

    @Test
    public void testValidarDisponibilidade() {
        assertDoesNotThrow(() -> livro1.validarDisponibilidade());
        assertDoesNotThrow(() -> livro2.validarDisponibilidade());
    }
}