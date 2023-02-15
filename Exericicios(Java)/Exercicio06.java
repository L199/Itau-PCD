import java.text.Format;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabulada, cont;
        
        System.out.println("Qual  a tabuada? ");
        tabulada = sc.nextInt();

        cont =0;
        while(cont<11){
           // System.out.println(tabulada+" x "+cont+" = "+(tabulada*cont));
           System.out.printf("%d x 2%d = 2%d\n",tabulada,cont,(tabulada*cont) );
            cont++;
        }
        sc.close();
    }
}
