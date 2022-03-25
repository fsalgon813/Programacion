import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {

		int t[] = new int [12];
		Scanner sn = new Scanner(System.in);
		//Tambien se puede hacer con String asignandolo de la siguiente manera String a[] = {"enero", "febrero", etc};
		
		for(int x = 0; x < 12; x++) {
			System.out.println("Introduce un la media del mes " + (x + 1));
			t[x] = sn.nextInt();
			System.out.println();
		}
		
		for(int x = 0; x < 12; x++) {
			switch (x) {
				case 0:
					System.out.print("Enero: ");
					break;
				case 1:
					System.out.print("Febrero: ");
					break;
				case 2:
					System.out.print("Marzo: ");
					break;
				case 3:
					System.out.print("Abril: ");
					break;
				case 4:
					System.out.print("Mayo: ");
					break;
				case 5:
					System.out.print("Junio: ");
					break;
				case 6:
					System.out.print("Julio");
					break;
				case 7:
					System.out.print("Agosto");
					break;
				case 8:
					System.out.print("Septiembre");
					break;
				case 9:
					System.out.print("Octubre");
					break;
				case 10:
					System.out.print("Noviembre");
					break;
				case 11:
					System.out.print("Diciembre");
					break;
			}
				for (int i = 0; i <= t[x]; i++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
	}

}
