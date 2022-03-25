Algoritmo Ejercicio9_8
	
	Dimension n[10,2]
	
	Para i<-1 Hasta 2 Hacer
		Para x<-1 Hasta 10 Hacer
			Escribir "Dime el dato numero " x " de la columna " i
			Leer n[x,i]
		FinPara
	FinPara
	
	mayorr = n[1,1]
	Para i<-1 Hasta 2 Hacer
		Para x<-1 Hasta 10 Hacer
			
			Si n[x,i] > mayorr Entonces
			mayorr = n[x,i]
			FinSi
			
		FinPara
	FinPara
	
	Escribir "El mayor de todos los introducidos es: " mayorr
	
FinAlgoritmo
