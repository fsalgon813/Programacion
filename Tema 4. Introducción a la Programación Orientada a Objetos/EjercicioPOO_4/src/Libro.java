
public class Libro {

	private String titulo;
	private String autor;
	private int numero_ejemplares;
	private int numero_ejemplares_prestados;
	
	//Constructores
	public Libro() {
		
	}
	
	public Libro (String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numero_ejemplares = numero_ejemplares;
		this.numero_ejemplares_prestados = numero_ejemplares_prestados;
	}
	
	public Libro(final Libro l) {
		this.titulo = l.titulo;
		this.autor = l.autor;
		this.numero_ejemplares = l.numero_ejemplares;
		this.numero_ejemplares_prestados = l.numero_ejemplares_prestados;
	}

	//Getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumero_ejemplares() {
		return numero_ejemplares;
	}

	public int getNumero_ejemplares_prestados() {
		return numero_ejemplares_prestados;
	}

	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumero_ejemplares(int numero_ejemplares) {
		this.numero_ejemplares = numero_ejemplares;
	}

	public void setNumero_ejemplares_prestados(int numero_ejemplares_prestados) {
		this.numero_ejemplares_prestados = numero_ejemplares_prestados;
	}		
	
	
	//Metodos
	public boolean prestamo() {
		if (numero_ejemplares == 0) {
			return false;
		}
		else {
			numero_ejemplares--;
			numero_ejemplares_prestados++;
			return true;
		}
	}
	
	public boolean devolucion() {
		if (numero_ejemplares_prestados == 0) {
			return false;
		}
		else {
			numero_ejemplares_prestados--;
			numero_ejemplares++;
			return true;
		}
	}
	
	//Metodo toString
	public String toString() {
		String datos = "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nNumero Ejemplares: " + this.numero_ejemplares + "\nNumero Ejemplares Prestados: " + this.numero_ejemplares_prestados;
		return datos;
	}
	
}
