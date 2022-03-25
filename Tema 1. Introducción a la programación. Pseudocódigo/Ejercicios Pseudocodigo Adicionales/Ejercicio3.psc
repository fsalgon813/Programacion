Algoritmo Ejercicio3
	
	Escribir "Dime un numero de 3 cifras y te si es capicua o no"
	Leer n
	
	u = n % 10
	d = (n % 100 - u)/10
	c = (n % 1000 - n % 100) / 100
	
	Si c = u Entonces
		Escribir "El numero es capicua"
	SiNo
		Escribir "El numero no es capicua"
	FinSi
	
FinAlgoritmo
