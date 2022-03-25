
public class Ejercicio_10 {

	public static void main(String[] args) {

		int n[] = new int [20];
		int r[] = new int [20];
		int cont = 0;

		
		for (int x = 0; x < 20; x++) {
			n[x] = (int)Math.floor(Math.random()*101);
			if (n[x] % 2 == 0) {
						r[cont] = n[x];
						cont++;
			}
		}
		
		for (int x = 0; x < 20; x++) {
			if (n[x] % 2 != 0) {
						r[cont] = n[x];
						cont++;
			}
		}
		
		
		for (int i = 0; i < 20; i++) {
			System.out.print(r[i] + ", ");
			}
		
	}

}
