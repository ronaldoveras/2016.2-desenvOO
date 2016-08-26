import java.util.Scanner;

public class Exercicio02 {
	   public static void main(String[] args) {
			System.out.println("Digite o nível: ");
			Scanner entradaNivel = new Scanner(System.in);
			int nivel = entradaNivel.nextInt();
		    	switch (nivel) {
				case 1:
					System.out.println("*");
				case 2:
					System.out.println("**");
				case 3:
					System.out.println("***");
				case 4:
					System.out.println("****");
				case 5:
					System.out.println("*****");
				case 6:
					System.out.println("******");
			}
	   }
}
