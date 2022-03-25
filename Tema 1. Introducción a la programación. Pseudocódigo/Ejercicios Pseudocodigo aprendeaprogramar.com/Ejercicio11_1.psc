Algoritmo Ejercicio11_1
	
	Escribir "Dime tu nombre"
	Leer nombre
	longitudn = Longitud(nombre)
	Escribir Sin Saltar "Tu nombre al reves seria: "
	Para x<-longitudn Hasta 1 Hacer
		Escribir Sin Saltar Subcadena(nombre, x, x)
	FinPara
	Escribir ""
FinAlgoritmo
