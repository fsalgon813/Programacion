import java.util.Scanner;
public class Ejercicio_16 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int x;
		int cont = 0;
		
		System.out.println("Introduce un numero y te dire si es primo o no");
		x = sn.nextInt();
		
		for(int n = 1; n <= x; n++) {
			
			if(x % n == 0){
				cont++;
			}
			
		}
		if(cont == 2) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}

	}

}
