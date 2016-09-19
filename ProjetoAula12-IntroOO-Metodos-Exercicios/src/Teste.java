

public class Teste {
	public static void main(String[] args) {
		//Criando o objeto de nome twitter e do tipo Tweet
		Tweet twitter = new Tweet();
		
//		//Atribuindo valores aos atributos 
//		//do objeto twitter
		twitter.nomeUsuario = "Thallita";
		twitter.twitterUsuario = "@realthallita";
		twitter.mensagemUsuario = "IoT é o assunto do momento, estudem e aprimorem seus projetos para IoT";
		
		//Chamando o método que imprime o tweet relativo
		//ao objeto twitter
		System.out.println(twitter.imprimirTwitter());
	}
	
}
