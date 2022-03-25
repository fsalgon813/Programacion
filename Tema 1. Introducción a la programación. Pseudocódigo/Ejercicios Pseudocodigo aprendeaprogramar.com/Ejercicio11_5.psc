Algoritmo Ejercicio11_5
	
	Escribir "Dime una frase y te dire cuantas palabras tiene"
	Leer frase
	longitudf = Longitud(frase)
	Para x<-1 Hasta longitudf Hacer
		Si Subcadena(frase,x,x) = " " Entonces
			c = c + 1
		FinSi
	FinPara
	Escribir "La frase tiene " c + 1 " palabras"
	
FinAlgoritmo
