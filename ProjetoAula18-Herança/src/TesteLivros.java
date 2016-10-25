
public class TesteLivros {

	public static void main(String[] args) {
		LivroFisico livro = new LivroFisico("Rodrigo Turini");
		livro.setDescricao("Um bom livro de Java e OO para iniciantes");
		livro.setIsbn("34566");
		livro.setNome("Desbravando Java e Orientação a Objetos");
		livro.setValor(67.90);

		System.out.println(livro);
		
		Ebook meuEbook = new Ebook("Rodrigo Turini");
		meuEbook.setDescricao("Fundamental para Java");
		meuEbook.setIsbn("11122");
		meuEbook.setNome("Head First Java");
		meuEbook.setValor(89.21);
		System.out.println(meuEbook);

	}

}
