import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		String user1;
		String user2;
		int comparacion;
		
		System.out.println("¿Quieres jugar a la primera version o a la segunda?(Poner 1 o 2)");
		int opcion = sn.nextInt();
		if (opcion == 1) {
			System.out.println("Jugador 1: Introduce la contraseña");
			user1 = sn.next();
			do {
				System.out.println("Jugador 2: Intenta averiguarla. El primer caracter es: " + user1.charAt(0) + " y el ultimo caracter es: " + user1.charAt(user1.length()-1));
				user2 = sn.next();
			}while(!(user1.equals(user2)));
		}
		else if (opcion == 2){
				System.out.println("Jugador 1: Introduce la contraseña");
				user1 = sn.next();
				System.out.println("Jugador 2: Intenta averiguarla ");
				user2 = sn.next();
				do {
					comparacion = user1.compareTo(user2);
					if (comparacion > 0) {
						System.out.println("Jugador 2: Intenta averiguarla. La constraseña es mayor lexicamente");
					}
					else if (comparacion < 0) {
						System.out.println("Jugador 2: Intenta averiguarla. La constraseña es menor lexicamente");
					}
					user2 = sn.next();
				}while(!(user1.equals(user2)));
		}
		
		sn.close();
	}

}
