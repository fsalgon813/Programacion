import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio_12 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
				
        System.out.println("Introduzca la primera palabra");
        String palabra1 = sn.nextLine();
        System.out.println("Introduzca la segunda palabra");
        String palabra2 = sn.nextLine();
        System.out.println("Las palabras " + (Anagrama(palabra1, palabra2)?"":"no ") + "son anagramas");

	}
	
	public static boolean Anagrama(String p1,String p2) {
		boolean resultado;
        if (p1.length() != p2.length()) {
            resultado = false;
        } else {
            char[] c1 = p1.toCharArray();
            char[] c2 = p2.toCharArray();
            Arrays.sort(p1);
            Arrays.sort(p2);
            resultado = Arrays.equals(c1, c2);
        }
        return resultado;
	}

}
