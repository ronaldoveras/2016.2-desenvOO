import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		System.out.println("Digite o dia do mês: ");
		Scanner entradaDia = new Scanner(System.in);
		int dia = entradaDia.nextInt();
		
		System.out.println("Digite o mês: ");
		Scanner entradaMes = new Scanner(System.in);
		int mes = entradaMes.nextInt();

		boolean isValido = ((dia > 0 && dia <=31)&&( mes >=1 && mes <=12))?true:false;
		System.out.println("O dia e o mes são validos? " + isValido);
		
	}

}
