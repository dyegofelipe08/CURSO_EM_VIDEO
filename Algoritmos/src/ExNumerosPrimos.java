import java.util.Scanner;
public class ExNumerosPrimos {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int cont = 1,contDiv=0, n;
		System.out.print("Digite um número: ");
		n =s.nextInt();
		
		do {
			
			if (n % cont==0) {
				contDiv = contDiv + 1;
			}
			cont = cont + 1;
			
		}while(cont<n);
		
		if (contDiv<=2) {
			System.out.println("O número "+n+" é primo!");
		}else {
			System.out.println("O número "+n+" não é primo!");
			
		}

	}

}
