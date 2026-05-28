import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testAutorTradicional() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertFalse(autor.isEhUsuario());
    }

    @Test
    public void testAutorUsuario() {
        Autor autor = new Autor("Ada Lovelace", "Britânica", true);
        assertTrue(autor.isEhUsuario());
    }

    @Test
    public void testAlterarTipoAutor() {
        Autor autor = new Autor("Grace Hopper", "Americana");
        autor.setEhUsuario(true);
        assertTrue(autor.isEhUsuario());
    }
}