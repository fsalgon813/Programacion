import java.util.Scanner;
public class Ejercicio_24 {

	public static void main(String[] args) {

		int cont = 1;
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el numero de filas de la piramide");
		int n = sn.nextInt();

		for (int x = 1; x <= n; x++){
			for (int i = 1; i <= cont; i++) {
				System.out.print(i);
			}
			cont++;
			for (int i = cont -2; i >= 1; i--) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}

}
