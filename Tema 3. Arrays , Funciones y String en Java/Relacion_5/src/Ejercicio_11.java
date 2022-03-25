import java.util.Scanner;
public class Ejercicio_11 {

	public static int binario(int n) {
		
		int e = 0, i = 0, d = 0, x = n;
		
		
		while (x != 0) {
			i = x % 10;                         
	        d = d + i * (int) Math.pow(2, e);
	        e++;
	        x /= 10;
		}
		return d;
	}
	
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un binario y lo convierto a decimal");
		int n = sn.nextInt();
		
		System.out.println(binario(n));
	}

}
