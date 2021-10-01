import java.util.Scanner;
public class ExContadorDePessoas {

	public static void main(String[] args) {
		/*
		 * // Programa para digitar informações de pessoas e suas características,
		 * depois contar quantas // dessas pessoas são homens com mais de 18 anos e
		 * cabelos castanhos e mulheres com idade entre 25 // e 30 anos e cabelos
		 * loiros.
		 *
		 */	
	   Scanner s = new Scanner (System.in);
	   int mul = 0, hom=0, idade, cabelos, continuar, sexo;
	   
	   
	   do {
		   
	   System.out.println("---------SELETOR DE PESSOAS--------");
	   System.out.println("Qual o sexo? [1]- M/[2] - F]");
	   sexo = s.nextInt();
	   System.out.println("----------------------------------");
	   System.out.println("Qual a idade:");
	   idade = s.nextInt();
	   System.out.println("----------------------------------");
	   System.out.println("Qual a cor dos cabelos:");
	   System.out.println("[1] - Preto");
	   System.out.println("[2] - Castanho");
	   System.out.println("[3] - Loiro");
	   System.out.println("[4] - Ruivo");
	   cabelos = s.nextInt();
	   
	   if((sexo==1) & (idade>=18) & (cabelos==2)) hom = hom +1;
	   if((sexo==2) & (idade>=25) & (idade<=30) & (cabelos==3)) mul = mul +1;
	   
	   System.out.println("Quer continuar? [1-SIM / 2-NÃO]");
	   continuar = s.nextInt();
	   }while (continuar==1);  
	  
	   System.out.println("A quantidade de homens com mais des 18 anos e cabelos castanhos é: "+hom+".");
	   System.out.println("A quantidade de mulheres com idades entre 25 e 30 anos e cabelos loiros é: "+mul+".");
	   
	
	
	
	
	}

}
