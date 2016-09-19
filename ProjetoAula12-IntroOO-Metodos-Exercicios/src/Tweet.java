

public class Tweet {
	String nomeUsuario;
	String twitterUsuario;
	String mensagemUsuario;

	public String imprimirTwitter(){
		String retorno = null;
		retorno = nomeUsuario + twitterUsuario + "\n" + mensagemUsuario;
		return retorno;
	
	}
}
