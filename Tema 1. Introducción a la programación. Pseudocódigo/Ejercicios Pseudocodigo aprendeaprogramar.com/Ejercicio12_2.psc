Algoritmo Ejercicio12_2
	
	Escribir "Dime un numero y te dire sus divisores"
	Leer z
	Cantidad_divisores(z)
	
FinAlgoritmo


SubAlgoritmo Cantidad_divisores (n)
	cont = 0
	Para x<-1 hasta n Hacer
		Si n % x = 0 Entonces
			cont = cont + 1
		FinSi
	FinPara
	Escribir "La cantidad de divisores de n es: " cont
	
FinFuncion
	