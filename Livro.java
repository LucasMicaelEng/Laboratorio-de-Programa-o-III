package Biblioteca;

//@author Lucas Micael - 831085

public class Livro {

    static void setNome(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Atributos
    private int idLivro;
    private String titulo;
    private String autor;
    private String edicao;
    private String editora;
    private String cidade;
    private int anoPublicacao;
    
    public Livro(){
    }
    
    //Construtor
    public Livro(int idLivro, String titulo, String autor, String edicao, String editora, String cidade, int anoPublicacao) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.cidade = cidade;
        this.anoPublicacao = anoPublicacao;
    }
    
    //Getter e Setter
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    //toString
    @Override
    public String toString() {
        return 
                "idLivro: " + getIdLivro() + "\n" +
                "Tirulo: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "Edição:" + getEdicao() + "\n" + 
                "Editora: " + getEditora() + "\n" + 
                "Cidade: " + getCidade() + "\n" + 
                "Ano de Publicação: " + getAnoPublicacao() + "\n";
    }

    void getIdLivro(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
