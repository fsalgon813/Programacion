
public class Fecha {

	private int dia;
	private int mes;
	private int anyo;
	
	//Constructores
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	
	//Getters y Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	//Metodos
	private boolean bisiesto() {
		if(anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public boolean fechaCorrecta() {
		boolean d,m;
		
		if(mes >= 0 && mes <= 12) {
			m = true;
		}
		else {
			m = false;
		}
		
		switch(mes) {
			case 2:
				if (dia == 29 && bisiesto()) {
					d = true;
				}
				else if (dia > 0 && dia < 28){
					d = true;
				}
				else {
					d = false;
				}
				break;
			case 4:
				if(dia > 0 && dia < 30) {
					d = true;
				}
				else {
					d = false;
				}
				break;
			case 6:
				if(dia > 0 && dia < 30) {
					d = true;
				}
				else {
					d = false;
				}
				break;
			case 9:
				if(dia > 0 && dia < 30) {
					d = true;
				}
				else {
					d = false;
				}
				break;
			case 11:
				if(dia > 0 && dia < 30) {
					d = true;
				}
				else {
					d = false;
				}
				break;
			default:
				if(dia > 0 && dia < 31) {
					d = true;
				}
				else {
					d = false;
				}
				break;
		}
		if (d == true && m == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				anyo++;
			}
		}
	}
	
	public String toString() {
		String fecha;
		
		if (dia < 10) {
			fecha = "0" + dia + "-";
		}
		else {
			fecha = dia + "-";
		}
		
		if (mes < 10) {
			fecha += "0" + mes + "-";
		}
		else {
			fecha += mes + "-";
		}
		
		fecha += anyo;
		
		return fecha;
	}
	
}
