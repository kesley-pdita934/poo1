import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;
    private Emprestimo emprestimo;

    @BeforeEach
    public void setUp() {
        dataRetirada = new Date();
        dataDevolucao = new Date();
        livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        usuario = new Usuario("Gabriel", 21);
        
        emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
    }

    @Test
    public void testGetters() {
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testSetters() {
        Date novaData = new Date(System.currentTimeMillis() + 100000);
        Livro novoLivro = new Livro("Clean Code", new Autor("Robert C. Martin", "Americano"), "Tecnologia", true);
        Usuario novoUsuario = new Usuario("Lucas", 25);

        emprestimo.setDataRetirada(novaData);
        emprestimo.setDataDevolucao(novaData);
        emprestimo.setLivro(novoLivro);
        emprestimo.setUsuario(novoUsuario);

        assertEquals(novaData, emprestimo.getDataRetirada());
        assertEquals(novaData, emprestimo.getDataDevolucao());
        assertEquals(novoLivro, emprestimo.getLivro());
        assertEquals(novoUsuario, emprestimo.getUsuario());
    }
}