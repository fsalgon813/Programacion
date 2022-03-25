Algoritmo Ejercicio6
	
	Escribir "Dime un numero de 3 cifras y te dire su centena, su decena y su unidad"
	Leer n
	
	u = n % 10
	d = (n % 100 - u)/10
	c = (n % 1000 - n % 100) / 100
	
	Escribir "La centena es: " c
	Escribir "La decena es: " d
	Escribir "La unidad es: " u
	
FinAlgoritmo
