
public class Ejercicio_11 {

	public static void main(String[] args) {

		int dado1, dado2;
		
		do {
			dado1 = (int)Math.floor(Math.random()*(7-1)+1);
			dado2 = (int)Math.floor(Math.random()*(7-1)+1);
			
			System.out.println("Dado 1: " + dado1 + "\n Dado 2: " + dado2 + "\n________________");
		}while (dado1 != dado2);
		
	}

}
