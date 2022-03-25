
public class Contador {

	private int cont;
	
	//Constructores
	public Contador() {
		
	}
	
	public Contador(int cont) {
		this.cont = cont;
	}
	
	public Contador (final Contador c) {
		this.cont = c.cont;
	}
	
	//Getters
	public int getContador() {
		return cont;
	}
	
	//Setters
	public void setContador(int cont) {
		this.cont = cont;
	}
	
	//Metodos
	public void incrementar () {
		cont++;
	}
	
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
	
}
