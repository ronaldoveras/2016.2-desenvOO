import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
    	System.out.println("Digite o ano de seu nascimento: ");
    	Scanner entradaAnoNascimento = new Scanner(System.in);
    	int anoNascimento = entradaAnoNascimento.nextInt();

    	System.out.println("Digite o ano atual: ");
    	Scanner entradaAnoAtual = new Scanner(System.in);
    	int anoAtual = entradaAnoAtual.nextInt();
    	
    	System.out.println("Sua idade é: " + (anoAtual - anoNascimento));
	}
}
