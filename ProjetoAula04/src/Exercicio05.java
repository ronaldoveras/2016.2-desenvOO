import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

    	System.out.println("Digite o nome do Correntista:");
    	Scanner entradaNome = new Scanner(System.in);
    	String nomeCorrentista = entradaNome.nextLine();
    	
    	System.out.println("Digite o saldo (Formato do valor informado:2,54): ");
    	Scanner entradaSaldo = new Scanner(System.in);
    	float saldo = entradaSaldo.nextFloat();

    	System.out.println("Digite o valor que será debitado(Formato do valor informado:2,54): ");
    	Scanner entradaDebito = new Scanner(System.in);
    	float debito = entradaDebito.nextFloat();
    	
    	float saldoPos = saldo - debito;
    	System.out.println("Correntista " + nomeCorrentista + ", seu saldo atual é R$ " + saldoPos);

		
	}
}
