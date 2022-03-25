import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		//Creacion de cuenta 1
		Cuenta c1 = new Cuenta();
		System.out.println("Introduce el nombre del cliente");
		String n = sn.nextLine();
		c1.setNombre_cliente(n);
		System.out.println("Introduce el numero de cuenta");
		String nc = sn.nextLine();
		c1.setNumero_cuenta(nc);
		System.out.println("Introduce el tipo de interes");
		double ti = sn.nextDouble();
		c1.setTipo_interes(ti);
		System.out.println("Introduce el saldo");
		double s = sn.nextDouble();
		c1.setSaldo(s);
		
		//Muestreo de datos de cuenta 1
		System.out.println("Cuenta 1");
		System.out.println("Nombre cliente: " + c1.getNombre_cliente());
		System.out.println("Nombre cuenta: " + c1.getNumero_cuenta());
		System.out.println("Tipo interes: " + c1.getTipo_interes());
		System.out.println("Saldo: " + c1.getSaldo());
		
		
		//Creacion cuenta 2
		Cuenta c2 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);
		
		//Creacion cuenta 3
		Cuenta c3 = new Cuenta(c1);
		
		//Ingreso a cuenta 1
		c1.ingreso(300);
		System.out.println("\nSaldo de la cuenta 3 tras el ingreso: " + c1.getSaldo() + "\n");
		
		//Muestreo de datos de cuenta 2
		System.out.println("Cuenta 2");
		System.out.println("Nombre cliente: " + c2.getNombre_cliente());
		System.out.println("Nombre cuenta: " + c2.getNumero_cuenta());
		System.out.println("Tipo interes: " + c2.getTipo_interes());
		System.out.println("Saldo: " + c2.getSaldo());
		
		//Muestreo de datos de cuenta 3
		System.out.println("Cuenta 3");
		System.out.println("Nombre cliente: " + c3.getNombre_cliente());
		System.out.println("Nombre cuenta: " + c3.getNumero_cuenta());
		System.out.println("Tipo interes: " + c3.getTipo_interes());
		System.out.println("Saldo: " + c3.getSaldo());
		
		//Transferencea desde la cuenta 3 a la cuenta 2
		c3.transferencia(c2, 200);
		System.out.println("\nSaldo cuenta 3 tras la transferencia: "+ c3.getSaldo());
		
		sn.close();		
	}

}
