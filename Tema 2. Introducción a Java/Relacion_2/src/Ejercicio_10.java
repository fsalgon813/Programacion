import java.util.Scanner;
public class Ejercicio_10 {

	public static void main(String[] args) {

		int x = 0;
		int cont = 0;
		int n = 0;
		Scanner sn = new Scanner(System.in);

		System.out.println("Ve escribiendo numeros y te dire la media de esos numero. Para salir pon un numero negativo");
		x = sn.nextInt();
		
		while(n >= 0){
			
			x = n + x;
			cont++;
			
			System.out.println("Ve escribiendo numeros y te dire la media de esos numero. Para salir pon un numero negativo");
			n = sn.nextInt();
			System.out.println("");
			
		}
		System.out.println(x / cont);
	}
		
}

