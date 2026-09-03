import animais.animal;

public class gato extends animal {
  
    public gato(String nome){
            super(nome);
        }
    public void miar(){
        System.out.printf("%s miando\n", getNome());
    }

}