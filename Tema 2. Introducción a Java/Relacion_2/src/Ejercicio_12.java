import java.util.Scanner;
public class Ejercicio_12 {

	public static void main(String[] args) {

		int x1 = 0;
		int x2 = 1;
		int n;

		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce un numero y mostrare los primeros n numeros de la serie de fibonacci");
		n = sn.nextInt();
		
		System.out.println(x1);
		System.out.println(x2);
		
		for(int x = 0; x <= n; x++) {
			
			
			x1 = x1 + x2;
			System.out.println(x1);
			x2 = x1 + x2;
			System.out.println(x2);
			
		}
		
	}

}
