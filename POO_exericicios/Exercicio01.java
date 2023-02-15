package POO_exericicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        numero(n1);
        sc.close();
        /*
        int resultado;
        resultado =numero(6); 
        System.out.println(resultado);*/

    }

    static int numero(int n1){
        if(n1 % 2 == 0){
        System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
        return n1;
    }
}
