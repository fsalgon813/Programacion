Algoritmo Ejercicio11_2
	
	Escribir "Dime tu nombre y te alterno las mayusculas y las minusculas"
	Leer nombre
	longitudn = Longitud(nombre)
	
	Para x<-0 Hasta longitudn Hacer
		Si x % 2 = 0 Entonces
			Escribir Sin Saltar Minusculas(Subcadena(nombre, x, x))
		SiNo
			Escribir Sin Saltar Mayusculas(Subcadena(nombre, x, x))
		FinSi
	FinPara
	
	
FinAlgoritmo
