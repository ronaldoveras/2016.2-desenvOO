
public class TesteComparacao {

	public static void main(String[] args) {

		Autor autor1 = new Autor();
		autor1.setNome("Ronaldo");
		autor1.setEmail("ronaldo@aeso.br");
		autor1.setCpf("00988876662");

		Autor autor2 = new Autor();
		autor2.setNome("Ronaldo");
		autor2.setEmail("ronaldo@aeso.br");
		autor2.setCpf("00988876662");

		// Comparando objetos do mesmo tipo.
		if (autor1.equals(autor2)) {
			System.out.println("autor1 = autor2 -> Iguais");
			System.out.println(autor1.getNome());
			System.out.println(autor2.getNome());
		} else {
			System.out.println("autor1 = autor2 -> Diferentes");
		}

		// Comparando objetos da mesma classe mas
		// com valores diferentes.
		autor2.setNome("Paulo");
		if (autor1.equals(autor2)) {
			System.out.println("autor1 = autor2 -> Iguais");
			System.out.println(autor1.getNome());
			System.out.println(autor2.getNome());
		} else {
			System.out.println("autor1 = autor2 -> Diferentes");
		}

		// Comparando objetos de tipos diferentes (Autor e String).
		if (autor1.equals("João")) {
			System.out.println("autor1 = autor2 -> Iguais");
			System.out.println(autor1.getNome());
			System.out.println(autor2.getNome());
		} else {
			System.out.println("autor1 = autor2 -> Diferentes");
		}

	}

}
