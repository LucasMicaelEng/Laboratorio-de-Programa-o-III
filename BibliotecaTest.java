package Biblioteca;

//@author Lucas Micael - 831085

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class BibliotecaTest {
    
    public static void main(String[] args) {
        
        //USUARIOS
        List<Usuario> usuario = new ArrayList<>();
        Usuario user = new Usuario();

        //Cadastrar novos Usuarios
        usuario.add(new Usuario(1, "João", "joao@hotmail.com", "joao"));
        usuario.add(new Usuario(2, "Maria", "maria@hotmail.com", "maria"));
        usuario.add(new Usuario(3, "Jose", "jose@hotmail.com", "jose"));
        usuario.add(new Usuario(4, "Carlos", "carlos@hotmail.com", "carlor"));
        usuario.add(new Usuario(5, "Ana Carolina", "ana@hotmail.com", "ana"));
        usuario.add(new Usuario(6, "Antonio", "antonio@hotmail.com", "antonio"));
        usuario.add(new Usuario(7, "Frederico", "frederico@hotmail.com", "frederico"));
        usuario.add(new Usuario(8, "Antonio", "antonio@hotmail.com", "antonio"));
        usuario.add(new Usuario(9, "Lucas", "lucas@hotmail.com", "lucas"));
        usuario.add(new Usuario(10, "Sara", "sara@hotmail.com", "sara"));
        
        
        //LIVROS
        List<Livro> livro = new ArrayList<>();
        Livro book = new Livro();
        
        //Adicionar novos Livros
        livro.add(new Livro(1, "Pequeno Principe" , "Antoine de Saint-Exupéry", "3ª Edição", "AGIR", "Paris", 1943));
        livro.add(new Livro(2, "Em Algum Lugar nas Estrelas", "Clare Vanderpool", "1ªEdição", "Darkside Books", "Wichita", 2013));
        livro.add(new Livro(3, "Paraiso Perdido", "John Milton", "1ªEdição", "Darkside Books", "Londres" , 1667));
        livro.add(new Livro(4, "Alice no País das Maravilhas","Lewis Carroll","1ªEdição", "Darkside Books", "Reino Unido", 1865));
        livro.add(new Livro(5, "A Arte da Guerra", "Sun Tzu", "1ªEdição", "Jardim dos Livros", "China", 2008 ));
        livro.add(new Livro(6, "O Ar que ele Respira", "Brittainy C. Cherry", "1ªEdição", "Record", "Estados Unidos", 2015));
        livro.add(new Livro(7, "Os Treze Os Treze Porquês", "Jay Asher", "1ªEdição", "Ática", "Estados Unidos", 2009));
        livro.add(new Livro(8, "Donnie Darko", "Jake Gyllenhaal e Richard Kelly", "1ªEdição", "Darkside Books", "Estados Unidos", 2001));
        livro.add(new Livro(9, "A Garota do Lago" , "Charlie Donlea", "1ª Edição", "Faro", "Estados Unidos", 2016));
        livro.add(new Livro(10, "Drácula" , "Bram Stoker", "1ª Edição", "Darkside Books", "Inglaterra", 1897));
        livro.add(new Livro(11, "Sherlock Holmes" , "Arthur Conan Doyle", "1ª Edição", "HarperCollins Brasil", "Inglaterra", 1887));
        livro.add(new Livro(12, "Um Mar De Segredos" , "Catherine Steadman", "1ª Edição", "Record", "Estados Unidos", 2017));
        livro.add(new Livro(13, "Stranger Things", "Gwenda Bond e Stephanie Fernandes", "1ª Edição", "intrínseca", "Estados Unidos", 2019));
        livro.add(new Livro(14, "Dama Da Névoa" , "Laura Sebastian", "1ª Edição", "Arqueiro", "Estados Unidos", 2020));
        livro.add(new Livro(15, "O Rei Perverso" , "Holly Black", "1ª Edição", "Record", "Estados Unidos", 2020));


        //EMPRESTIMOS
        List<Emprestimo> emprestimo = new ArrayList<>();
        Emprestimo Emp = new Emprestimo();
        
        //Manipulação com ArrayList para FAZER EMPRESTIMOS DE LIVRO
        emprestimo.add(new Emprestimo(2, 4, 1, false));
        emprestimo.add(new Emprestimo(1, 5, 4, false));
        emprestimo.add(new Emprestimo(3, 10, 15, true));
        
        //ArrayList LIVROS DEVOLVIDOS
        List<LivrosDevolvidos> devolvido = new ArrayList<>();
        LivrosDevolvidos Dev = new LivrosDevolvidos();
        
        //Manipulação com ArrayList PARA DEVOLUÇÃO
        devolvido.add(new LivrosDevolvidos("O Ar que ele Respira"));
        devolvido.add(new LivrosDevolvidos("Donnie Darko"));
        devolvido.add(new LivrosDevolvidos("A Garota do Lago"));
        devolvido.add(new LivrosDevolvidos("Drácula"));
        devolvido.add(new LivrosDevolvidos("Sherlock Holmes"));
        devolvido.add(new LivrosDevolvidos("Um Mar De Segredos"));

        
        Scanner entrada = new Scanner(System.in);
        int op;
        
        do{
            
        System.out.println("1 - Pesquisar Usuario Pelo Nome");
        System.out.println("2 - Listar Todos os Usuarios");
        System.out.println("3 - Pesquisar Livro pelo Titulo");
        System.out.println("4 - Listar todos os Livro");
        System.out.println("5 - Realizar Emprestimos");
        System.out.println("6 - Listar Livros Emprestados");
        System.out.println("7 - Listar Livros Devolvidos");
        System.out.println("0 - SAIR");
        System.out.println("DIGITE UMA OPÇÃO: ");
        op = entrada.nextInt();
        
            switch(op){

            case 1:{  
            //Pesquisar Usuario
             System.out.println("Digite o Nome do Usuario para Pesquisa: ");          
             Scanner input = new Scanner(System.in);  
             user.setNome(input.nextLine());
          
                for(int i = 0; i < usuario.size(); i ++)
                  {     
                     if(usuario.get(i).getNome().equals(user.getNome()))
                      {         
                        System.out.println("\n" + usuario.get(i) + "\n");
                      }
                  }
            }break;
 
                
            case 2:{
            //Listar todos os Usuarios
             for(Usuario f: usuario){
                System.out.println(f);
            }
            }break;
                
                
            case 3:{
            //Pesquisar Livro
            System.out.println("Digite o Titulo do Livro para Pesquisa: ");          
            Scanner input = new Scanner(System.in);  
            book.setTitulo(input.nextLine());
          
                for(int i = 0; i < livro.size(); i ++)
                {     
                     if(livro.get(i).getTitulo().equals(book.getTitulo()))
                    {         
                        System.out.println("\n" + livro.get(i) + "\n");
                    }
                }
            }break;
                
               
            case 4:{
            //Listar todos os Livros
             for(Livro a: livro){
                System.out.println(a);
            }
            }break;

            case 5:{
            //Realizar Emprestimo
            Scanner input = new Scanner(System.in); 
            System.out.println("Digite o Titulo do Livro: ");          
            book.setTitulo(input.nextLine());
            
            //Usuario para o Emprestimo
            System.out.println("Digite o Nome do Usuario: ");          
            user.setNome(input.nextLine());

            for(int i = 0; i < livro.size(); i ++)
                {     
                    if(livro.get(i).getTitulo().equals(book.getTitulo()))
                    {         
                        System.out.println("\n" + livro.get(i));
                    }
                }
   
            for(int i = 0; i < usuario.size(); i ++)
                {     
                    if(usuario.get(i).getNome().equals(user.getNome()))
                    {         
                        System.out.println("\n" + usuario.get(i) + "\n");
                    }
                }
                
            //Data do Emprestimo
            System.out.println("Data do Emprestimo:");
            LocalDate localDate = LocalDate.now();
            System.out.println(localDate);
            System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
            System.out.println("Mes: " + localDate.getMonthValue());
            System.out.println("Mes: " + localDate.getMonth().name());       
            System.out.println("Ano: " + localDate.getYear()+ "\n");
        
            //Data da Devolução
            System.out.println("Data da Devolução:");
            LocalDate dataManipulacao = LocalDate.now();
            //Limite de 10 dias para a devolução
            System.out.println("Devolução: " + dataManipulacao.plusDays(10));
            System.out.println("Data Original: " + dataManipulacao + "\n");
            
            System.out.println("Emprestimo Realizado com Sucesso...." + "\n");
            }break;
            
            
            case 6:{
            //Listar todos os Emprestimos
            for(Emprestimo l: emprestimo){
                System.out.println(l);
            }
            }break;
            
            
            case 7: {
            //Listar Livros Devolvidos
            for(LivrosDevolvidos w: devolvido){
                System.out.println(w);
            }
            }break;
            
            default:
                System.out.println("Digite SOMENTE números entre 1 e 7");
                break;
        }
        }while (op != 0);
        
    }
}
