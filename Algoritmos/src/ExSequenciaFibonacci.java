
public class ExSequenciaFibonacci {

	public static void main(String[] args) {
		
		int v1, v2, v3;
		
		v1=-1;
		v2=1;
		
		for (int i = 1; i<=15;i++) {
		
			v3 = v1+v2;
			v1 = v2;
			v2 = v3;
			/*
			 * v3=0 v1=1 v2=0
			 * 
			 * v3=1 v1=0 v2=1
			 * 
			 * v3=1 v1=1 v2=1
			 * 
			 * v3=2 v1=1 v2=2
			 * 
			 * v3=3 v1=2 v2=3 . . .
			 */
			
		System.out.println(v3);
		}
	}

}
