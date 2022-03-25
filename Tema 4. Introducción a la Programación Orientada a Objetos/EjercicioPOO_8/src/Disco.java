
public class Disco {

	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;
	
	//Generamos los constructores
	public Disco() {
		
	}
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	public Disco(final Disco d) {
		d.codigo = codigo;
		d.autor = autor;
		d.titulo = titulo;
		d.genero = genero;
		d.duracion = duracion;
	}
	
	//Generamos los Getters y los Setters
	public String getCodigo() {
		return codigo;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString() {
		return "\tCodigo: " + codigo + "\n\tAutor: " + autor + "\n\tTitulo: " + titulo +
				"\n\tGenero: " + genero + "\n\tDuracion: " + duracion;
	}
	
	
}
