Algoritmo Ejercicio9_3
	
	Dimension datos[5]
	Escribir "Dime 5 datos y te mostrare su media"
	Leer datos[1],datos[2],datos[3],datos[4],datos[5]
	media <- (datos[1]+datos[2]+datos[3]+datos[4]+datos[5])/5
	Escribir "La media de todos los datos es: " media
	
	Para i<-1 Hasta 5 Hacer
		Si datos[i] > media Entonces
			Escribir datos[i] " es mayor a la media"
		FinSi
	FinPara
	
FinAlgoritmo
