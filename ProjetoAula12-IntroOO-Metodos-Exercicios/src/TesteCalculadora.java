

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadoraSoma = new Calculadora();
		calculadoraSoma.operacao = '+';
		calculadoraSoma.operando1 = 10.0f;
		calculadoraSoma.operando2 = 2.0f;
		calculadoraSoma.realizarOperacao();

	}

}
