
public class Carro {

		
		String marca;
		Double preco;
		String modelo;
		int ano;
		String cor;
		int quantidadePassageiros;
		Double potenciaMotor;
		int velocidade;
	
		public void acelerar(int aceleracao) {
			velocidade = velocidade + aceleracao;
		}
		
		public void frear(int reducao){
			velocidade -= reducao;
		}
}
