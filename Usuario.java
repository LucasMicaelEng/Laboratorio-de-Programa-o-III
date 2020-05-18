package Biblioteca;

//@author Lucas Micael - 831085

public class Usuario {
    
    //Atributos
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    
    public Usuario(){
    }
    
    //Construtor
    public Usuario(int idUsuario, String nome, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    //Gettre e Setter
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //toString
    @Override
    public String toString() {
        return "idUsuario: " + getIdUsuario() + "\n" +
                "Nome: " + getNome() + "\n" +
                "E-Mail: " + getEmail() + "\n" +
                "Senha: " + getSenha() + "\n";
    }

    Usuario get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean contains(String pesquisa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
