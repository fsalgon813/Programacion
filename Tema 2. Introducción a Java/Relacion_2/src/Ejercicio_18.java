import java.util.Scanner;
public class Ejercicio_18 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int m = sn.nextInt();
		System.out.println("Introduce otro numero hasta el que se desea llegar");
		int x = sn.nextInt();
		
		while(m == x) {
			if(m == x) {
				System.out.println(m + " no puede ser igual que " + x);
			}
			System.out.println("Introduce un numero");
			m = sn.nextInt();
			System.out.println("Introduce otro numero hasta el que se desea llegar");
			x = sn.nextInt();
		}
		for (int n = m; n <= x; n += 7) {
			System.out.println(n);
		}
	}

}
