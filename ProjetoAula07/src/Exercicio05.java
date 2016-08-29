import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		System.out.println("Digite o numero do canal de TV: ");
		Scanner entradaCanal = new Scanner(System.in);
		int canal = entradaCanal.nextInt();
		
		if (canal == 513) {
			System.out.println("Rede Globo de Televisão");
		} else if (canal == 514){
			System.out.println("TV Cultura");
		} else if (canal == 512){
			System.out.println("Sistema Brasileiro de Televisão");
		} else if (canal == 511){
			System.out.println("TV Senado");
		} else if (canal == 510){
			System.out.println("TV Nova Nordeste");
		} else {
			System.out.println("Canal não identificado.");
		}
		

	}

}
