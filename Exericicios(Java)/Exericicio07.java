

import java.util.Scanner;

public class Exericicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        boolean valida;
        System.out.println("Inme a senha: ");
        senha = sc.nextLine();
        valida = senha.equals("R10p5");

        if(valida){
            System.out.println("Acesso Concedido");
        }else{
            System.out.println("Acesso negado");
        }
        /* 
        if(senha.equals("R10p5")) {

            aprovado = true;
            
            System.out.println("Acesso Concedido");
            
            } else {
            
            aprovado = false;
            
            System.out.println("Acesso negado");
            
            }*/
            
    }
}
