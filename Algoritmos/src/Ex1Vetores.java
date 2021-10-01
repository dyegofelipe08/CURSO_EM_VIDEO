import java.util.*;
public class Ex1Vetores {

	public static void main(String[] args) {
		// Ler valores em um vetor e mostrar quais destes valores são pares. 
		Scanner s = new Scanner (System.in);
		
		int n;
		
		System.out.println("Digite o tamanho do vetor: ");
		n = s.nextInt();
		int val [] = new int [n];
		int par = 0;
		
		for (int i=0; i<val.length;i++) {
		
		System.out.print("Digite o "+(i+1)+"º valor:");
		val [i] = s.nextInt();
			if (val [i]%2==0) {
			par = par + 1;	
			
			}
		
		}
		
		for (int i =0; i<n; i++) {
			
			if (val[i]%2==0) {
				System.out.println("O valor "+val[i]+ " está na posição "+i+" do vetor.");
			}
		}
		
			System.out.println("A quantidade de valores pares é "+par+".");
		}
		

	}


