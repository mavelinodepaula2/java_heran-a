import animais.animal;
        
public class cachorro extends animal {

    public cachorro(String nome){
        super(nome);
    }
    
 public void latir(){
    System.out.printf("%s latindo\n", getNome());
 }
 public void correr(){
     System.out.printf("%s correndo\n", getNome());
 }

}