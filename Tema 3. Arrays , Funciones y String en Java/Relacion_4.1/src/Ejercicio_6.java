import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		
		int array [] = new int [15];
		Scanner sn = new Scanner(System.in);
		int rot [] = new int [15];
		
		for(int x = 0; x < 15; x++) {
			System.out.println("Introduce un numero");
			array[x] = sn.nextInt();
			System.out.println();
		}
		
		for(int x = 0; x < 15; x++) {
			if (x == 0) {
				rot[x] = array[14];
			}
			else if(x < 14 && x > 0) {
				rot[x] = array[x+1];
			}
			else if(x == 14) {
				rot[14] = array[0];
			}
		}
		
		for(int x = 0; x < 15; x++) {
			System.out.println(rot[x]);
			System.out.println();
		}
	}

}
