import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dire la tabla de multiplicar de ese numero");
		int y = sn.nextInt();
		for (int x = 1; x <= 10; x++) {
			System.out.println(y + " x " + x + " = " + (y*x));
		}

	}

}
