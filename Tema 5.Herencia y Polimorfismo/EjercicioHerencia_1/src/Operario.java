
public class Operario extends Empleado {

	
	
	//Constructores
	public Operario() {
		
	}
	public Operario(String nombre) {
		super(nombre);
	}
	
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "-> Opearario";
	}
	
}
