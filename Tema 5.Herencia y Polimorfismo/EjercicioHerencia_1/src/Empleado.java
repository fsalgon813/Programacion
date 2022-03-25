
public class Empleado {

	private String nombre;
	
	//Constructores
	public Empleado() {
		
	}
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//toString
	public String toString() {
		return "Empleado " + nombre;
	}
	
}
