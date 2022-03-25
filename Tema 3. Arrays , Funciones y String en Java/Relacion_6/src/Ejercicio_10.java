import java.util.Scanner;
public class Ejercicio_10 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
        char[] a1 = "eikmpqrstuv".toCharArray();
        char[] a2 = "pviumterkqs".toCharArray();
        
        System.out.println("Introduzca la cadena a codificar");
        String c = sn.nextLine();
        
        String codificada = codificaCadena(a1, a2, c);

        System.out.println("La cadena codificada es: " + codificada);

        String decodificada = codificaCadena(a1, a2, codificada);
  
        System.out.println("La cadena decodificada es " + decodificada);
		
		
	}

	 public static char codifica(char[] a, char[] b, char c) {
	        char resultado = Character.toLowerCase(c);
	        boolean encontrado = false;
	        for (int i = 0; i < a.length && !encontrado; i++) {
	            if (resultado == a[i]) {
	                resultado = b[i];
	                encontrado = true;
	            }
	        }
	        return resultado;
	    }
	    
	    public static String codificaCadena(char[] a, char[] b, String c) {
	        String codificada = "";
	        for (int i = 0; i < c.length(); i++) {
	            codificada += codifica(a, b, c.charAt(i));
	        }
	        return codificada;
	    }
	
}
