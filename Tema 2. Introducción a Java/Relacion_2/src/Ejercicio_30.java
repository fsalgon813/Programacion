import java.util.Scanner;
public class Ejercicio_30 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		int d1 = 0;
		int d2 = 0;
		boolean comprobacion = true;
		String dia1;
		String dia2;
		int hora1;
		int hora2;
		int cant;

		do {
			
			System.out.println("Por favor, introduzca la primera hora");
			System.out.print("Dia: ");
			dia1 = sn.next();
			System.out.print("Hora: ");
			hora1 = sn.nextInt();
			
			System.out.println("Por favor, introduzca la segunda hora");
			System.out.print("Dia: ");
			dia2 = sn.next();
			System.out.print("Hora: ");
			hora2 = sn.nextInt();
			
			switch (dia1){
				case "Lunes":
				case "lunes":
				case "1":
					d1 = 1;
					break;
				case "Martes":
				case "martes":
				case "2":
					d1 = 2;
					break;
				case "Miercoles":
				case "miercoles":
				case "3":
					d1 = 3;
					break;
				case "Jueves":
				case "jueves":
				case "4":
					d1 = 4;
					break;
				case "Viernes":
				case "viernes":
				case "5":
					d1 = 5;
					break;
				case "Sabado":
				case "sabado":
				case "6":
					d1 = 6;
					break;
				case "Domingo":
				case "domingo":
				case "7":
					d1 = 7;
					break;
				default:
					d1 = 0;
					break;
			}
			switch (dia2){
				case "Lunes":
				case "lunes":
				case "1":
					d2 = 1;
					break;
				case "Martes":
				case "martes":
				case "2":
					d2 = 2;
					break;
				case "Miercoles":
				case "miercoles":
				case "3":
					d2 = 3;
					break;
				case "Jueves":
				case "jueves":
				case "4":
					d2 = 4;
					break;
				case "Viernes":
				case "viernes":
				case "5":
					d2 = 5;
					break;
				case "Sabado":
				case "sabado":
				case "6":
					d2 = 6;
					break;
				case "Domingo":
				case "domingo":
				case "7":
					d2 = 7;
					break;	
				default:
					d2 = 0;
					break;
			}
			
			comprobacion = true;
			
			if (d1 >= d2){
				System.out.println("El primer dia tiene que ser anterior al segundo");
				comprobacion = false;
			}
			if (d1 == 0) {
				System.out.println("Los datos introducidos no son correctos");
				comprobacion = false;
			}
			if (d2 == 0) {
				System.out.println("Los datos introducidos no son correctos");
				comprobacion = false;
			}
			
		}while (comprobacion = false);
		
		cant = ((d2 * 24) + hora2) - ((d1 * 24) + hora1);
		
		System.out.println("Entre las " + hora1 + ":00 del " + dia1 + " y las " + hora2 + ":00 del " + dia2 + " hay " + cant + " horas");
		
	}	

}
