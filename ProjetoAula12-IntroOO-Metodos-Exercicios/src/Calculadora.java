

public class Calculadora {
	
	float operando1;
	float operando2;
	char operacao;
	
	public void realizarOperacao(){
		switch (operacao) {
		case '+':
			System.out.println("Soma : " + (operando1 + operando2));
			break;
		case '-':
			System.out.println("Subtração : " + (operando1 - operando2));
			break;
		case '*':
			System.out.println("Multiplicação : " + (operando1 * operando2));
			break;
		case '/':
			System.out.println("Divisão : " + (operando1 / operando2));
			break;
		default:
			System.out.println("Nenhuma operação foi realizada");
			break;
		}
	}
}
