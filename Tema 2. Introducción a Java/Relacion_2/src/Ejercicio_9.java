import java.util.Scanner;
public class Ejercicio_9 {

	public static void main(String[] args) {

		int cont = 1;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dire cuantos digitos tiene");
		int x = sn.nextInt();
		
		while(x > 10) {
			x /= 10;
			cont++;
		}
		System.out.println("El numero tiene " + cont + " cifras");
		
	}
}
