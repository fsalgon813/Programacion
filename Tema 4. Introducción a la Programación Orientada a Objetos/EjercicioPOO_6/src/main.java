import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		Fecha fecha = new Fecha();

		System.out.println("Introduce fecha:");
		System.out.print("dia: ");
		int d = sn.nextInt();
		fecha.setDia(d);
		System.out.print("mes: ");
		int m = sn.nextInt();
		fecha.setMes(m);
		System.out.print("año: ");
		int a = sn.nextInt();
		fecha.setAnyo(a);
		
		
		if(fecha.fechaCorrecta()) {
			System.out.println(fecha.toString());
		}
		
		System.out.println("Los 10 dias siguientes son: ");
		for (int x = 1; x <=10; x++) {
			fecha.diaSiguiente();
			System.out.println(fecha.toString());
		}
		
		sn.close();
	}

}
