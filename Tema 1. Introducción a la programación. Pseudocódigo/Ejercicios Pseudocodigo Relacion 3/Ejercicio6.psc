Algoritmo Ejercicio6
	
	Escribir "Dime un numero entre 0 y 9999"
	Leer n
	
	Si n < 10 Entonces
		Escribir "El numero es de 1 cifra"
	SiNo
		Si n < 100 Entonces
			Escribir "El numero es de 2 cifras"
		SiNo
			Si n < 1000
				Escribir "El numero es de 3 cifras"
			SiNo
				Escribir "El numero es de 4 cifras"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
