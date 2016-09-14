
public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carroJetta = new Carro();
		carroJetta.ano = 2016;
		carroJetta.cor = "Preto";
		carroJetta.marca = "WK";
		carroJetta.modelo = "Jetta";
		carroJetta.potenciaMotor = 2.0;
		carroJetta.preco = 75.000;
		carroJetta.quantidadePassageiros = 5;
		carroJetta.velocidade = 50;
		System.out.println(carroJetta.velocidade);
		carroJetta.acelerar(10);
		carroJetta.acelerar(20);
		carroJetta.acelerar(100);
		System.out.println(carroJetta.velocidade);
		carroJetta.frear(100);
		System.out.println(carroJetta.velocidade);

		
		System.out.println(carroJetta.preco);
	}

}
