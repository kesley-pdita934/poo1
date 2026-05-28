// Arquivo: EstrategiaPublicacaoTest.java (Na sua pasta de testes)
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class EstrategiaPublicacaoTest {

    private Autor autor;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        // Prepara um autor e captura o que sai no console (System.out) para podermos testar
        autor = new Autor("Jessica Felix", "Brasileira");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPublicarComoLivro() {
        // Define a estratégia de livro
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();
        
        // Verifica se a saída do console bate com a classe EstrategiaPublicacaoLivro
        assertEquals("Iniciando o processo de publicação de um Livro...", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPublicarComoArtigo() {
        // Define a estratégia de artigo
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar();
        
        // Verifica se a saída do console bate com a classe EstrategiaPublicacaoArtigo
        assertEquals("Iniciando o processo de publicação de um Artigo...", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPublicarSemEstrategiaDefinida() {
        // Tenta publicar sem dar um "setEstrategiaPublicacao" antes
        autor.publicar();
        
        // Deve cair na validação de erro que criamos
        assertEquals("Erro: Nenhuma estratégia de publicação foi definida para este autor.", outputStreamCaptor.toString().trim());
    }
}