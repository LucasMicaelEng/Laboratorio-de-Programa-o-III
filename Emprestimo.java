package Biblioteca;

//@author Lucas Micael - 831085 

public class Emprestimo {
    
    //Atributos
    private int idEmprestimo;
    private int idUsuario;
    private int idLivro;
    private boolean devolvido;
    
    public Emprestimo(){
    }
    
    //Construtor
    public Emprestimo(int idEmprestimo, int idUsuario, int idLivro, boolean devolvido) {
        this.idEmprestimo = idEmprestimo;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.devolvido = devolvido;
    }
    
    //Getter e Setter
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    
    //toString
    @Override
    public String toString() {
        return 
                "Id Emprestimo: " + getIdEmprestimo() + "\n" + 
                "Id Usuario: " + getIdUsuario() + "\n" +
                "Id Livro: " + getIdLivro() + "\n" +
                "Devolvido: " + isDevolvido() + "\n";
    }
    
    
    
}
