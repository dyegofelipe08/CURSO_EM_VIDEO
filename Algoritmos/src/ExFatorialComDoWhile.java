import java.util.Scanner;
public class ExFatorialComDoWhile {

	public static void main(String[] args) {
		
		int cont, num, f;
		String R;
		
		Scanner s = new Scanner (System.in);
		
	do {
		System.out.print("Digite um número para descobrirmos o seu fatorial: ");
		num = s.nextInt();
		cont = num;
		f=1;
		do {
			f=f*cont;
			cont = cont-1;
			
		}while(cont>=1);
		
		System.out.println("O fatorial de "+num+" é igual a "+f+".");
		System.out.println("Deseja continuar? [S/N]");
		R=s.next();
		
	}while ((R=="S")||(R=="s"));
	
	//Analisar por que o while não está funcionando com a string R.
	
	}

}
