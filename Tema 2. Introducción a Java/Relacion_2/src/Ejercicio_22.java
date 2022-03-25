
public class Ejercicio_22 {

	public static void main(String[] args) {

		int n;
		int cont = 0;
		
		for(n = 2; n <= 100; n++) {
			for (int x = 1; x <= n; x++) {
				if (n % x == 0) {
					cont++;
				}
			}
			if(cont == 2) {
				System.out.println(n);
			}
			cont = 0;
		}

	}

}
