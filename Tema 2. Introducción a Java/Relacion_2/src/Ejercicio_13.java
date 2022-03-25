import java.util.Scanner;
public class Ejercicio_13 {

	public static void main(String[] args) {
		
		int contp = 0;
		int contn = 0;
		
		Scanner sn = new Scanner(System.in);
		for (int x = 0; x <= 10; x++){
		
			System.out.println("Introduce numeros y dire cuantos son positivos y cuantos negativos");
			x = sn.nextInt();
			
			if (x > 0) {
				contp++;
			}
			else if(x < 0){
				contn++;
			}
		}
		System.out.println("Has introducido " + contp + " numeros positivos");
		System.out.println("Has introducido " + contn + " numeros negativos");	}

}
