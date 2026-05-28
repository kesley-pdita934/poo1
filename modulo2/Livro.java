public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true; // Todo livro começa disponível
        
        // Adiciona o livro à lista de obras publicadas do autor
        if (autor != null) {
            autor.getLivros().add(this);
        }
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
    
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public void validarDisponibilidade() {
        if (!this.disponivel) {
            System.out.println("O livro não está disponível");
        } else {
            System.out.println("O livro está disponível");
        }
    }
}