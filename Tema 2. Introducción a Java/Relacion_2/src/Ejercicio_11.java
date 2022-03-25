import java.util.Scanner;
public class Ejercicio_11 {

	public static void main(String[] args) {

		int x;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dire los proximos 5 numeros elevado al cuadrado y al cubo");
		x = sn.nextInt();
		
		for(int n = 0;n < 5; n++ ) {
			
			System.out.println((x + 1) + "\t" + Math.pow((x + 1),2) + "\t " + Math.pow((x + 1),3));
		    x++;			
			
		}
		
	}

}
