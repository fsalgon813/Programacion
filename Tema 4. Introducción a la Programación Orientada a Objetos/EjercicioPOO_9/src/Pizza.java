
public class Pizza {
	private String tamano;
	private String tipo;
	private String estado;
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	
	//Constructores
	public Pizza(String tipo, String tamano) {
		super();
		this.tamano = tamano;
		this.tipo = tipo;
		estado = "pedida";
		totalPedidas++;
	}

	//Getters y setters
	public String getTamano() {
		return tamano;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public static int getTotalServidas() {
		return totalServidas;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//toString
	public String toString() {
		return "pizza " + tipo + " " + tamano + ", " + estado;
	}
	
	//Metodos
	public void sirve() {
		if (estado.equalsIgnoreCase("servida")) {
			System.out.println("Esta pizza ya se a servido");
		}
		else {
			estado = "servida";
			totalServidas++;
		}
	}
	
	
}
