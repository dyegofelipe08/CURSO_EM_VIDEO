import java.util.Scanner;
public class ExAnalisadorDeValores {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n, soma=0, Div5=0, nulos=0,sPar=0, limite;
		double media;
		
		System.out.print("Quantos n�emros voc� deseja digitar? ");
		limite = s.nextInt();
		for (int i = 0; i<limite;i++){
			
			System.out.print("Digite o "+(i + 1)+ "� n�mero: ");
			n = s.nextInt();
			soma = soma + n;
			
			if (n%5==0) Div5 = Div5 +1;
			if (n==0) nulos = nulos +1;
			if (n%2==0) sPar = sPar + n;
		}
		media = soma/limite;
		System.out.println("A soma dos valores digitade �: "+soma+";");
		System.out.println("A m�dia entre os valores digitade �: "+media+";");
		System.out.println("A quantidade de n�meros divis�veis por 5 �: "+Div5+";");
		System.out.println("A quantidade de n�meros nulos �: "+nulos+";");
		System.out.println("A soma entre os n�meros pares �: "+sPar+".");
	}

}
