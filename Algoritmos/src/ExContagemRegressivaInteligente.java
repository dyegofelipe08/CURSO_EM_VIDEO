import java.util.*;
public class ExContagemRegressivaInteligente {

	public static void main(String[] args) {
		// Programa de contagem regressiva inteligente .
		
		int cont1, cont2;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Voc� deseja contar de que n�mero at� que n�mero: ");
		System.out.print("Digite o primeiro n�mero: ");
		cont1=s.nextInt();
		System.out.print("Digite o segundo n�mero: ");
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
		else System.out.println("Os n�meros s�o iguais.");
		
		
		

	}

}
