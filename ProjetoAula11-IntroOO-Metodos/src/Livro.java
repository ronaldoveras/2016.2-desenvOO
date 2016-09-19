
public class Livro {
	
	String titulo;
	Autor autor;
	double preco;
	String origem;
	String editora;
	int anoEdicao;
	String idioma;
	String ISBN;
	int quantidadePaginas;
	boolean livroFisico;
	
	private String imprimirTitulo(){
		return titulo;
	}
	
	public String exibirInformacaoLivro(String label){
		return label + imprimirTitulo();
	}
}