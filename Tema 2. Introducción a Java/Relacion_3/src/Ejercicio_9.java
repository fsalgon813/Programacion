
public class Ejercicio_9 {

	public static void main(String[] args) {

		int n;
		int suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0;
		
		for (int x = 0; x < 20; x++){
			n = (int)Math.floor(Math.random()*(11));
			
			switch(n){
				case 0:
					System.out.println("Insuficiente");
					suspenso++;
					break;
				case 1:
					System.out.println("Insuficiente");
					suspenso++;
					break;
				case 2:
					System.out.println("Insuficiente");
					suspenso++;
					break;
				case 3:
					System.out.println("Insuficiente");
					suspenso++;
					break;
				case 4:
					System.out.println("Insuficiente");
					suspenso++;
					break;
				case 5:
					System.out.println("Suficiente");
					suficiente++;
					break;
				case 6:
					System.out.println("Bien");
					bien++;
					break;
				case 7:
					System.out.println("Notable");
					notable++;
					break;
				case 8:
					System.out.println("Notable");
					notable++;
					break;
				case 9:
					System.out.println("Sobresaliente");
					sobresaliente++;
					break;
				case 10:
					System.out.println("Sobresaliente");
					sobresaliente++;
					break;
		}
			
		}

		System.out.println("\n\nSuspensos: " + suspenso + "\nSuficientes: " + suficiente + "\nBien: " + bien + "\nNotables: " + notable + "\nSobresalientes: " + sobresaliente);
		
	}

}
