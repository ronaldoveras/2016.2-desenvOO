
public class Livro {
	String nome;
	int quantiadadePaginas;
	Autor autor;
	private float preco;
	
	public Livro(Autor autor) {
		this.autor = autor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if(preco < 10){
			System.out.println("Não é possível atribuir esse valor");
		} else {
			this.preco = preco;
		}
	}
	
	public void aplicarDesconto(float desconto){
		if(desconto <= 0.3f){
			this.preco = this.preco - this.preco*desconto;
		} else {
			System.out.println("Não foi possível aplicar o desconto");
		}
	}
	
}
