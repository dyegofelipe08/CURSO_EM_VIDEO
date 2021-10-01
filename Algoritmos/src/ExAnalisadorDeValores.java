import java.util.Scanner;
public class ExAnalisadorDeValores {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n, soma=0, Div5=0, nulos=0,sPar=0, limite;
		double media;
		
		System.out.print("Quantos núemros você deseja digitar? ");
		limite = s.nextInt();
		for (int i = 0; i<limite;i++){
			
			System.out.print("Digite o "+(i + 1)+ "º número: ");
			n = s.nextInt();
			soma = soma + n;
			
			if (n%5==0) Div5 = Div5 +1;
			if (n==0) nulos = nulos +1;
			if (n%2==0) sPar = sPar + n;
		}
		media = soma/limite;
		System.out.println("A soma dos valores digitade é: "+soma+";");
		System.out.println("A média entre os valores digitade é: "+media+";");
		System.out.println("A quantidade de números divisíveis por 5 é: "+Div5+";");
		System.out.println("A quantidade de números nulos é: "+nulos+";");
		System.out.println("A soma entre os números pares é: "+sPar+".");
	}

}
