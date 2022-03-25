import java.util.Scanner;
public class main {

	static Empleado emp[] = new Empleado[3];
	
	
	public static void main(String[] args) {
		for (int x = 0; x < emp.length; x++) {
			emp[x] = new Empleado();
		}
		Scanner sn = new Scanner(System.in);
		
		int e;
		String c;
		double d;
		boolean b;
		
		for (int x = 0; x < emp.length; x++) {
			System.out.println("Introduce los datos del empleado " + x);
			System.out.println("Introduce el nif: ");
			c = sn.nextLine();
			emp[x].setNif(c);
			System.out.println("Introduce el nombre: ");
			c = sn.next();
			emp[x].setNombre(c);
			System.out.println("Introduce el Sueldo Base: ");
			d = sn.nextDouble();
			emp[x].setSueldoBase(d);
			System.out.println("Introduce las Horas Extra: ");
			e = sn.nextInt();
			emp[x].setHorasExtras(e);
			System.out.println("Introduce el tipo de IRPF: ");
			d = sn.nextDouble();
			emp[x].setTipoIRPF(d);
			System.out.println("Introduce si estas casado o no: ");
			b = sn.nextBoolean();
			emp[x].setCasado(b);
			System.out.println("Introduce el numero de hijos: ");
			e = sn.nextInt();
			emp[x].setnumeroHijos(e);			
		}
		
		System.out.println("Cual es el importe de las horas extra");
		Empleado.setpagoHorasExtra(sn.nextDouble());
		
		//Usamos el metodo burbuja para ordenar el salario
		int a = 0;
		for (int i = 0; i < emp.length; i++) {
			for (int n = 0; n < emp.length - 1; n++) {
				if(emp[n].getSueldoBase() > a) {
					a = (int) emp[n+1].getSueldoBase();
					emp[n+1].setSueldoBase(emp[n].getSueldoBase());
					emp[n].setSueldoBase(a);
				}
			}
		}
		
		System.out.println("El empleado que mas cobra es el empleado " + emp.length);
		System.out.println("Datos del empleado" + emp.length + ": \n" + emp[emp.length-1].toString());
		System.out.println("El empleado que menos cobra es el empleado 0");
		System.out.println("Datos del empleado 0: \n" + emp[0].toString());
		
		
		System.out.println("Los empleados ordenados por salario de menor a mayor son:");
		for(int n = 0; n <= emp.length - 1; n++) {
			System.out.println(emp[n].toString());
		}
		sn.close();

	}

}
