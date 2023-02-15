import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double sal, cons, valor, valortotal, desc;
		
		System.out.println("Qual é o salário Minimo?");
		sal = sc.nextDouble();
		System.out.println("Qual consumo de quilowatt da residencia?");
		cons = sc.nextDouble();

		valor = sal / 500;
		valortotal = valor * cons;
		desc = valortotal - (valortotal * 15) / 100;
		System.out.println("Quilowatt consumido será cobrado:" + valor);
		System.out.println("O valor da sua conta será: R$" + valortotal + ". \nTendo em vista seu consumo de " + cons);
		System.out.println("Com o desconto de 15%, o valor será de: R$" + desc);
		sc.close();
    }
}
