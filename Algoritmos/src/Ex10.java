import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		/*Fa�a um algoritmo que leia a largura e altura de uma parede, calcule e
		mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o,
		sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.*/
		
		
		double l, h, area, quant;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		h=s.nextDouble();
		System.out.println("Digite a largura: ");
		l=s.nextDouble();
		
		area=l*h;
		quant=(area/2);
		
		System.out.println("A �rea total �: "+area+"m�. A quantidade de tinta necess�ria para pintar essa �rea �: "+quant+" L.");
	
		
		

	}

}
