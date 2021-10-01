import java.util.*;
public class ExMelhoeAlunoDaTurma {

	public static void main(String[] args) {
		// Algoritimo que detecta o melhor aluno de uma turma.
			
		
		String aluno="aluno", melhor="A";
		double nota, maior = 0 ;
		int cont = 1, limite;
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("A turma tem quantos alunos?: ");
		limite = s.nextInt();
		
		while(cont<=limite) {
			System.out.print("Nome do aluno: ");
			aluno = s.next();
			System.out.print("Nota do aluno: ");
			nota = s.nextDouble();
			if (nota>maior) {
				maior = nota;
				melhor = aluno;
			}
			cont = cont + 1;
			
		}
		System.out.println("O melhor aproveitamento da turma foi do aluno "+melhor+" com  a nota "+maior+".");
		
	}

}
