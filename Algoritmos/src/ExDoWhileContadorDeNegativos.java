import java.util.Scanner;
public class ExDoWhileContadorDeNegativos {

	public static void main(String[] args) {
		/*
		 * Algorítimo que exemplifica a utilização da estrudura do-while. A função
		 * desse programa contar quantos dos núemros digitados são neativos.
		 */
		Scanner s = new Scanner (System.in);
		int neg = 0, num, cont = 1;
	
		
		do {
			System.out.print("Digite um número inteiro qualquer: ");
			num = s.nextInt();
			if(num<0) neg = neg + 1;
			cont = cont + 1;
		}while(cont<=5);

		System.out.println("A quantidade de números negativos digitados é: " +neg+".");
	}

}
