import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		
		int a1 = 1;
		int e1 = 0;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce la altura de la piramide");
		int a = sn.nextInt();
		System.out.println("Introduce el caracter con el que quiere que se pinte la piramide");
		String c = sn.next();
		
		int e = a-1;
		
		while(a > a1){
			
			for (int n = 1; n <= e; n++) {
				System.out.print(" ");
			}
			System.out.print(c);
			for (int n = 1; n < e1; n++) {
				System.out.print(" ");
			}
			if (a1>1) {
				System.out.print(c);
			}
			
			System.out.println("");
			
			a1++;
			e--;
			e1 += 2;
			
			}
			for (int n = 1; n < a1*2; n++) {
				System.out.print(c);
			} 
	}
}
