import java.util.Scanner;
public class ExDoWhileContadorDeNegativos {

	public static void main(String[] args) {
		/*
		 * Algor�timo que exemplifica a utiliza��o da estrudura do-while. A fun��o
		 * desse programa contar quantos dos n�emros digitados s�o neativos.
		 */
		Scanner s = new Scanner (System.in);
		int neg = 0, num, cont = 1;
	
		
		do {
			System.out.print("Digite um n�mero inteiro qualquer: ");
			num = s.nextInt();
			if(num<0) neg = neg + 1;
			cont = cont + 1;
		}while(cont<=5);

		System.out.println("A quantidade de n�meros negativos digitados �: " +neg+".");
	}

}
