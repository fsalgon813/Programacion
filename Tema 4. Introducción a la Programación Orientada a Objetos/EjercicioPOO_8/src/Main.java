import java.util.Scanner;
public class Main {

	static Scanner sn = new Scanner(System.in);
	static int cont = 0;
	
	public static void main(String[] args) {

		Disco d[] = new Disco[100];
		for (int x = 0; x < d.length; x++) {
			d[x] = new Disco();
		}
		
		boolean seguir = true;
		
		while (seguir) {
			menuOpciones();
			System.out.println("Seleccione una opcion del 1 al 5");
			int opcion = sn.nextInt();
			switch (opcion) {
				case 1:
					System.out.println("Los discos que hay son: ");
					listadoDiscos(d);
					break;
				case 2:
					nuevoDisco(d);
					break;
				case 3:
					System.out.println("Introduce el codigo del disco a modificar: ");
					String mod = sn.next();
					modificarDisco(d, mod);
					break;
				case 4:
					System.out.println("Introduce el codigo del disco a borrar: ");
					String del = sn.next();
					borrarDisco(d, del);
					break;
				case 5:
					seguir = false;
			}
		}
		
	}
	
	public static void menuOpciones() {
		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	public static void listadoDiscos(Disco d[]) {
		for (int x = 0; x <= d.length - 1; x++) {
			if (!d[x].getCodigo().equals("LIBRE")) {
				System.out.println("El disco " + x + " tiene los datos: " );
				System.out.println(d[x].toString());
			}
		}
	}
	
	public static void nuevoDisco(Disco d[]) {
		System.out.println("\nIntroduce el codigo del disco");
		String cod = sn.next();
		d[cont].setCodigo(cod);
		System.out.println("Introduce el autor del disco");
		String aut = sn.next();
		d[cont].setAutor(aut);
		System.out.println("Introduce el titulo del disco");
		String tit = sn.next();
		d[cont].setTitulo(tit);
		System.out.println("Introduce el genero del disco");
		String gen = sn.next();
		d[cont].setGenero(gen);
		System.out.println("Introduce la duracion del disco");
		int dur = sn.nextInt();
		d[cont].setDuracion(dur);
		cont++;
	}
	
	public static void modificarDisco(Disco d[], String disco) {
		for (int x = 0; x <= d.length - 1; x++) {
			if (d[x].getCodigo().equals(disco)) {
				System.out.println("Introduce el codigo del disco");
				String cod = sn.next();
				d[x].setCodigo(cod);
				System.out.println("Introduce el autor del disco");
				String aut = sn.next();
				d[x].setAutor(aut);
				System.out.println("Introduce el titulo del disco");
				String tit = sn.next();
				d[x].setTitulo(tit);
				System.out.println("Introduce el genero del disco");
				String gen = sn.next();
				d[x].setGenero(gen);
				System.out.println("Introduce la duracion del disco");
				int dur = sn.nextInt();
				d[x].setDuracion(dur);
			}
		}
	}
	
	public static void borrarDisco(Disco d[], String disco) {
		for (int x = 0; x <= d.length - 1; x++) {
			if (d[x].getCodigo().equals(disco)) {
				d[x].setCodigo("LIBRE");
				d[x].setAutor(null);
				d[x].setTitulo(null);
				d[x].setGenero(null);
				d[x].setDuracion(0);
			}
		}
	}
}
