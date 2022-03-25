
public class Tecnico extends Operario {

	//Constructores
	public Tecnico() {
		
	}
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()  + "-> Opearario -> Tecnico";
	}
}
