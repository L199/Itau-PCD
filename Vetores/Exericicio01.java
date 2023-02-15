package Vetores;

import java.util.Scanner;

public class Exericicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int Qtde_nomes =3;
        String nome[]= new String[3];

        for(int i=0;i<nome.length;i++){
            
            System.out.printf("Digite o %d nome: ",i+1);
            nome[i]= sc.nextLine();
        }
        System.out.println("Nomes lidos: ");
        for(int i= nome.length -  1; i>=0;i--){
            System.out.println("Nome: "+nome[i]);
        }
        sc.close();

    }
}
