
public class NomeClasse {

	//definição dos atributos
	int atributo1;
	int atributo2;
	String atributo3;
	
	
	//Definição dos métodos da classe
	public void metodo1(){
		System.out.println(atributo1);
	}
	
	private int metodo2(int parametro){
		return parametro;
	}
	
	public void metodo3(int parametro) {
		metodo2(parametro);
	}
}
