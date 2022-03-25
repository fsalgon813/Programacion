Algoritmo Ejercicio12_4
	
	Escribir "Dime un texto y te lo pondre espaciado"
	Leer text
	EscribirEspaciado(text)
	
FinAlgoritmo


SubProceso EscribirEspaciado(txt)
	
	Para x<-1 Hasta Longitud(txt) Hacer
			Escribir Sin Saltar Subcadena(txt,x,x) " "
	FinPara
	
FinSubProceso
	