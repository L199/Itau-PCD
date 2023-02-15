

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float Salario,Desconto=(float) 0.0;

    System.out.println("Exercicio 11\nDigite seu salario:");
    Salario=sc.nextFloat();

    if(Salario <= 600){
        System.out.println("Isento.");
    }
    else if(Salario > 600 && Salario <= 1200){
        Desconto+= (0.2*Salario);
        System.out.println ("O desconto do INSS sera de R$ %.2f reais."+Desconto);
    }
    else if(Salario > 1200 && Salario <= 2000){
        Desconto+= (0.25*Salario);
        System.out.println("O desconto do INSS sera de R$ %.2f reais."+Desconto);
    }
    else
    {
        Desconto+= (0.3*Salario);
        System.out.println("O desconto do INSS sera de R$ %.2f reais."+Desconto);
    }
    }
}
