import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce una frase y la devuelvo al reves");
		String a = sn.nextLine();
		for(int x = a.length() - 1; x >= 0; x--) {
			System.out.print(a.substring(x,x + 1));
		}
		
		sn.close();
	}
	
}
