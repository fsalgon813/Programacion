import java.util.Scanner;
public class Ejercicio_23 {

	public static void main(String[] args) {

		int suma = 0;
		int cont = 0;
		int media = 0;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce numeros hasta que la suma de todos supere 10000");
		int n = sn.nextInt();
		
		while(suma < 10000) {
		
			System.out.println("Introduce numeros hasta que la suma de todos supere 10000");
			n = sn.nextInt();
			
			suma += n;
			cont++;
			media += n;
			media= n;
			media += n;
			
		}

		System.out.println("El total acumulado es: " + suma);
		System.out.println("La media es: " + (media/cont));
		System.out.println("Has introducido: " + cont + " numeros");
	}

}
