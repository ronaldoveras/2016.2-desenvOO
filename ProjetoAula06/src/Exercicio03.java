import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Digite o valor do número: ");
		Scanner entradaNumero = new Scanner(System.in);
		int numero = entradaNumero.nextInt();
		
		if (numero%2==0){
			System.out.println("Número é par");
		} else {
			System.out.println("Número é ímpar");
		}
	}
}
