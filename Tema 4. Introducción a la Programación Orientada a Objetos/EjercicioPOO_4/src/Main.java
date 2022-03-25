import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		//Creamos el libro 1
		Libro l1 = new Libro("El quijote", "Cervantes", 1, 0);
		
		//Creamos el libro 2
		Libro l2 = new Libro();
		System.out.println("Libro 2");
		System.out.print("Titulo del libro 2: ");
		String t = sn.nextLine();
		l2.setTitulo(t);
		System.out.println("Autor del libro 2: ");
		String a = sn.nextLine();
		l2.setAutor(a);
		System.out.println("Cantidad de ejemplares del libro 2: ");
		int e = sn.nextInt();
		l2.setNumero_ejemplares(e);
		System.out.println("Cantidad de ejemplares prestados del libro 2: ");
		int ep = sn.nextInt();
		l2.setNumero_ejemplares_prestados(ep);
		
		//Mostramos los datos del libro 1
		System.out.println("Libro 1: ");
		System.out.println(l1.toString());
		
		//Hacemos un prestamo del libro 1 y devolvemos true si se puede o false si no se puede
		System.out.println(l1.prestamo());
		
		//Hacemos una devolucion del libro 1 y devolvemos true si se puede o false si no se puede
		System.out.println(l1.devolucion());
		
		
		//Hacemos un prestamo del libro 1 
		l1.prestamo();
		
		//Hacemos un prestamo del libro 1 si no se puede devlovera un mensaje
		l1.prestamo();
		if (l1.prestamo() == false) {
			System.out.println("No quedan ejemplares del libro");
		}
		
		//Mostramos los datos del libro 1
		System.out.println("Libro 1: ");
		System.out.println(l1.toString());
		
		//Mostramos los datos del libro 2
		System.out.println("Libro 2: ");
		System.out.println(l1.toString());
		
		
		
	}

}
