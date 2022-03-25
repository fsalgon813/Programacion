
public class Directivo extends Empleado {

	//Constructores
	public Directivo() {
		
	}
	public Directivo(String nombre) {
		super(nombre);
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "-> Directivo";
	}
}
