Algoritmo Ejercicio12_8
	
	Escribir "Dime un nombre y apellido y te dire sus iniciales"
	Leer n
	Iniciales(n)
	
FinAlgoritmo


SubProceso Iniciales(txt)
	
	Escribir Sin Saltar Subcadena(txt,1,1)
	Para n<-2 Hasta Longitud(txt)
		
		Si Subcadena(txt,n,n) = " " Entonces
			Escribir Sin Saltar Subcadena(txt,n+1,n+1)
		FinSi
		
	FinPara
	
	Escribir ""
	
FinSubProceso
	