
public class Exercicio01 {

	public static void main(String[] args) {
		float preco = 52f;
		float percentual = 20;
		float valorDesconto = preco*(percentual/100);
		System.out.println("Valor do Desconto: " + valorDesconto);
		System.out.println("valor Final do Produto: " + (preco - valorDesconto));

	}

}
