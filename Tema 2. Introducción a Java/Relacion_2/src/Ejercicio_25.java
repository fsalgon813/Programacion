import java.util.Scanner;
public class Ejercicio_25 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		int resto;
		int i = 0;
		
		System.out.println("Introduce un numero y te lo mostrare al reves");
		int n = sn.nextInt();
		
		while (n>0) {
			resto= n % 10;
			i = i * 10 + resto;
			n /= 10; 
		}
		
		System.out.println(i);

	}

}
