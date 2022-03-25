import java.util.Scanner;
public class tres_en_raya {
	
	static Scanner sn = new Scanner(System.in);
	static int tablero[] = new int[9];
	
	public static void imprimeTablero (int t[]) {
		
		for (int x = 0; x < 9; x++) {
				if(t[x] == 1) 
					System.out.printf("%5s","O");
				else if(t[x] == 2) 
					System.out.printf("%5s","X");
				else
					System.out.printf("%5s","-");
				if (x == 2 || x == 5)
			System.out.println();
		}
		
	}
	
	public static int mueveFichaAleatoria (int x) {
		
		x = (int)(Math.random() * 9);
		
		while (tablero[x] != 0) {
			x = (int)(Math.random() * 9);
		}
		if (tablero[x] == 0)
			return x;
		else {
			return -1;
		}
		
	}
	
	public static int conviertePosicionMovimiento (String movimiento) {
		
		if ( "arriba izquierda".equalsIgnoreCase(movimiento))
			return 0;
		else if ("arriba centro".equalsIgnoreCase(movimiento))
			return 1;
		else if ("arriba derecha".equalsIgnoreCase(movimiento))
			return 2;
		else if( "centro izquierda".equalsIgnoreCase(movimiento))
			return 3;
		else if( "centro centro".equalsIgnoreCase(movimiento))
			return 4;
		else if( "centro derecha".equalsIgnoreCase(movimiento))
			return 5;
		else if( "abajo izquierda".equalsIgnoreCase(movimiento))
			return 6;
		else if( "abajo centro".equalsIgnoreCase(movimiento))
			return 7;
		else if( "abajo derecha".equalsIgnoreCase(movimiento))
			return 8;
		else 
			return 0;
	}

	public static boolean usuarioMueveFicha(String movimiento, int tablero[]) {
		
		
		
			if(tablero[conviertePosicionMovimiento(movimiento)] == 0)
				return true;
			else
				return false;
			
	}
	
	public static void limpiarTablero(int tablero[], int x1, int x2, int x3, int o1, int o2, int o3) {
		x1 = 0;
		x2 = 0;
		x3 = 0;
		o1 = 0;
		o2 = 0;
		o3 = 0;
		for (int x = 0; x < 9; x++) {
			tablero[x] = 0;
		}
	}

	public static boolean ganaPrograma(int tablero[]) {
		
		if ((tablero[0] == 2 && tablero[1] == 2 && tablero[2] == 2) || (tablero[3] == 2 && tablero[4] == 2 && tablero[5] == 2) || (tablero[6] == 2 && tablero[7] == 2 && tablero[8] == 2))
			return true;
		else 	if ((tablero[0] == 2 && tablero[3] == 2 && tablero[6] == 2) || (tablero[1] == 2 && tablero[4] == 2 && tablero[7] == 2) || (tablero[2] == 2 && tablero[5] == 2 && tablero[8] == 2))
			return true;
		else	if ((tablero[0] == 2 && tablero[4] == 2 && tablero[8] == 2) || (tablero[2] == 2 && tablero[4] == 2 && tablero[6] == 2))
			return true;
		else		
		return false;
		
	}
	
public static boolean ganaUsuario(int tablero[]) {
		
	if ((tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1) || (tablero[3] == 1 && tablero[4] == 1 && tablero[5] == 1) || (tablero[6] == 1 && tablero[7] == 1 && tablero[8] == 1))
		return true;
	else 	if ((tablero[0] == 1 && tablero[3] == 1 && tablero[6] == 1) || (tablero[1] == 1 && tablero[4] == 1 && tablero[7] == 1) || (tablero[2] == 1 && tablero[5] == 1 && tablero[8] == 1))
		return true;
	else 	if ((tablero[0] == 1 && tablero[4] == 1 && tablero[8] == 1) || (tablero[2] == 1 && tablero[4] == 1 && tablero[6] == 1))
		return true;
	else		
		return false;
		
	}

	public static void  juego(int o, int x) {
		System.out.println("\n\n¡Tu turno!");
		System.out.println("\nElige donde quieres tu ficha");
		String movimiento = sn.nextLine();
		o  = conviertePosicionMovimiento(movimiento);
		while(usuarioMueveFicha(movimiento,tablero) == false) {
			System.out.println("MOVIMIENTO ERRONEO");
			System.out.println("\nElige donde quieres tu ficha");
			movimiento = sn.nextLine();
			o  = conviertePosicionMovimiento(movimiento);
		}
		tablero[o] = 1;
		imprimeTablero(tablero);
		System.out.println("\nTurno de la maquina");
		x = mueveFichaAleatoria(x);
		tablero[x] = 2;
		System.out.println("¡MOVIMIENTO VALIDO!");
		imprimeTablero(tablero);
	}
	
	public static void main(String[] args) {
		
		int x1 = 0, x2 = 0, x3 = 0;
		int o1 = 0, o2 = 0, o3 = 0;
		String c;
		boolean again = false;
		boolean juego;
		
		System.out.println("¡Juguemos al tres en raya!");
		imprimeTablero(tablero);
		do {
			again = false;
			juego = true;
			do {
				
				juego(o1,x1);
				juego(o2,x2);
				juego(o3,x3);
				if (ganaUsuario(tablero) == true || ganaPrograma(tablero) == true)
					juego = false;

			}while((juego == true));
			
			
			System.out.println("¿Quieres jugar otra vez?");
			c = sn.next();
			if(c.equals("s") || c.equals("S"))
				again = true;
			else
				again = false;
			limpiarTablero(tablero, x1, x2, x3, o1, o2, o3);
		}while(again = true);
		
		
		sn.close();
	}

}
