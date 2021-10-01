import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia a largura e altura de uma parede, calcule e
		mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
		sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/
		
		
		double l, h, area, quant;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		h=s.nextDouble();
		System.out.println("Digite a largura: ");
		l=s.nextDouble();
		
		area=l*h;
		quant=(area/2);
		
		System.out.println("A área total é: "+area+"m². A quantidade de tinta necessária para pintar essa área é: "+quant+" L.");
	
		
		

	}

}
