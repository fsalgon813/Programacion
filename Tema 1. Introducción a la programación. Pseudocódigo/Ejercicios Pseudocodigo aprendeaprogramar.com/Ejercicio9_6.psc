Algoritmo Ejercicio9_6
	
	Dimension n[7]
	Para x<-1 Hasta 7 Hacer
		Escribir "Dime el numero " x
		Leer n[x]
	FinPara
	
	mayorr = n[1]
	
	Para i = 2 Hasta 7 Hacer
		Si n[i] > mayorr
			mayorr = n[i]
		FinSi
	FinPara
	
	Escribir "El mayor es: " mayorr
	
FinAlgoritmo
