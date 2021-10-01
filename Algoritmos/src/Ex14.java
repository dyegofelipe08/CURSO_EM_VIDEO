import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
/*A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/ 

		double km, preco;
		int dias;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Km rodados: ");
		km=s.nextDouble(); 
		System.out.println("Digite a quantidade de dias que ficou com o carro alugado: ");
		dias=s.nextInt(); 
		
		preco=((dias*90)+(0.20*km));
		
		System.out.println("O preço total  pelo aluguel do veículo é: R$"+preco+".");
		
		
	}

}
