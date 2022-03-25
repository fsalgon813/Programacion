
public class Fraccion {

	private int num;
	private int den;
	
	//Constructores
	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}
	
	public Fraccion (int num, int den) {
		this.num = num;
		this.den = den;
	}

	public Fraccion (int num) {
		this.num = num;
		this.den = 1;
	}
	
	//Getters y Setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	
	//Metodos
	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(den);
		
		if (v == 0) {
			return u;
		}
		
		int r;
		
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		
		return u;
		
	}
	
	private void simplificar() {
		int n = mcd();
		this.num /= n;
		this.den /= n;
	}
	
	public Fraccion sumar(Fraccion f) {
		Fraccion i = new Fraccion();
		i.num = this.num * f.den + this.den * f.num;
		i.den = this.den * f.den;
		i.simplificar();
		return i;
	}
	
	public Fraccion restar(Fraccion f) {
		Fraccion i = new Fraccion();
		i.num = this.num * f.den - this.den * f.num;
		i.den = this.den * f.den;
		i.simplificar();
		return i;
	}
	
	public Fraccion multiplicar(Fraccion f) {
		Fraccion i = new Fraccion();
		i.num = this.num * f.num;
		i.den = this.den * f.den;
		i.simplificar();
		return i;
	}
	
	public Fraccion dividir(Fraccion f) {
		Fraccion i = new Fraccion();
		i.num = this.num * f.den;
		i.den = this.den * f.num;
		i.simplificar();
		return i;
	}
	
	public String toString() {
		String s;
		s = num + "/" + den;
		return s;
	}
	
}
