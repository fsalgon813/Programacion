import java.util.Scanner;
public class Ejercicio_26 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int resto;
		int i = 0;
		int cont = 0;
		
		System.out.println("Introduce un numero");
		int n = sn.nextInt();
		System.out.println("Introduce un digito y te dire en la posicion que esta");
		int d = sn.nextInt();
		
		while (n>0) {
			resto= n % 10;
			i = i * 10 + resto;
			n /= 10; 
		}
		while (i>0) {
			resto= i % 10;
			i /= 10; 
			cont++;
			if (resto == d) {
				System.out.println("Esta en la posicion " + cont);
			}
		}

	}

}
