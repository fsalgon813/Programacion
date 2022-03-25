import java.util.Scanner;
public class Ejercicio_28 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int fact = 1;
		
		
		System.out.println("introduce un numero y calculare su factorial");
		int n = sn.nextInt();
		
		for (int x = n; x >= 1; x--) {
			fact *= x;
		}
		System.out.println("El factorial de " + n + " es: " + fact);

	}

}
