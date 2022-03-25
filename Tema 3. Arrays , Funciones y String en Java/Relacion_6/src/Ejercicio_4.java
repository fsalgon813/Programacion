import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int cont = 0;
		String espacio = " ";
		
		System.out.println("Introduce una frase y dire cuantos espacios en blanco tiene");
		String frase = sn.nextLine();
		
		for(int x = 0; x <= frase.length() - 1; x++) {
			if (frase.substring(x,x+1).equals(espacio)) {
				cont++;
			}
		}
		
		System.out.println("Tiene " + cont +" espacios");
		sn.close();
	}

}
