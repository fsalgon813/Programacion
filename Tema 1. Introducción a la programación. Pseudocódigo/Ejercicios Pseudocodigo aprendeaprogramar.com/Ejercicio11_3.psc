Algoritmo Ejercicio11_3
	
	Escribir "Dime un nombre y te dire cuantas vocales tiene"
	Leer nombre
	longitudn = Longitud(nombre)
	nombre <- Minusculas(nombre)
	Para x<-1 Hasta longitudn Hacer
		Si Subcadena(nombre,x,x) = "a" o Subcadena(nombre,x,x) = "e" o Subcadena(nombre,x,x) = "i" o Subcadena(nombre,x,x) = "o" o Subcadena(nombre,x,x) = "u" Entonces
			c = c + 1
		FinSi
	FinPara
	Escribir nombre " tiene " c " vocales"
	
FinAlgoritmo
