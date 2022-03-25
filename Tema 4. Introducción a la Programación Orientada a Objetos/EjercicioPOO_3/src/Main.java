
public class Main {

	public static void main(String[] args) {
		
		//Construir cont 1
		Contador c1 = new Contador();
		
		//Asignar valor a cont 1
		c1.setContador(20);
		
		//Incremento de contador
		c1.incrementar();
		
		//Muestro valor cont 1
		System.out.println("Valor contador 1: " + c1.getContador());
		
		//Incremento valor 2 veces
		for (int x = 0; x < 2; x++) {
			c1.incrementar();
		}
		
		//Muestro valor cont 1
		System.out.println("Valor contador 1: " + c1.getContador());
		
		//Decrementamos el contador
		c1.decrementar();
		
		//Muestro valor cont 1
		System.out.println("Valor contador 1: " + c1.getContador());
		
		//Creamos nuevo contador con valor inicial de 10
		Contador c2 = new Contador(10);
		
		//Incrementamos y decrementamos el cont2
		c2.incrementar();
		c2.decrementar();
		
		//Mostramos el valor del cont2
		System.out.println("Valor contador 2: " + c2.getContador());
		
		//Creamos una copia de contador 2
		Contador c3 = new Contador(c2);
		
		//Mostramos el valor de cont3
		System.out.println("Valor contador 3: " + c3.getContador());
		
	}

}
