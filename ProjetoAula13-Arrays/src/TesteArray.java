
public class TesteArray {
	public static void main(String[] args) {
		float[] notas = new float[5];
		notas[0] = 8.5f;
		notas[1] = 9.5f;
		notas[2] = 7.5f;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota no índice " + i 
					+ " : " + notas[i]);
		}
		System.out.println("Tamanho do array: "  + notas.length);
		
		int contador = 0;
		for(float valorAtual: notas ){
			System.out.println("Nota no índice " + contador + ": "+ valorAtual);
			contador++;
		}
	}

}
