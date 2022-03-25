import java.util.Scanner;
public class Ejercicio_21 {

	public static void main(String[] args) {
	
		Scanner sn = new Scanner(System.in);
		int n = 0;
		int cont = 0;
		int m = 0;
		int mayor = 0;
		double media = 0;
		int contm = 0;
		
		System.out.println("Introduce numeros y te dire la media de los imppares, el mayor de los pares y cuantos numeros se han introducido");
		System.out.println("Para terminar, introduce un numero negativo");
		n = sn.nextInt();
		
		while( n >= 0) {
			cont++;
			if(n % 2 != 0) {
				media += n;
				contm++;
			}
			else if(n % 2 == 0){
				if(m > n){
					mayor = m; 
				}
				else {
					mayor = n;
				}
				n = m;
			}
			System.out.println("Introduce numeros y te dire la media de los imppares, el mayor de los pares y cuantos numeros se han introducido");
			System.out.println("Para terminar, introduce un numero negativo");
			n = sn.nextInt();
		}
		
		System.out.println("Has introducido " + cont + " numeros");
		System.out.println("El mayor de los pares es: " + mayor);
		System.out.println("La media de los impares es:" + (media / contm));
		
	}
	
}