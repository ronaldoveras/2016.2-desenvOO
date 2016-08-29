import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de horas aulas no mês: ");
		Scanner entradaHoraAula = new Scanner(System.in);
		float horaAulaMes = entradaHoraAula.nextFloat();
		
		float valorHoraAula = 150.00f;
		float percentualINSS = 0.15f;
		float valorSalarioBruto = horaAulaMes*valorHoraAula;
		float descontoINSS = valorSalarioBruto*percentualINSS;
		float valorSalarioLiquido  = 0;
		if(descontoINSS > 500){
			descontoINSS = 500;
		}
		valorSalarioLiquido = valorSalarioBruto - descontoINSS;
		System.out.println("Salário do professor Brasileiro: " + valorSalarioLiquido);
	}

}
