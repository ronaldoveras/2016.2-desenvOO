import java.util.Scanner;

public class Exercicio05Switch {

	public static void main(String[] args) {
		System.out.println("Digite o numero do canal de TV: ");
		Scanner entradaCanal = new Scanner(System.in);
		int canal = entradaCanal.nextInt();
		
		switch (canal) {
		case 513:
			System.out.println("Rede Globo de Televisão");
			break;
		case 514:
			System.out.println("TV Cultura");
			break;
		case 512:
			System.out.println("Sistema Brasileiro de Televisão");
			break;
		case 511:
			System.out.println("TV Senado");
			break;
		case 510:
			System.out.println("TV Nova Nordeste");
			break;
		default:
			System.out.println("Canal não identificado.");
			break;
		}

	}

}
