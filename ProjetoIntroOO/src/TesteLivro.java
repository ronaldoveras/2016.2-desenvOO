public class TesteLivro {

	public static void main(String[] args) {
		Livro livroJava = new Livro();
		livroJava.quantidadePaginas = 470;
		livroJava.titulo="Use a Cabeça -Java";
		livroJava.livroFisico=true;
		
		Autor autorJava = new Autor();
		autorJava.nome="KATHY";
		autorJava.sobrenome="SIERRA";
		
		livroJava.autor = autorJava;

		String tituloImpressao = livroJava.exibirInformacaoLivro("");
		System.out.println(tituloImpressao);
		
		Livro livroPyhton = new Livro();
		livroPyhton.titulo = "Python Fluente";
		
	}

}