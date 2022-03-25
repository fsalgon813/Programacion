import java.util.Scanner;
public class Ejercicio_19 {

	public static void main(String[] args) {

		int ancho = 1;
		int e = 0;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce la altura de la piramide");
		int a = sn.nextInt();
		System.out.println("Introduce el caracter con el que quiere que se pinte la piramide ");
		String c = sn.next();
		
		
		 for(int n = a-1; n >= 0; n--) {
			 
			for(int z = (a*2)-3; z >= e; z-=2) {
					System.out.print(" ");
				}
			e +=2;
			for (int x = 1; x <= ancho; x++) {
				System.out.print(c);
			 }
			ancho +=2;
			 System.out.println("");
		 }

	}

}
