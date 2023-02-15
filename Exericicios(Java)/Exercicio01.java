

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta = "";
		do {
			int nota, media;
			System.out.println("Digite a primeira nota: ");
			nota = sc.nextInt();

			if (nota >= 20) {
				System.out.println("A metade desse numero: "+nota);

			} 
			System.out.println("Deseja continuar (s-sim ou n-não)?");
			resposta = sc.next();
		} while (resposta.equalsIgnoreCase("s"));
			System.out.println("FIM");
		sc.close();
	}
    }

