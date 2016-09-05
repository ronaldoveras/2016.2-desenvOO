import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.println("Digite o numero: ");
		Scanner entradaFatorial = new Scanner(System.in);
		int numero = entradaFatorial.nextInt();
		int fatorial = numero;
		for (int i = numero - 1; i > 0; i--) {
			fatorial = fatorial*i;
		}
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}

}
