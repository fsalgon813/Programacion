
public class Ejercicio_3 {

	public static void main(String[] args) {

		int n[][] = new int [4][5];
		int sumat = 0;
		int sumaf [] = new int [4];
		int sumac [] = new int [5];
		int cont = 0;
		
		
		for  (int i = 0; i < 4; i++) {
			System.out.println();
			for (int x = 0; x < 5; x++) {
				n [i][x] = (int)Math.floor(Math.random()*(1000 -100) + 100);
				System.out.print(n [i][x] + ", ");
			}
		}
		System.out.println("\n");
		for  (int i = 0; i < 4; i++) {
			sumaf [i] +=  n[i][cont];
			for (int x = 0; x < 5; x++) {
				sumat += n[i][x];
				sumac [x] +=  n[i][x];
			}
			cont ++;
		}
		
		for  (int i = 0; i < 4; i++) {
			System.out.println("La suma de la fila " + i +" es: " + sumaf[i]);
		}
		for  (int i = 0; i < 5; i++) {
			System.out.println("La suma de la columna " + i +" es: " + sumac[i]);
		}
		System.out.println("La suma total es: " + sumat);
		
	}

}
