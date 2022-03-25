
public class main {

	public static void main(String[] args) {

		//Creamos las fracciones
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(1, 2);
		Fraccion f3 = new Fraccion();
		Fraccion f4 = new Fraccion(4);
		
		//Operadores aritmeticos
		Fraccion suma = f1.sumar(f2);
		Fraccion resta = f1.restar(f3);
		Fraccion multiplica = f1.multiplicar(f4);
		Fraccion divide = f1.dividir(f2);
		
		//Mostrar resultados
		System.out.println(f1.toString() + " + " + f2.toString() + " = " + suma.toString());
		System.out.println(f1.toString() + " - " + f3.toString() + " = " + resta.toString());
		System.out.println(f1.toString() + " * " + f4.toString() + " = " + multiplica.toString());
		System.out.println(f1.toString() + " / " + f2.toString() + " = " + divide.toString());

	}

}
