
public class Ejercicio_5 {

	public static void main(String[] args) {
		
		int n[][] = new int [6][10];
		int posmax1 = 0;
		int posmax2 = 0;
		int posmin1 = 0;
		int posmin2 = 0;
		int min = 1000;
		int max = 1;
		
		for (int x = 0; x < 6; x++) {
			for (int i = 0; i < 10; i++) {
				n[x][i] = (int)Math.floor(Math.random()*(1001));
				System.out.print(n[x][i] + ", ");
			}
			System.out.println();
		}

		for (int x = 0; x < 6; x++) {
			for (int i = 0; i < 10; i++) {
					if (n[x][i] >  max) {
						max = n[x][i];
						posmax1 = x;
						posmax2 = i;
					}
			}
		}

		for (int x = 0; x < 6; x++) {
			for (int i = 0; i < 10; i++) {
				if (n[x][i] < min) {
					min = n[x][i];
					posmin1 = x;
					posmin2 = i;
				}
			}
		}
		
		System.out.println("El  numero mayor esta en la fila " + posmax1 + " y en la columna " + posmax2 + " y es el numero " + n[posmax1][posmax2]);
		System.out.println("El numero menor esta en la fila " + posmin1 + " y en la columna " + posmin2 + " y es el numero " + n[posmin1][posmin2]);
		
	}

}
