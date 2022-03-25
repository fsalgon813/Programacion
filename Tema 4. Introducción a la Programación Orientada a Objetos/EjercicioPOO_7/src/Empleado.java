
public class Empleado {

	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private double tipoIRPF;
	private boolean casado;
	private int numeroHijos;
	private static double pagoHorasExtra;
	
	//Constructores
	public Empleado() {
		
	}
	public Empleado(String nif, String nombre, double sueldoBase, int horasExtras, double tipoIRPF, boolean casado,	int numeroHijos) {
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.tipoIRPF = tipoIRPF;
		this.casado = casado;
		this.numeroHijos = numeroHijos;
	}


	//Getters y Setters
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	public double getTipoIRPF() {
		return tipoIRPF;
	}
	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public static double getpagoHorasExtra() {
		return pagoHorasExtra;
	}
	public static void setpagoHorasExtra(double pagoHorasExtra) {
		Empleado.pagoHorasExtra = pagoHorasExtra;
	}
	public int getnumeroHijos() {
		return numeroHijos;
	}
	public void setnumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	
	//toString
	public String toString() {
		char c;
		if (casado)
			c = 'S';
		else
			c = 'N';
		return (nif + nombre + "\nSueldo Base: " + sueldoBase + "\ntipo IRPF: " + tipoIRPF + "\nCasado: " + c + "\nNumero de Hijos: " + numeroHijos);
	}
	
	//Metodos
	public double complementoHorasExtra() {
		return horasExtras * pagoHorasExtra;
	}
	public double sueldoBruto() {
		return sueldoBase + complementoHorasExtra();
	}
	public double retencionesIRPF() {
		double n = tipoIRPF;
		if (casado) {
			n -= 2;
		}
		n -= numeroHijos;
		if (n < 0) {
			n = 0;
		}
		return sueldoBruto() * n / 100;
	}
	public double calcularSueldo() {
		return sueldoBruto() - retencionesIRPF();
	}
	
}
