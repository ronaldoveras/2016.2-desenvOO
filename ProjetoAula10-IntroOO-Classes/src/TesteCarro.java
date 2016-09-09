
public class TesteCarro {

	public static void main(String[] args) {
		Carro carroJetta = new Carro();
		carroJetta.marca="Volksvagen";
		carroJetta.is0km=true;
		carroJetta.modelo="Jetta";
		carroJetta.quantidadePortas=4;
		carroJetta.velocidade=50;
		carroJetta.valorAtual=50.000;
		carroJetta.imprimirDetalhes();
		
		carroJetta.frear();
		carroJetta.imprimirDetalhes();
		carroJetta.acelerar();
		carroJetta.acelerar();
		carroJetta.imprimirDetalhes();
	}

}
