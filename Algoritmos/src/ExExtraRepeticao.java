import java.util.*;
public class ExExtraRepeticao {

	public static void main(String[] args) {
		//Contando n�meros, somando e determnando o maior e menor valor com estrutura de repeti��o "While".
		
		int cont = 0, N, numeros, soma=0,maior = 0,menor = 0;
		
		
		/*System.out.print("At� que n�mero voc� deseja contar?:");
		Scanner s = new Scanner (System.in);
		N = s.nextInt();
		System.out.print("De quantos em quantos n�meros voc� deseja saltar?: ");
		P = s.nextInt();
		while (cont <N) {
			
			cont = cont + P;
			soma = soma + cont;
			System.out.println(cont);
			
			
		}
		System.out.println("A soma dos n�meros contados �: "+soma+".");*/
		
		System.out.print("Quantos n�meros voc� deseja atribuir?:");
		Scanner s = new Scanner (System.in);
		N = s.nextInt();
		while (cont <N){
			System.out.print("Digite o "+(cont + 1)+"� n�mero: ");
			numeros = s.nextInt();
			soma = soma + numeros;	
			
		if(cont == 0){
			maior = numeros;
			menor = numeros;
		}
		cont = cont + 1;
		if (numeros>maior)maior = numeros;
		if (numeros<menor)menor = numeros;

		}
		System.out.println("A soma dos n�meros contados �: "+soma+".");
		System.out.println("O maior n�mero digitado foi: "+maior+".");
		System.out.println("O menor n�mero digitado foi: "+menor+".");
		
		
		
		
		
		
		
		
		

	}

}
