import java.util.Scanner;
public class Hundir_la_flota {

	static int  j[][] = new int [10][10]; //Array jugador
	static int  jo[][] = new int [10][10]; //Array ordenador
	static int puntosj = 24;  // Puntos jugador
	static int puntosjo = 24;  // Puntos ordenador
	
	public static int letra_a_numero(String l) {
		
		if (l.equalsIgnoreCase("a"))
			return 0;
		else if (l.equalsIgnoreCase("b"))
			return 1;
		else if (l.equalsIgnoreCase("c"))
			return 2;
		else if (l.equalsIgnoreCase("d"))
			return 3;
		else if (l.equalsIgnoreCase("e"))
			return 4;
		else if (l.equalsIgnoreCase("f"))
			return 5;
		else if (l.equalsIgnoreCase("g"))
			return 6;
		else if (l.equalsIgnoreCase("h"))
			return 7;
		else if (l.equalsIgnoreCase("i"))
			return 8;
		else if (l.equalsIgnoreCase("j"))
			return 9;				
		else
			return 0;
	
	}
	
	public static int separar_letra_numero(String s) {
		
		String a;
		
		a = s.substring(0,1);
		int y = letra_a_numero(a);
		return y;
	}
	
	public static void barcos(int size, int j[][]) {
		int x;
		int y;
		int alineacion = (int) Math.floor(Math.random()*(3-1)+1);
		
		if (alineacion == 1) {
			switch (size) {
				case 1:
					x	= (int)(Math.random()*10);
					y	= (int)(Math.random()*10);
					//Comprueba si se pueden poner los barcos, si no se puede se vuelve a generar
					if (j[x][y] != 0) {
						while(j[x][y] != 0) {
							x	= (int)(Math.random()*10);
							y	= (int)(Math.random()*10);
						}
					}
					else if (j[x][y] == 0) {
						j[x][y] = 1;
					}
					//Termina de comprobar
					break;
					
				case 3:
					x	= (int)(Math.random()*10);
					y	= (int)(Math.random()*10);
					
					//Comprueba si se pueden poner los barcos, si no se puede se vuelve a generar
					do {
						if(x+1 < 10 && x + 2 < 10 ) {
							if (j[x][y] == 0 && j[x + 1][y] == 0 && j[x + 2][y] == 0 ){
								j[x][y] = 3;
								j[x + 1][y] = 3;
								j[x + 2][y] = 3;
							}
							else {
								x	= (int)(Math.random()*10);
								y	= (int)(Math.random()*10);
							}
						}
						else {
							x	= (int)(Math.random()*10);
							y	= (int)(Math.random()*10);
						}
						
					}while (j[x][y] != 3);
					//Termina de comprobar
					break;
					
				case 5:
					x	= (int)(Math.random()*10);
					y	= (int)(Math.random()*10);

					//Comprueba si se pueden poner los barcos, si no se puede se vuelve a generar
					do {
						if(x+1 < 10 && x + 2 < 10 && x+3 < 10 && x + 4 < 10) {
							if (j[x][y] == 0 && j[x + 1][y] == 0 && j[x + 2][y] == 0 &&  j[x + 3][y] == 0 && j[x + 4][y] == 0 ){
								j[x][y] = 5;
								j[x + 1][y] = 5;
								j[x + 2][y] = 5;
								j[x + 3][y] = 5;
								j[x + 4][y] = 5;
							}
							else {
								x	= (int)(Math.random()*10);
								y	= (int)(Math.random()*10);
							}
						}
						else {
							x	= (int)(Math.random()*10);
							y	= (int)(Math.random()*10);
						}
						
					}while (j[x][y] != 5);
					//Termina de comprobar
					
					break;
			}		
		}
		
		if (alineacion == 2) {
			switch (size) {
				case 1:
					x	= (int)(Math.random()*10);
					y	= (int)(Math.random()*10);
					//Comprueba si se pueden poner los barcos, si no se puede se vuelve a generar
					if (j[x][y] != 0) {
						while(j[x][y] != 0) {
							x	= (int)(Math.random()*10);
							y	= (int)(Math.random()*10);
						}
					}
					else if (j[x][y] == 0) {
						j[x][y] = 1;
					}
					//Termina de comprobar
					break;
					
				case 3:
					x	= (int)(Math.random()*10);
					y	= (int)(Math.random()*10);
					//Comprueba si se pueden poner los barcos, si no se puede se vuelve a generar
					do {
						if(y+1 < 10 && y + 2 < 10 ) {
							if (j[x][y] == 0 && j[x][y + 1] == 0 && j[x][y +2] == 0){
								j[x][y] = 3;
								j[x][y + 1] = 3;
								j[x][y + 2] = 3;
							}
							else {
								x	= (int)(Math.random()*10);
								y	= (int)(Math.random()*10);
							}
						}
						else {
							x	= (int)(Math.random()*10);
							y	= (int)(Math.random()*10);
						}
						
					}while (j[x][y] != 3);
					//Termina de comprobar
					break;
					
				case 5:
					x	= (int)(Math.random()*10);
					y	= (int)(Math.random()*10);
					
					//Comprueba si se pueden poner los barcos, si no se puede se vuelve a generar
					do {
						if(y+1 < 10 && y + 2 < 10 && y+3 < 10 && y + 4 < 10) {
							if (j[x][y] == 0 && j[x][y + 1] == 0 && j[x][y +2] == 0 &&  j[x][y + 3] == 0 && j[x][y + 4] == 0 ){
								j[x][y] = 5;
								j[x][y + 1] = 5;
								j[x][y + 2] = 5;
								j[x][y + 3] = 5;
								j[x][y + 4] = 5;
							}
							else {
								x	= (int)(Math.random()*10);
								y	= (int)(Math.random()*10);
							}
						}
						else {
							x	= (int)(Math.random()*10);
							y	= (int)(Math.random()*10);
						}
						
					}while (j[x][y] != 5);
					//Termina de comprobar
					
					break;
			}		
		}
		
	}

	
	public static void tableroj(int jugador[][]) {
		
		char letra = 65;
		int n = 0;
		System.out.print("    ");
		for (int i = 0; i <= 9; i++) {
			System.out.print("[" + n + "] ");
			n++;
		}
		System.out.println();
		for (int i = 0; i <= 9; i++) {
			System.out.print("[" + letra + "] ");
			for (int x = 0; x <= 9; x++) {
				if (jugador[i][x] == 0) {
					System.out.print( " .  ");
				}
				else if(jugador[i][x] == 100) {
					System.out.print(" X  ");
				}
				else if (jugador [i][x] == 200) {
					System.out.print( " A  ");
				}
				else {
					System.out.print( " " +jugador[i][x] + "  ");
				}
			}
			letra++;
			System.out.println();
		}
		
	}

	public static void disparo(int j[][],String jugador, int x, int y) {
		if (j[x][y] == 3 || j[x][y] == 1 || j[x][y] == 5) {
			System.out.println("HAS ALCANZADO A ALGUN BARCO");
			j[x][y] = 100;
			if (jugador.equalsIgnoreCase("jugador1"))
				puntosj--;
			else
				puntosjo--;
		}
		else if(j[x][y] !=100){
			j[x][y] = 200;
			System.out.println("AGUA");
		}
		
	}
	
	
	public static void tablerojo(int jugador[][]) {
		
		char letra = 65;
		int n = 0;
		System.out.print("    ");
		for (int i = 0; i <= 9; i++) {
			System.out.print("[" + n + "] ");
			n++;
		}
		System.out.println();
		for (int i = 0; i <= 9; i++) {
			System.out.print("[" + letra + "] ");
			for (int x = 0; x <= 9; x++) {
				if(jugador[i][x] == 100) {
					System.out.print( " X  ");
				}
				else if (jugador [i][x] == 200) {
				System.out.print(" A  ");
				}
				else {
					System.out.print(" .  ");
				}
			}
			letra++;
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int z = 0, y = 0;
		String entradaj;
		int a, b;
		boolean juego = true;
		
		//Pone las 2 matrices completas a 0
		for (int i = 0; i <= 9; i++) {
			for (int x = 0; x <= 9; x++) {
				j[i][x] = 0;
				jo[i][x] = 0;
			}
		}
		
		//Genera barcos
		for (int x = 1; x <= 5; x++) {
			barcos(1,j);
			barcos(1,jo);
		}
		for (int x = 1; x <= 3; x++) {
			barcos(3,j);
			barcos(3,jo);
		}
		for (int x = 1; x <= 2; x++) {
			barcos(5,j);
			barcos(5,jo);
		} 
		//Termina generar barcos
		
		do {
			
			System.out.println("TURNO DEL JUGADOR");
			System.out.print("Introduzca la casilla (Por ejemplo B4): ");
			entradaj = sn.nextLine();
			z = separar_letra_numero(entradaj);
			y = Integer.parseInt(entradaj.substring(1));
			disparo(jo, "jugador2", z, y);
			if (puntosjo == 0)
				juego = false;
			System.out.println("REGISTRO DEL MAPA DEL ORDENADOR");
			tablerojo(jo);
			System.out.print("PUNTOS RESTANTES DEL ORDENADOR: ");
			System.out.println(puntosjo);
			System.out.println();
			System.out.println("TURNO DEL ORDENADOR");
			a = (int)(Math.random()*10);
			b = (int)(Math.random()*10);
			disparo(j, "jugador1", a, b);
			if (puntosj == 0)
				juego = false;
			System.out.println("MAPA DEL USUARIO");
			tableroj(j);
			System.out.print("PUNTOS RESTANTES DEL USUARIO: ");
			System.out.println(puntosj);
			System.out.println();
			
			
		}while(juego);
		
		if(puntosj > 0)
			System.out.println("Enhorabuena usuario!!!\nHas ganado");
		else if(puntosjo > 0)
			System.out.println("Ha ganado la maquina. La proxima vez sera");
		
		sn.close();
	}

}