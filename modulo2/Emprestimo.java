import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;

        // Se o livro estiver sendo emprestado, ele fica indisponível
        if (livro != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
            if (usuario != null) {
                usuario.getHistoricoEmprestimos().add(this);
            }
        }
    }

    public Date getDataRetirada() { return dataRetirada; }
    public void setDataRetirada(Date dataRetirada) { this.dataRetirada = dataRetirada; }
    
    public Date getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(Date dataDevolucao) { this.dataDevolucao = dataDevolucao; }
    
    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }
    
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}