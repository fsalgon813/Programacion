
public class Ejercicio_1 {

	public static void main(String[] args) {

		int dado1, dado2, dado3;
		
		dado1 = (int)Math.floor(Math.random()*(7-1)+1);
		dado2 = (int)Math.floor(Math.random()*(7-1)+1);
		dado3 = (int)Math.floor(Math.random()*(7-1)+1);
		
		System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\nDado 3: " + dado3 + "\nLa suma de los 3 dados es: " + (dado1 + dado2 + dado3));
		
	}

}
