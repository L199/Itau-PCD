package POO_exericicios;

import java.util.Scanner;

public class Exericicio02 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite 3 valores inteiro: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        System.out.println("Menor = "+menor(n1, n2, n3));
        sc.close();

        /*
        System.out.println("É menor: "+menor(1, 2, 3));
        System.out.println("É menor: "+menor(3, 2, 1));
        System.out.println("É menor: "+menor(3, 1, 2));*/
    }

    static int menor(int n1, int n2, int n3){

        int numMenor;
        numMenor=n1;

        if(n2<numMenor){
            numMenor =n2;
        }
        if(n3<numMenor){
            numMenor=n3;
        }
        return numMenor;
        /* 
        if(n1<=n2&&n2<=n3){
            return n1;
        }else{
            if(n2<=n1&&n2<=n3){
                return n2;
            }else{
                return n3;
            }
        }*/

      
    }
}
