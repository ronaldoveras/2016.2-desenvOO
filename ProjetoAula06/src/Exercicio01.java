import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		Scanner entradaNumero = new Scanner(System.in);
		int numero = entradaNumero.nextInt();

		if(numero >= 10){
			System.out.println("O número é maior ou igual a 10");
		} else {
			System.out.println("Número menor que 10");
		}
	}

}
