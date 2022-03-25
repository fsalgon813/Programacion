package math;

public class funciones {

	public static boolean esCapicua(int n) {
		
		int y = 0, inverso = 0, z = n;
			 
		while (z > 0) {
			
			y = z%10;
			inverso = y + inverso * 10;
			z /= 10;
			
		}
		
		if (n == inverso) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean esPrimo(int n) {
		
		int cont = 0;
		
		for (int x = 1; x <= n; x++) {
			if (n % x == 0) {
				cont++;
			}
		}
		
		if(cont == 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static int siguientePrimo(int n) {
		
		int cont = 0;
		boolean primo = true;
		
		do {
			
			for (int x = 1; x <= n; x++) {
				if (n % x == 0) {
					cont++;
				}
			}
			
			if(cont == 2) {
				primo = false;
			}
			else {
				n++;
				cont = 0;
			}
			
		}while (primo == true);
		return n;
	}
	
	public static int potencia(int b, int e) {
		return (int) Math.pow(b, e);
	}
	
	public static int digitos(int n) {
		
		int cont = 0;
		
		do {
			n /= 10;
			cont++;
		}while(n > 0);
		return cont;
	}
	
	public static int voltea(int n) {
		int y = 0, inverso = 0, z = n;
		 
		while (z > 0) {
			
			y = z%10;
			inverso = y + inverso * 10;
			z /= 10;
			
		}
		return inverso;
	}
	
	public static int digitoN(int n, int i) {
		int y = 0, inverso = 0, z = n, cont = 0, a = 0;
		 
		while (z > 0) {
			
			y = z%10;
			inverso = y + inverso * 10;
			z /= 10;
			
		}
		while (inverso > 0) {
			
			y = inverso%10;
			a = y + a * 10;
			inverso /= 10;
			cont++;
			if (cont == i) {
				return y;
			}
		}
		
		return -1;
	}
	
	public static int posicionDeDigito(int n, int i) {
		int y = 0, inverso = 0, z = n, cont = 0, a = 0;
		 
		while (z > 0) {
			
			y = z%10;
			inverso = y + inverso * 10;
			z /= 10;
			
		}
		while (inverso > 0) {
			
			y = inverso%10;
			a = y + a * 10;
			inverso /= 10;
			cont++;
			if (y == i) {
				return cont;
			}
		}
		
		return -1;
	}
	
}
