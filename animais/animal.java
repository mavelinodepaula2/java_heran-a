package animais;

public class animal {
    private String nome;

      public animal(String nome){
        this.nome = nome;
    }

    public void comer(){
       System.out.printf("%s comendo\n", nome);
    }
    public void agua(){
        System.out.printf("%s tomando água\n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
    