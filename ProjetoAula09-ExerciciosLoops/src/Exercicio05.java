
public class Exercicio05 {

	public static void main(String[] args) {
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i=1; i <=200; i++) {
			if(i%2==0){
				qtdPares++;
			}else{
				qtdImpares++;
			}
			
		}
		System.out.println("Quantidade de Pares: " + qtdPares);
		System.out.println("Quantidade de Ímpares: " + qtdImpares);
	}

}
