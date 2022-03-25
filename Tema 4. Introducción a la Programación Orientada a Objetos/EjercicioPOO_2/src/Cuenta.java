
public class Cuenta {

	private String nombre_cliente;
	private String numero_cuenta;
	private double tipo_interes;
	private double saldo;
	
	public Cuenta() {
		
	}
	
	public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes, double saldo) {
		
		this.nombre_cliente = nombre_cliente;
		this.numero_cuenta = numero_cuenta;
		this.tipo_interes = tipo_interes;
		this.saldo = saldo;
		
	}
	
	public Cuenta(final Cuenta c) {
		
		nombre_cliente = c.nombre_cliente;
		numero_cuenta = c.numero_cuenta;
		tipo_interes = c.tipo_interes;
		saldo = c.saldo;
		
	}
	
	//Getters
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	
	public double getTipo_interes () {
		return tipo_interes;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	//Setters
	
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public void setTipo_interes(double tipo_interes) {
		this.tipo_interes = tipo_interes;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//Metodos
	public boolean ingreso (double i) {
		if (saldo > 0) {
			saldo += i;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean reintegro (double i) {
		if (i < 0 || saldo < i) {
			return false;
		}
		else {
			saldo -= i;
			return true;
		}
	}
	
	public boolean transferencia (Cuenta c, double i) {
		if (i < 0 || saldo < i) {
			return false;
		}
		else {
			c.saldo -= i;
			saldo += i;
			return true;
		}
	}
	
}
