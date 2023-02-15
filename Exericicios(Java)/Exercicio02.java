

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String resposta = "";
        Locale.setDefault(new Locale("pt", "BR"));

		do {
			int nota1, nota2, media;
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextInt();

            System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextInt();

            media = (int) (nota1 * 0.4 + nota2 * 0.6);
			if (media >= 6) {
				System.out.println("Aprovado ");
			} else{
                System.out.println("Reprovado");
            }

			System.out.println("Deseja continuar (s-sim ou n-não)?");
			resposta = sc.next();
		} while (resposta.equalsIgnoreCase("s"));
			System.out.println("FIM");
		sc.close();
    }
}
