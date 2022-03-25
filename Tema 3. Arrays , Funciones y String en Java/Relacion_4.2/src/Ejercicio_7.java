import java.util.Scanner;
public class Ejercicio_7 {

	public static void tablero(int coord[][]) {
		
		for (int i = 0; i < 4; i++) {
			System.out.print(i +"|");
			for (int z = 0; z < 5; z++) {
				if (coord[i][z] == 0) {
					System.out.print(" ");
				}
				else if (coord[i][z] ==1000) {
					System.out.print(" x");
				}
				else if (coord[i][z] == -1) {
					System.out.print(" *");
				}
				else if (coord[i][z] == -2) {
					System.out.print(" €");
				}
			}
			System.out.println();
		}
		
		System.out.print(" ");
		for (int x = 0; x < 5; x++) {
			System.out.print(" _");
		}
		System.out.println();
		System.out.print(" ");
		for (int x = 0; x < 5; x++) {
			System.out.print(" " + x);
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {

		boolean jugando =true;
		int mx;
		int my;
		int tx;
		int ty;
		int x;
		int y;
		char s;
		int coordenada[][] = new int [4][5];
		Scanner sn = new Scanner(System.in);
		
		System.out.println("_________________________________");
		System.out.println("|Bienvenido al juego Busqueda del tesoro|");
		System.out.println("_________________________________");
	
		mx = (int)Math.floor(Math.random()*(4));
		my = (int)Math.floor(Math.random()*(5));
		tx = (int)Math.floor(Math.random()*(4));
		ty = (int)Math.floor(Math.random()*(5));
		
		while (mx == tx || my == ty) {
			mx = (int)Math.floor(Math.random()*(4));
			my = (int)Math.floor(Math.random()*(5));
		}
		
		for (int i = 0; i < 4; i++) {
			for (int z = 0; z < 5; z++) {
				coordenada[i][z] = 0;
			}
		}
		
		tablero(coordenada);
		
		do {
			
			System.out.print("Coordenada x: ");
			x = sn.nextInt();
			System.out.print("\nCoordenada y: ");
			y = sn.nextInt();
			
			if (x < 0 || x > 4  || y < 0 || y > 4 ) {
				System.out.println("Los datos introducidos no son correctos");
				while (x < 0 || x > 4  || y < 0 || y > 4 ) {
					System.out.print("Coordenada x: ");
					x = sn.nextInt();
					System.out.print("\nCoordenada y: ");
					y = sn.nextInt();
				}
			}
			
			coordenada[y][x] = 1000;
			
			tablero(coordenada);
			if (x == my +1 || x == my -1 || y == mx +1 || y == mx -1) {
				System.out.println("Cuidado hay una mina cerca");
			}
			
			if (coordenada[y][x] == coordenada[mx][my]) {
				coordenada[mx][my] = -1;
				coordenada[tx][ty] = -2;
				tablero(coordenada);
				System.out.println("Has perdido");
				jugando = false;
			}
			
			if (coordenada[y][x] == coordenada[mx][my]) {
				coordenada[mx][my] = -1;
				coordenada[tx][ty] = -2;
				tablero(coordenada);
				System.out.println("Has ganado");
				jugando = false;
			}
			
		}while (jugando = true);
		
	}

}
