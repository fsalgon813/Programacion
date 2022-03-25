Algoritmo Ejercicio9_10
	
	Dimension n[3,3]
	Para i<-1 Hasta 3 Hacer
		Para x<-1 Hasta 3 Hacer
			Escribir "Dime el numero " i " de la columna " x
			Leer n[x,i]
		FinPara
	FinPara
	Escribir "El determinante de esa matriz es: " (n[1,1] * n[2,2] * n[3,3])+(n[1,2] * n[2,3] * n[3,1])+(n[2,1] * n[3,2] * n[1,3]) - (n[3,1] * n[2,2] * n[1,3])-(n[2,1] * n[1,2] * n[3,3])-(n[3,2] * n[2,3] * n[1,1])
	
FinAlgoritmo
