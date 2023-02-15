package POO_aula;

public class Exemplo02 {
    public static void main(String[] args) {
        int calculo;
        
       calculo= soma(5, 5);
        System.out.println("A soma: "+calculo);
    }
    static int soma(int n1,int n2){
        int resultado;

        resultado = n1+n2;

        return resultado;

          }
}
