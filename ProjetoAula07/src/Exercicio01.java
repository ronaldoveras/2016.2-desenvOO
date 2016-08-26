import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		System.out.println("Digite o primeiro número: ");
		Scanner entradaNumeroUm = new Scanner(System.in);
		int numeroUm = entradaNumeroUm.nextInt();
		
		
		System.out.println("Digite o segundo número: ");
		Scanner entradaNumeroDois = new Scanner(System.in);
		int numeroDois = entradaNumeroDois.nextInt();
		
		int resultado = 0;
		if (numeroDois == 0){
			System.out.println("Não é possível realizar divisão por zero.");
		} else {
			resultado = numeroUm/numeroDois;
			System.out.println("O resultado da divisão é: " + resultado);
		}
	}
}
