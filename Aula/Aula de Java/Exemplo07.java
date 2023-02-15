import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        final int qtdeAlunos = 5; //constante: não permite mudar o valor
        Scanner sc = new Scanner(System.in);
        double nota, media;
        int cont;
        
        cont = 1;
        media = 0;
        while(cont<=qtdeAlunos){
            System.out.println("Digite a proxima nota: ("+cont+"/"+qtdeAlunos+")");
            nota = sc.nextDouble();
            media = media+nota;
            cont++;
        }
        media = media / qtdeAlunos;
        System.out.println("Media: "+media);
        sc.close();
    }
}
