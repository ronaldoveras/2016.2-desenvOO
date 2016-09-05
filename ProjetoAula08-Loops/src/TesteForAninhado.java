
public class TesteForAninhado {

	public static void main(String[] args) {
		for(int i=0; i<10;i++){
			for(int j = 0; j < 10; j++){
				System.out.println( i + " + " + j + " : " + soma(i,j));
			}
		}

	}

	public static int soma(int a, int b) {
		return a + b;
	}
}
