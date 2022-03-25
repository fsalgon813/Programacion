import java.util.Scanner;
public class Ejercicio_14 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int base;
		int exponente;
		
		System.out.println("Introduce la base");
		base = sn.nextInt();
		System.out.println("Introduce el exponente");
		exponente = sn.nextInt();
		
		System.out.println(base + " elevado a " + exponente + " = " + Math.pow(base, exponente));

	}

}
