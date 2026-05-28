import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Criando os objetos iniciais
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        // 2. Definindo a disponibilidade como false para forçar a saída do exercício
        livro.setDisponivel(false);
        
        // 3. Imprimindo a primeira linha (validação)
        livro.validarDisponibilidade();
        
        // 4. Criando as datas de teste (Usando a data atual para o teste)
        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataAtual, dataAtual);
        
        // 5. Imprimindo o resto do relatório esperado
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada().toString());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao().toString());
    }
}