
public class Ejercicio_4 {

	public static void main(String[] args) {

		int numero[] = new  int [20];
		int cuadrado[] = new  int [20];
		int cubo[] = new  int [20];

		for (int x = 0; x < 20; x++) {
			numero[x] = (int)Math.floor(Math.random()*(101));
			System.out.print(numero[x] + "\t|\t");
			cuadrado[x] = (int) Math.pow(numero[x], 2);
			System.out.print(cuadrado[x] + "\t|\t\t");
			cubo[x] = (int) Math.pow(numero[x], 3);
			System.out.print(cubo[x] + "\t|\n");
		}
		
		
	}

}
