Algoritmo Ejercicio8
	
	Escribir "Vamos a calcular el area de un triangulo"
	Escribir "Cuanto mide la base del triangulo"
	Leer baset
	Escribir "Cuanto mide la altura del triangulo"
	Leer alturat
	areat = (baset * alturat)/2
	Escribir "El area del triangulo es: " areat
	
	Escribir "Ahora vamos a calcular el area de un circulo"
	Escribir "Cuanto mide el radio del triangulo"
	Leer radioc
	areac = pi * radioc^2
	Escribir "El area del circulo es: " areac
	
	Si areac > areat Entonces
		Escribir "El area del circulo es mayor que la del triangulo"
	SiNo
		Escribir "El area del triangulo es mayor que la del circulo"
	FinSi
	
FinAlgoritmo
