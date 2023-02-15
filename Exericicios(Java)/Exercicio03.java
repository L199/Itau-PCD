

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));
		String resposta = "";
        
		do {
			float Salario_Bruto, Valor_Prestacao, Resultado;
			System.out.println("Digite o valor do salário: ");
			Salario_Bruto = sc.nextFloat();

            System.out.println("Valor da prestacao: ");
			Valor_Prestacao = sc.nextInt();
            Resultado = (float) (Salario_Bruto*0.30);
           System.out.println("Valor máximo para prestação: "+Resultado);
			if (Valor_Prestacao<=Resultado) {
				System.out.println("Emprestimo Concedido ");
			} else{
                System.out.println("Emprestimo Negado");
            }

			System.out.println("Deseja continuar (s-sim ou n-não)?");
			resposta = sc.next();
		} while (resposta.equalsIgnoreCase("s"));
			System.out.println("FIM");
		sc.close();
    }
}
