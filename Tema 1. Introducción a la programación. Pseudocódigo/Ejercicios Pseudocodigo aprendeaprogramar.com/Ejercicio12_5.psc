Algoritmo Ejercicio12_5
	
	Escribir "Dime 3 numeros y te dire cual es el mayor de los tres"
	Leer x1,x2,x3
	MayorDeTres(x1,x2,x3)
	
FinAlgoritmo


SubProceso MayorDeTres(n1,n2,n3)
	
	Si n1 > n2 y n1 > n3 Entonces
		Escribir "El mayor de los numeros es: " n1
	SiNo
		Si n2 > n1 y n2 > n3 Entonces
			Escribir "El mayor de los numero es: " n2
		SiNo
			Si n3 > n1 y n3 > n2 Entonces
				Escribir "El mayor de los numeros es: " n3
			FinSi
		FinSi
	FinSi
	
FinSubProceso
	