
public class Ejercicio_9 {

	public static void primos() {
		int cont = 0;
		
		for(int n = 1; n <= 1000; n++ ) {
			cont = 0;
			for (int x = 1; x <= n; x++) {
				if (n % x == 0) {
					cont++;
				}
			}
			
			if(cont == 2) {
				System.out.println(n);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		primos();

	}

}
