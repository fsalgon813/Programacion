
public class Metodo_burbuja {

	public static void main(String[] args) {
		int arreglo[] = new int [3];
		for (int x = 0; x < arreglo.length; x++) {
	        // Aqu� "y" se detiene antes de llegar
	        // a length - 1 porque dentro del for, accedemos
	        // al siguiente elemento con el �ndice actual + 1
	        for (int y = 0; y < arreglo.length - 1; y++) {
	            int elementoActual = arreglo[y],
	                    elementoSiguiente = arreglo[y + 1];
	            if (elementoActual > elementoSiguiente) {
	                // Intercambiar
	                arreglo[y] = elementoSiguiente;
	                arreglo[y + 1] = elementoActual;
	            }
	        }
	    }

	}

}
