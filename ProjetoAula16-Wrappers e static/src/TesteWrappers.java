
public class TesteWrappers {

	public static void main(String[] args) {

		//Esse assunto está no nosso livro (Cap 10 - Seção 10.2)
		//Tipos primitivos Java
		int valorInteiro = 10;
		double valorPiDouble = 3.1415;
		float valorPiFloat = 3.1415f;
		long valorLong = 16787687l;
		char valorChar = '@';
		
		//Para cada um deles, temos classes que 
		//representam esses primitivos
		Integer objetoInteiro = new Integer(10);
		Double objetoDouble = new Double(valorPiDouble);
		Float objetoFloat = new Float(3.1415f);
		Long objetoLong = new Long(16787687l);
		Character objetoCaracter = new Character('@');
		
		Character character = new Character('a');
	    Character character1 = '\'';
	    //Nessas classes há métodos que podemos utilizar 
	    //para realizar algumas operações:
	    
	    //1. Testar se um caracteres faz parte do alfabeto
	    System.out.println(Character.isAlphabetic(character));
	    //2. Testar se é um dígito 
	    System.out.println(Character.isDigit(character1));
	    //3. Transformar um caracter de minusculo para maiúsculo.
	    System.out.println(Character.toUpperCase(character));
	    //4. Testar se o caractere pode ser usado como inicio de 
	    //um identificador Java - Valores válidos: letras, $, _
	    System.out.println(Character.isJavaIdentifierStart(character1));

	    //Veja mais em: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

		//Convertendo valores String para números.
		int novo_int = Integer.parseInt("10");
		
		//Outras operações 
		System.out.println(Integer.MAX_VALUE);
		int valorExcedente = 2147483647;
		Integer novoInteger = Integer.valueOf(10);
		System.out.println(novoInteger.BYTES);
		System.out.println(novoInteger.floatValue());
		//Ver mais em: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
		
		//Boxing e unboxing (A partir do Java 5)
		//1. Boxing - converter diretamente um valor primitivo
		// para um objeto do mesmo Tipo
		Boolean b1 = true;
		
		//2. Unboxing - converter diretamente de um objeto para
		//um tipo primitivo.
		boolean b2 = b1;
		
	}

}
