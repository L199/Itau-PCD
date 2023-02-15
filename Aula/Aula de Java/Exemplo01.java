import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float a,b,media;
        
        System.out.println("Digite sua 1ª nota:: ");
        a=sc.nextFloat();
        System.out.println("Digite sua 2ª nota:: ");
        b=sc.nextFloat();

        media = (a+b)/2;
        System.out.printf("Sua média é "+media);
    }
}
