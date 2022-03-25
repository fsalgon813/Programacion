
public class Ejercicio_10 {

	public static void capicua() {
		
		for(int n = 1; n <= 99999; n++) {
			int y = 0, inverso = 0, z = n;
			 
			while (z > 0) {
				
				y = z%10;
				inverso = y + inverso * 10;
				z /= 10;
				
			}
			
			if (n == inverso) {
				System.out.println(n);
			}
		}
		
	}
	
	public static void main(String[] args) {

		capicua();

	}

}
