
public class Oficial extends Operario {

	//Constructores
	public Oficial() {
		
	}
	public Oficial(String nombre) {
		super(nombre);
	}
	
	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "-> Opearario -> Oficial";
	}
}
