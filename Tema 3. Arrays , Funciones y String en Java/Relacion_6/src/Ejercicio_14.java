import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {

		Scanner sn = new Scanner (System.in);
        System.out.println("Introduce la palabra: ");
        String pass = sn.nextLine();
        for (int i= 0; i < 20; i++) {
            System.out.println("");
        }
        String anagrama = anagramaAlAzar(pass);
        System.out.println("El anagrama es " + anagrama);
        char c[];
        //c= pass.toCharArray();
        boolean adivina = false;
        
        System.out.println("Pistas...");
        
        System.out.println("Numero de caracteres: " + pass.length());
        System.out.println("Caracter inicial: " + pass.charAt(0));//c[0]);
        System.out.println("Caracter final: " + pass.charAt(pass.length()-1));//c[c.length-1]);
        
        while (!adivina){
            System.out.println("Adivina la contraseña: ...");
            String intento = sn.nextLine();
            
            if (pass.equals(intento)){
                adivina=true;
            } else {
                int r;
                r=pass.compareTo(intento);
                if(r>0){
                    System.out.println("La contraseña es posterior alfabéticamente");
                }else {
                    System.out.println("La contraseña es anterior alfabéticamente");
                }
            }
            
        }     

	}
	
	public static String anagramaAlAzar(String cadena) {
        char[] tabla = cadena.toCharArray();
        
        for (int i = 0; i < tabla.length; i++) {
        	
            int i1 = (int)(Math.random() * tabla.length);
            int i2 = (int)(Math.random() * tabla.length);
            
            char aux = tabla[i1];
            tabla[i1] = tabla[i2];
            tabla[i2] = aux;
        }
        return new String(tabla);
    }

}
