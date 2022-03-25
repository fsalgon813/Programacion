import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce una frase y te dire si es palindroma");
		String frase = sn.nextLine();
		String f[] = new String[frase.length()];
		String voltea = "";
		for (int x = frase.length()-1; x >= 0; x--) {
			f[x] = frase.substring(x, x+1);
			voltea = voltea.concat(f[x]);
		}
		if (frase.equalsIgnoreCase(voltea)) {
			System.out.println("La frase es palindroma");
		}
		else {
			System.out.println("La frase no es palindroma");
		}
		sn.close();
	}

}
