public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		Livro fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Livro ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		((Ebook) ebook).setWaterMark("Marca dágua");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(fisico);
		carrinho.adiciona(fisico);

		carrinho.adiciona(ebook);
		System.out.println("Total " + carrinho.getTotal());	
		System.out.println("Total LV: " + carrinho.contadorLivroFisico);
		System.out.println("Total Ebook: " + carrinho.contadorEbook);
		
	}
}