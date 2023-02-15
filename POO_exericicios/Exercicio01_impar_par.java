package POO_exericicios;

import java.util.Scanner;

public class Exercicio01_impar_par {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        par(n1);
        sc.close();
    }

    static void par(int valor){
        int sobra;

        sobra=valor%2;
        if(sobra % 2 == 0){
        System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
        
    }
}
