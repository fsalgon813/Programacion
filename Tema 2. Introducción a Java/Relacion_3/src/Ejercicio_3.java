
public class Ejercicio_3 {

	public static void main(String[] args) {

		int p, numero;
		String palo = "", num = "";
		
		p = (int)Math.floor(Math.random()*(4));
		numero = (int)Math.floor(Math.random()*(13-1)+1);
		
		switch(p){
			case 0:
				palo = "oro";
				break;
			case 1:
				palo = "espada";
				break;
			case 2:
				palo = "basto";
				break;
			case 3:
				palo = "copa";
				break;
		}
		
		switch(numero) {
			case 1:
				num = "As";
				break;
			case 10:
				num = "Sota";
				break;
			case 11:
				num = "Caballo";
				break;
			case 12:
				num = "Rey";
				break;
			default:
				num = Integer.toString(numero);
		}
		
		System.out.println(num + " de " + palo);
	}

}
