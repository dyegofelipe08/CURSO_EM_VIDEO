import java.util.Scanner;
public class Ex16_desafio {

	public static void main(String[] args) {
		/*[DESAFIO] Escreva um programa para calcular a redu��o do tempo de vida de um
		fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
		j� fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
		quantos dias de vida um fumante perder� e exiba o total em dias.*/ 
		
		int quant, anos, tp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos cigarros voc� fuma por dia?: ");
		quant=s.nextInt();
		System.out.println("H� quantos anos voc� fuma?: ");
		anos=s.nextInt();
		
		tp=((anos*365*quant*10)/1440);
		
		System.out.println("Ao fumar "+quant+" cigarros por dia, durante "+anos+" anos, voc� perdeu "+tp+" dias de vida.");
		
		

	}

}
