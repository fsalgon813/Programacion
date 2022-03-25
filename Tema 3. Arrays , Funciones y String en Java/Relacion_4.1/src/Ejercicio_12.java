import java.util.Scanner;
public class Ejercicio_12 {

	public static void main(String[] args) {

		int n[] = new int [10];
		Scanner sn = new Scanner(System.in);
		
		for (int x = 0; x < 10; x++) {
			System.out.println("Introduce el numero de la posicion " + x);
			n[x] = sn.nextInt();
		}
		
		System.out.println("Array inicial");
		System.out.print("Indice ");
		for (int x = 0; x < 10; x++) {
			System.out.print(x + " | ");
		}
		System.out.print("\nArray  ");
		for (int x = 0; x < 10; x++) {
			System.out.print(n[x] + " | ");
		}

	}

}
