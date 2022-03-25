import java.util.Scanner;
public class Ejercicio_27 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		int cont = 0;
		int suma = 0;
		
		System.out.println("Introduce un numero y mostrare, sumare y contare los multiplos de 3 desde 1 hasta n");
		int n = sn.nextInt();
		
		for (int x = 1; x <= n; x++) {
			if (x % 3 == 0) {
				cont++;
				suma += x;
				System.out.print(x + ", ");
			}
		}
		System.out.println("");
		System.out.println("La suma de todos es: " + suma);
		System.out.println("Hay " + cont + " multiplos de 3 desde el 1 hasta " + n);

	}

}
