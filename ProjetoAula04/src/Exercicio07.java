import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		System.out.println("Digite o valor do salário mínimo: ");
		Scanner entradaMinimo = new Scanner(System.in);
		int minimo = entradaMinimo.nextInt();
		
		float valor100Kw = minimo/7;
		
		System.out.println("Digite a quantidade de quilowatts: ");
		Scanner entradaQuilowatts = new Scanner(System.in);
		int quilowatts = entradaQuilowatts.nextInt();
		
		float valor1Kw = valor100Kw/100;
		System.out.println("O valor de 1 quilowatt é: " + valor1Kw);

		float valorPagar = valor1Kw*quilowatts;
		System.out.println("O valor a ser pago é: " + valorPagar);
	}
}
