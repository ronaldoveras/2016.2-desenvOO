import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		System.out.println("Digite primeiro lado: ");
		Scanner entradaPrimeiroLado = new Scanner(System.in);
		int lado1 = entradaPrimeiroLado.nextInt();

		System.out.println("Digite segundo lado: ");
		Scanner entradaSegundoLado = new Scanner(System.in);
		int lado2 = entradaSegundoLado.nextInt();

		System.out.println("Digite terceiro lado: ");
		Scanner entradaTerceiroLado = new Scanner(System.in);
		int lado3 = entradaTerceiroLado.nextInt();

		if((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)){
			System.out.println("Triângulo Equilátero");
		} else if((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
			System.out.println("Triãngulo Escaleno");
		} else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
			System.out.println("Triângulo Isosceles");
		}
	}
}
