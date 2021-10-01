import java.util.Scanner;
public class ExSuperContador {

	public static void main(String[] args) {
		
		int n, menu, cont1 = 1, cont2=10;
		boolean sair = false;
		Scanner s = new Scanner (System.in);
		
		do {
			System.out.println();
			System.out.println("**************MENU**************");
			System.out.println("|Digite (1) para contar de 1 a 10|");
			System.out.println("|Digite (2) para contar de 10 a 1|");
			System.out.println("|Digite (3) para sair            |");
			menu = s.nextInt();
			if (menu==1) {
				System.out.print("Contagem: ");
				do {
					System.out.print(cont1);
					System.out.print("..");
					cont1 = cont1 + 1;
				}while(cont1<=10);
				
			}else if (menu==2) {
				System.out.print("Contagem: ");
				do {
					System.out.print(cont2);
					System.out.print("..");
					cont2 = cont2 - 1;
				}while(cont2>=1);
				
			}else if(menu==3){
				sair = true;
				System.out.println("Você saiu!");
			}
		}while(sair!=true);
		
			
		
		
		
		

	}

}
