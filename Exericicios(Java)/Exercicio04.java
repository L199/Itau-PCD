

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        double nota;

        System.out.println("Digite a nota: ");
        nota= sc.nextDouble();

        if(nota<7.0){
            if(nota>=5){
                System.out.println("Exame");
            }else{
                System.out.println("Repvoado");
            }
        }else{
            System.out.println("Aprovado");
        }
    }
}
