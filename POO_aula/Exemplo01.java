package POO_aula;

public class Exemplo01 {
    public static void main(String[] args) {
        int quatidade =1;
        linha(quatidade);
        //linha(5);
        System.out.println("Bom dia");
        linha(1); //quantiades 
        linha2(1, '*'); //quantos qualquer colocar exemplo '*'
        linha3("pi", '='); //quantidades letras
       // linha(5);
    }
    
    static void linha(int tamanho){
        for(int i=0;i<tamanho;i++){
            System.out.println("-");
    }
    System.out.println();
    }

    static void linha2(int tamanho, char simbolo){
        for(int i=0;i<tamanho;i++){
            System.out.println(simbolo);
    }
    System.out.println();
    }

    static void linha3(String mensagem, char simbolo){
      //System.out.println(mensagem);
        for(int i=0;i<mensagem.length();i++){
            System.out.println(simbolo);
    }
         System.out.println();
    }
    
    
}
