public class CarrinhoDeCompras {
	
	private double total;
	public int contadorLivroFisico;
	public int contadorEbook;
//	public void adiciona(LivroFisico livro) {
//		System.out.println("Livro Fisico");
//		System.out.println("Adicionando: " + livro);
//		total = total + livro.getValor(); 
//	}
//
//	public void adiciona(Ebook livro) {
//		System.out.println("Ebook");
//		System.out.println("Adicionando: " + livro);
//		total += livro.getValor(); 
//	}

	public void adiciona(Livro livro) {
		if(livro instanceof LivroFisico){
			contadorLivroFisico += 1;
		}
		if(livro instanceof Ebook){
			System.out.println(((Ebook)livro).getWaterMark());
			contadorEbook +=1;
		}
		System.out.println("Adicionando: " + livro);
		total = total + livro.getValor(); 
	}

	public double getTotal() {
		return total;
	}
}