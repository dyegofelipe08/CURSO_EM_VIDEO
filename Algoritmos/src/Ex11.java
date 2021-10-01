import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		/*Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
		segundo grau e mostre o valor de Delta.*/ 
		
		double delta, a, b, c;
		
		Scanner s =new Scanner (System.in);
		
		System.out.println("Digite um valor para A(x²): ");
		a=s.nextDouble();
		System.out.println("Digite um valor para B(X): ");
		b=s.nextDouble();
		System.out.println("Digite um valor para C: ");
		c=s.nextDouble();
		
		delta=(Math.pow(b, 2))-4*a*c;
		
		System.out.println("Para os valores inseridos tem-se o valor de delta = "+delta+".");

	}

}
