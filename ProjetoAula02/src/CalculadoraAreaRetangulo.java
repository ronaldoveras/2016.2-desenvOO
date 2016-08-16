
public class CalculadoraAreaRetangulo {

	public static void main(String[] args) {
		int base = 10;
		int altura = 40;
		int area;
		area = base * altura;
		System.out.println("Área do retângulo: " + area);
		float c = 3.1415f;
		float somaMaior = (c + base);
		int somaMenor = (int)(c + base);
		System.out.println(somaMenor);
		System.out.println("Somando tipos diferentes: " + somaMaior);
		
		int count = 3;
		System.out.println(count++);
		System.out.println(count);
		
		boolean diaSemana = false;
		int diaDoMes = 15;
		int resultado = diaSemana && diaDoMes==15?1:0;
		System.out.println(resultado);
		
		
		
	}
}
