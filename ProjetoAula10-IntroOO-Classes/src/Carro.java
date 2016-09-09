
public class Carro {
	//Características
	String marca;
	int quantidadePortas;
	String modelo;
	double valorAtual;
	boolean is0km;
	int velocidade;
	
	//Comportamentos
	public void acelerar(){
		velocidade++;
	}
	
	public void frear() {
		velocidade--;
	}
	
	//Ver detalhes
	public void imprimirDetalhes(){
		System.out.println("Marca: " + marca);
		System.out.println("Quantidade de Portas: " + quantidadePortas);
		System.out.println("Modelo: " + modelo);
		System.out.println("Valor atual FIP: " + valorAtual);
		System.out.println("Carro Zero?: " + is0km);
		System.out.println("Velocidade atual: " + velocidade);
		System.out.println("\n");
		
	}
}
