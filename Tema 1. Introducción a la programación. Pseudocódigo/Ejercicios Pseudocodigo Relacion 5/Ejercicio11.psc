Algoritmo Ejercicio11
	
	Mientras c<>10 Hacer
		
		Escribir "Introduce un numero"
		Leer n
		
		Si n > 0 Entonces
			positivos = n + positivos
		SiNo
			Si n = 0 Entonces
				ncero = ncero + 1
			SiNo
				negativos = n + negativos
				contneg = contneg + 1
			FinSi
		FinSi
		
		c = c + 1
		
	FinMientras
	
	Escribir "La suma te todos los numeros positivos es " positivos
	Escribir "Has introducido " ncero " ceros"
	Escribir "La media de todos los negativos es " negativos / contneg
	
FinAlgoritmo
