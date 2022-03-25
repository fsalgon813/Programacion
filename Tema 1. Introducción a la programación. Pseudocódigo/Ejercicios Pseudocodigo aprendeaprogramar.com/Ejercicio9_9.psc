Algoritmo Ejercicio9_9
	
	Dimension n[2,2]
	Para i<-1 Hasta 2 Hacer
		Para x<-1 Hasta 2 Hacer
			Escribir "Dime el numero " i " de la columna " x
			Leer n[x,i]
		FinPara
	FinPara
	Escribir "El determinante de esa matriz es: " (n[1,1] * n[2,2]) - (n[1,2] * n[2,1])
	
FinAlgoritmo
