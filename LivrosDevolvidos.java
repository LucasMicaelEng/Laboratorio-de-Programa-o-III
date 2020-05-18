package Biblioteca;

//@author Lucas Micael - 831085

public class LivrosDevolvidos extends Livro{
    
    //Atributos
    private String liv;
    
    public LivrosDevolvidos(){
    }
    
    //Construtor

    public LivrosDevolvidos(String liv) {
        this.liv = liv;
    }
    
    //Getter e Setter

    public String getLiv() {
        return liv;
    }

    public void setLiv(String liv) {
        this.liv = liv;
    }
    
    //toString
    @Override
    public String toString() {
        return 
                "Livro Devolvido: " + getLiv() + "\n";
    }
    
}
