import java.util.*;
public class ExVetresListaDeAlunosComMedia {

	public static void main(String[] args) {
		// Lista de alunos, notas e m�dias e quantidade de alunos acima da m�dia em rela��o a m�dia da turma. 
		
		Scanner s = new Scanner (System.in);
		int n, quant=0;
		double mt, sm=0;
		System.out.print("Quantos alunos existem na turma?");
		n = s.nextInt();
		
		String alunos [] = new String [n];
		
		double [] n1 = new double [n], n2 = new double [n], media = new double [n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite o nome do "+(i + 1)+ "� aluno(a): ");
			alunos [i] = s.next();
			System.out.print("Digite a primeira nota deste aluno: ");
			n1[i] = s.nextDouble();
			System.out.print("Digite a segunda nota deste aluno: ");
			n2[i] = s.nextDouble();
			
			media[i] = (n1[i]+n2[i])/2;
			sm = media [i] + sm;	
		}
		
		mt = sm/n;
		
		for (int i=0; i<n; i++) {
			if (media[i]>mt) quant = quant +1;
			System.out.println("A m�dia do aluno "+alunos[i]+" �: "+media[i]+".");
			
		}
	
		System.out.println("A quantidade de alunos acima da m�dia �: "+quant+" em compara��o com a media da turma de "+mt+".");
	
		
		

	}

}
