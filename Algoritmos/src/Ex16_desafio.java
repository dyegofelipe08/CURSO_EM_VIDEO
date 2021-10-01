import java.util.Scanner;
public class Ex16_desafio {

	public static void main(String[] args) {
		/*[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
		fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
		já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
		quantos dias de vida um fumante perderá e exiba o total em dias.*/ 
		
		int quant, anos, tp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos cigarros você fuma por dia?: ");
		quant=s.nextInt();
		System.out.println("Há quantos anos você fuma?: ");
		anos=s.nextInt();
		
		tp=((anos*365*quant*10)/1440);
		
		System.out.println("Ao fumar "+quant+" cigarros por dia, durante "+anos+" anos, você perdeu "+tp+" dias de vida.");
		
		

	}

}
