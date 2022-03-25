Algoritmo Ejercicio4
	
	Escribir "Dime un numero entero"
	Leer num1
	Escribir "Dime otro numero entero"
	Leer num2
	
	Si num1%num2 = 0 Entonces
		Escribir num1 " es multiplo de " num2
	SiNo
		Si num2%num1 = 0 Entonces
			Escribir num2 " es multiplo de " num1
		SiNo
			Escribir "No son multiplo"
		FinSi
	FinSi
	
FinAlgoritmo