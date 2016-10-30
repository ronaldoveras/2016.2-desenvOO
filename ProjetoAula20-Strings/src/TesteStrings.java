
public class TesteStrings {

	public static void main(String[] args) {
//		String s = new String("Fulano");
//		String t = new String("Fulano");
		
//		String s = "Fulano";
//		String t = "Fulano";
//		boolean igual = (s == t);

		//Cria dois novos Strings 
		String s1 = "George"; 
		String s2 = "George";

		// Nesse momento, s1==s2 é verdadeiro!
		    
		s1 = s1 + " Bush"; // Cria um novo string e o atribui para s1
		s2 = s2 + " Bush"; // Cria um novo string e o atribui para s2
		    
		if (s1 == s2) {
		  System.out.println("s1 e s2 são os mesmos objetos.");
		} else {
		  System.out.println("s1 e s2 NAO são os mesmos objetos.");
		}    
		if (s1.equals(s2)) {
		  System.out.println("s1 e s2 possuem o mesmo conteúdo.");
		} else {
		  System.out.println("s1 e s2 NAO possuem o mesmo conteúdo.");
		}
		
		String str = "TI Expert";
		System.out.println("O tamanho da String é: " + str.length());
		System.out.println("O caracter da posição 3 é: " + str.charAt(3));
		String endereco = "http://www.tiexpress.net";
		if(endereco.startsWith("http")){
			System.out.println("O endereço é de uma URL HTTP");
		}
		
		if(endereco.startsWith("www",7)){
			System.out.println("O endereço é de uma página web");
		}

		if(endereco.endsWith("br")){
			System.out.println("O endereço é registrado no Brasil");
		} else {
		    System.out.println("O endereço não é registrado no Brasil");
		}
	}

}
