
public class Exercicio03 {

	public static void main(String[] args) {
		int totalColaboradores = 350;
		int totalAnalistas = 100;
		int totalChefes = 30;
		int totalProgramadores = 120; 
		int totalTecnicos = 100;
		
		double salarioAnalista = 4500;
		double salarioChefes = 8000; 
		double salarioProgramadores = 4000;
		double salarioTecnicos = 2000;  
		
		//letra A
		double valorTotalFolha = totalAnalistas*salarioAnalista + totalChefes*salarioChefes +
				totalProgramadores*salarioProgramadores + totalTecnicos*salarioTecnicos;
		System.out.println("O valor da folha é: " + valorTotalFolha);

		//letra B
		double mediaSalarial = (salarioAnalista + salarioChefes + salarioProgramadores
				+ salarioTecnicos)/4;
		System.out.println("A média salarial é de: " + mediaSalarial);
		//letra C
		double salarioMedio = valorTotalFolha/totalColaboradores;
		System.out.println("O salário médio é de: " + salarioMedio);
	}

}
