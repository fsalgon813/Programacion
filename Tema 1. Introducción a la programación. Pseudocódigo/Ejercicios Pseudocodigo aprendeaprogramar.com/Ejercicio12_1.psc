Algoritmo Ejercicio12_1

	Escribir "Esto es una prueba"
	Leer txt
	Escribir_centrado(txt)
	
FinAlgoritmo

SubProceso Escribir_centrado (text)
	Para x<-1 Hasta (40 - Longitud(text)/2) Hacer
		Escribir Sin Saltar " "
	FinPara
	Escribir Sin Saltar text
FinSubProceso
	