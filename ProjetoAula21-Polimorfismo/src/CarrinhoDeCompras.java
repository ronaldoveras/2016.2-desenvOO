public class CarrinhoDeCompras {
	
	private double total;
	
	public void adiciona(LivroFisico livro) {
		System.out.println("Adicionando: " + livro);
		total += livro.getValor(); 
	}

	public void adiciona(Ebook livro) {
		System.out.println("Adicionando: " + livro);
		total += livro.getValor(); 
	}
	
	public double getTotal() {
		return total;
	}
}