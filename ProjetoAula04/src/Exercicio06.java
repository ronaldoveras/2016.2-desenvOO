import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		System.out.println("Digite o tempo da viagem: ");
		Scanner entradaTempo = new Scanner(System.in);
		int tempo = entradaTempo.nextInt();
		
		System.out.println("Digite a velocidade média: ");
		Scanner entradaVelocidade = new Scanner(System.in);
		int velocidade = entradaVelocidade.nextInt();

		int distancia = tempo*velocidade;
		float litros = distancia/12;
		System.out.println("A quantidade de litros para a viagem é: " + litros);

	}
}
