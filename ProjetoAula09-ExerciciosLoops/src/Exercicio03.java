import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o número:");
		int numero = scan.nextInt();

		boolean ehPrimo = true;
		for(int j = 2; j < numero; j++){
			if(numero%j == 0){
				ehPrimo = false;
				break;
			}
		}
		if(ehPrimo){
			System.out.println("Número Primo");
		} else {
			System.out.println("Número não é primo");
		}
	}
}
