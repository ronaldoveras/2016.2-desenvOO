import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		System.out.println("Digite o primeiro número: ");
		Scanner entradaNumeroUm = new Scanner(System.in);
		int numeroUm = entradaNumeroUm.nextInt();
		
		
		System.out.println("Digite o segundo número: ");
		Scanner entradaNumeroDois = new Scanner(System.in);
		int numeroDois = entradaNumeroDois.nextInt();
		

		System.out.println("Digite a operação: ");
		Scanner entradaOperacao = new Scanner(System.in);
		String operacao = entradaOperacao.next();

	    	switch (operacao.charAt(0)) {
			case '+':
				System.out.println(numeroUm + numeroDois);
				break;
			case '-':
				System.out.println(numeroUm - numeroDois);
				break;
			case '*':
				System.out.println(numeroUm * numeroDois);
				break;
			case '/':
				System.out.println(numeroUm / numeroDois);
				break;
		}
	}
}
