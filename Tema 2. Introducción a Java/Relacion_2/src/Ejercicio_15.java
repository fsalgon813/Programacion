import java.util.Scanner;
public class Ejercicio_15 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int b;
		int e;
		double p;
		int x;
		
		System.out.println("Introduce la base");
		b = sn.nextInt();
		System.out.println("Introduce la cantidad de exponetes desde 1 hasta n");
		e = sn.nextInt();
		
		
		for(int n = 1; n <= e; n++) {
			
			p = 1;
			x = n;
			
			for (int z = 0; z < x; z++) {
		        p *= b;
		        
		      }
			System.out.println(p);
			
		}

	}

}
