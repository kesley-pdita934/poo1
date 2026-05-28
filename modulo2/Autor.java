
import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean ehUsuario;
    
    
    private PublicavelInterface estrategiaPublicacao;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = false;
    }

    public Autor(String nome, String nacionalidade, boolean ehUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
    }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public boolean isEhUsuario() { return ehUsuario; }
    public void setEhUsuario(boolean ehUsuario) { this.ehUsuario = ehUsuario; }

    public List<Livro> getObrasPublicadas() {
        return getLivros();
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> filtrados = new ArrayList<>();
        for (Livro livro : getLivros()) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                filtrados.add(livro);
            }
        }
        return filtrados;
    }
    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    public void publicar() {
        if (this.estrategiaPublicacao != null) {
            this.estrategiaPublicacao.publicar();
        } else {
            System.out.println("Erro: Nenhuma estratégia de publicação foi definida para este autor.");
        }
    }
}
