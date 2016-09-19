

public class ControleVeterinaria {
	public static void main(String[] args) {

		Cao caoPitibull = new Cao();
		caoPitibull.nome="Capeta";
		caoPitibull.idade=2;
		caoPitibull.raca="Pitibull";
		detalharCao(caoPitibull);
		
		Cao caoPoodle = new Cao();
		caoPoodle.nome="Bob";
		caoPoodle.raca="Poodle";
		caoPoodle.idade=3;
		detalharCao(caoPoodle);

		Veterinario veterinario = new Veterinario();
		veterinario.nome="João";

		if(!caoPitibull.vacinado){
			veterinario.vacinarCao(caoPitibull);
		}
		if(!caoPoodle.vacinado) {
			veterinario.vacinarCao(caoPoodle);
		}

		detalharCao(caoPitibull);
		detalharCao(caoPoodle);
	}

	private static void detalharCao(Cao cao) {
		System.out.println("Nome do cão: " + cao.nome);
		System.out.println("Está vacinado:  " + cao.vacinado);
	}
}
