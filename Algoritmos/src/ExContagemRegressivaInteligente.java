import java.util.*;
public class ExContagemRegressivaInteligente {

	public static void main(String[] args) {
		// Programa de contagem regressiva inteligente .
		
		int cont1, cont2;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Você deseja contar de que número até que número: ");
		System.out.print("Digite o primeiro número: ");
		cont1=s.nextInt();
		System.out.print("Digite o segundo número: ");
		cont2=s.nextInt();
		
		if (cont1<cont2) {
			while (cont1<=cont2) {
				System.out.print(cont1+"...");
				cont1=cont1+1;
			}
		}
		else if (cont1>cont2) {
			while (cont1>=cont2) {
				System.out.print(cont1+"...");
				cont1=cont1-1;
			}
		}
		else System.out.println("Os números são iguais.");
		
		
		

	}

}
