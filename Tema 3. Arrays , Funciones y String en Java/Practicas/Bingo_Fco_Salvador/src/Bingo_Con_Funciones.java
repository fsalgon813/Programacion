import java.util.Scanner;

public class Bingo_Con_Funciones {

	static int [][] j1 = new int [5][3];
	static int [][] j2 = new int [5][3];
	
	public static void main(String[] args) {

		boolean bingo = false;
		boolean linea = false;
		int dineroj1 = 0;
		int dineroj2 = 0;
		int contj1 = 0;
		int contj2 = 0;
		int y = 10;
		int z = 1;
		String seguir;
		Scanner sn = new Scanner(System.in);
		
		//Pinta el inicio
		System.out.println("*******Bingo Fco Salvador*******");
		
		System.out.println("\t   PREMIOS ");
		
		System.out.println("\t Linea: 100€");
		
		System.out.println("\t Bingo: 500€ \n");
		
		//Asigna numeros random a los cartones
		for (int n = 0;  n <= 2;   n++) {
			for(int i = 0; i <= 4; i++) {
				j1[i][n] = (int)Math.floor(Math.random()*(y-z)+z);
				j2[i][n] = (int)Math.floor(Math.random()*(y-z)+z);
				y += 10;
				z += 10;	
			}
			y = 10;
			z = 1;
		}

		
			do {
			
				pintar_cartones();
				
				//Verifica la linea, si sale asigna true al booleano linea para que no vuelva a salir linea
				if (linea == false) {
					if (verificar_linea(j1) == false) {
						
						System.out.println("\nEl jugador 1 ha cantado LINEA");
						dineroj1 += 100;
						premio(dineroj1, dineroj2);
						linea = true;
						
					}
					if (verificar_linea(j2) == false) {
						
						System.out.println("\nEl jugador 2 ha cantado LINEA\n");
						dineroj2 += 100;
						premio(dineroj1, dineroj2);
						linea = true;
						
					}
				}

				//Saca el numero 
				int random = (int) Math.floor(Math.random()*(49-1)+1); 
				System.out.println("\nHa salido el numero " + random);
				
				//Presionar enter para continuar
				System.out.println("\nPresione enter para continuar\n\n");
				seguir = (String) sn.nextLine();
				
				//Asigna 0 al numero que ha salido
				for (int i = 0; i <=2; i++) {
					for (int n = 0; n <= 4; n++) {
						if (j1[n][i] == random) {
							j1[n][i] = 0;
						}
						if (j2[n][i] == random) {
							j2[n][i] = 0;
						}
					}
				}
				
				
			} while (verificar_bingo(j1) == true &&  verificar_bingo(j2) == true);
			
			pintar_cartones();
			
			//Verifica quien ha sacado bingo, lo muestra por pantalla y suma el dinero
			if (verificar_bingo(j1) == false) {
				
				System.out.println("\nEl jugador 1 ha cantado BINGO");
				dineroj1 += 500;

			}
			if (verificar_bingo(j2) == false) {
				
				System.out.println("\nEl jugador 2 ha cantado BINGO\n");
				dineroj2 += 500;
				
			}
			
			premio(dineroj1, dineroj2);
			
		}
	
	public static void premio(int n1, int n2) {

		System.out.println("\n\nDinero Acumulado\n________________");
		System.out.println(" Jugador 1: " + n1);
		System.out.println(" Jugador 2: " + n2);
		
	}
	
	public static void tablero(int[][] t) {
		
		for (int i = 0; i <=2; i++) {
			for (int n = 0; n <= 4; n++) {
				if (t[n][i] == 0) {
					System.out.printf("%3s", "X" + "|" );
				}
				else {
					System.out.printf("%3s", t[n][i] + "|");
				}
			}
			System.out.println();
		}
		
	}
	
	public static boolean verificar_linea(int[][] n1) {
		
		int contj = 0;
		
		for (int i = 0; i <=2; i++) {
			contj = 0;
			for (int n = 0; n <= 4; n++) {
				if (n1[n][i] == 0) {
					contj++;						
				}
			}
			if (contj == 5) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean verificar_bingo(int[][] n1) {
		
		int contj = 0;
		
		for (int i = 0; i <=2; i++) {
			for (int n = 0; n <= 4; n++) {
				if (n1[n][i] == 0) {
					contj++;						
				}
			}
			if (contj == 15) {
				return false;
			}
		}
		return true;
	}

	public static void pintar_cartones() {
		System.out.println("___________");
		System.out.println("|Jugador 1|");
		System.out.println("___________\n");
		
		tablero(j1);
		
		System.out.println("\n\n___________");
		System.out.println("|Jugador 2|");
		System.out.println("___________\n");
	
		tablero(j2);
	}

}