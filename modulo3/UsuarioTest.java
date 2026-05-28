import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Gabriel", 21);
    }

    @Test
    public void testGettersESetters() {
        usuario.setNome("Gabriel Atualizado");
        usuario.setIdade(22);

        assertEquals("Gabriel Atualizado", usuario.getNome());
        assertEquals(22, usuario.getIdade());
    }

    @Test
    public void testHistoricoEmprestimos() {
        Livro livro = new Livro("Java Basics", new Autor("Alan", "Inglês"), "Tecnologia", true);
        Emprestimo emp1 = new Emprestimo(livro, usuario, new Date(), new Date());
        
        List<Emprestimo> historicoNovo = new ArrayList<>();
        historicoNovo.add(emp1);
        
        usuario.setHistoricoEmprestimos(historicoNovo);
        
        assertEquals(1, usuario.getHistoricoEmprestimos().size());
        assertEquals(emp1, usuario.getHistoricoEmprestimos().get(0));
    }
}