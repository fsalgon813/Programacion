Algoritmo Ejercicio9_7
	
	Dimension n[10]
	n[1] = 1
	n[2] = 2
	n[3] = 3
	n[4] = 3
	n[5] = 4
	n[6] = 5
	n[7] = 6
	n[8] = 7
	n[9] = 7
	n[10] = 7
	
	Escribir "Dime donde quieres buscar y te dire si aparece o no y cuantas veces aparece"
	Leer buscar
	
	Para x<-1 Hasta 10 Hacer
		Si n[x] = buscar Entonces
			c = c + 1
		FinSi
	FinPara
	
	Si c = 0 Entonces
		Escribir "No se ha encontrado ningun dato"
	SiNo
		Escribir "El dato se ha encontrado " c " veces"
	FinSi
	
FinAlgoritmo
