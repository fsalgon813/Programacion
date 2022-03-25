import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		int pass = 122333;
		int cont = 1;
		while(cont <= 4) {
			System.out.println("Introduce la contraseña");
			int password=sn.nextInt();
			
			if (pass == password) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				cont = 5;
			}
			else {
				System.out.println("Lo siento, esa no es la combinacion");
				++cont;
			}
			System.out.println("");
		}	
	}

}