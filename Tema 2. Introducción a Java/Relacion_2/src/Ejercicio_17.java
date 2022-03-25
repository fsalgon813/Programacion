import java.util.Scanner;
public class Ejercicio_17 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int x = 0;
		int suma = 0;
		
		System.out.println("Introduce un numero entero positivo y te dire la suma de los 100 siguientes");
		x = sn.nextInt();
				
		while(x < 0) {
			if(x<0) {
				System.out.println("Los datos introducidos no son correctas");
			}
			System.out.println("Introduce un numero entero positivo y te dire la suma de los 100 siguientes");
			x = sn.nextInt();
		}
		
		for(int n = x; n < x+100; n++) {
			suma += n;
		}
		System.out.println("La suma de los 100 siguientes numeros es: " + suma);
	}

}
