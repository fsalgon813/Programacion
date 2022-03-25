import java.util.Scanner;
public class Ejercicio_29 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int n = sn.nextInt();
		System.out.println("Introduce otro numero");
		int x = sn.nextInt();

		for (int z = 1; z < n; z++) {
			if (z % x != 0) {
				System.out.print(z + ", ");
			}
		}
		
	}

}
