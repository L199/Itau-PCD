import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.println("InForme o valor limite: ");
        n=sc.nextInt();

        /* 
        for(int i=1;i<=n;i*=2)
        {   
            System.out.println("Sequência impressa: "+i);
        }*/

        int i=1;
        while(i<=n){
            if(i*2<=n){
                System.out.println(i+", ");
            }else{
                System.out.println(i);
            }
            i=i*2;
        }
    }
}
