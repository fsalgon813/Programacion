Algoritmo Ejercicio3
	
	Definir t1 Como Caracter
	Definir t2 Como Caracter
	Escribir "Cuanto te ha salido en la primera tirada"
	Leer t1
	Escribir "Cuanto te ha salido en la segunda tirada"
	Leer t2
	Definir t1n Como Entero
	Definir t2n Como Entero
	
	Segun t1 Hacer
		"UNO": t1n<-1
		"DOS": t1n<-2
		"TRES": t1n<-3
		"CUATRO": t1n<-4
		"CINCO": t1n<-5
		"SEIS": t1n<-6
		"SIETE": t1n<-7
		"OCHO": t1n<-8
		"NUEVE": t1n<-9
		"DIEZ": t1n<-10
		"uno": t1n<-1
		"dos": t1n<-2
		"tres": t1n<-3
		"cuatro": t1n<-4
		"cinco": t1n<-5
		"seis": t1n<-6
		"siete": t1n<-7
		"ocho": t1n<-8
		"nueve": t1n<-9
		"diez": t1n<-10
		"Uno": t1n<-1
		"Dos": t1n<-2
		"Tres": t1n<-3
		"Cuatro": t1n<-4
		"Cinco": t1n<-5
		"Seis": t1n<-6
		"Siete": t1n<-7
		"Ocho": t1n<-8
		"Nueve": t1n<-9
		"Diez": t1n<-10
		De Otro Modo:
			Escribir "Los datos introducidos no son validos"
	FinSegun
	Segun t2 Hacer
		"UNO": t2n<-1
		"DOS": t2n<-2
		"TRES": t2n<-3
		"CUATRO": t2n<-4
		"CINCO": t2n<-5
		"SEIS": t2n<-6
		"SIETE": t2n<-7
		"OCHO": t2n<-8
		"NUEVE": t2n<-9
		"DIEZ": t2n<-10
		"uno": t2n<-1
		"dos": t2n<-2
		"tres": t2n<-3
		"cuatro": t2n<-4
		"cinco": t2n<-5
		"seis": t2n<-6
		"siete": t2n<-7
		"ocho": t2n<-8
		"nueve": t2n<-9
		"diez": t2n<-10
		"Uno": t2n<-1
		"Dos": t2n<-2
		"Tres": t2n<-3
		"Cuatro": t2n<-4
		"Cinco": t2n<-5
		"Seis": t2n<-6
		"Siete": t2n<-7
		"Ocho": t2n<-8
		"Nueve": t2n<-9
		"Diez": t2n<-10
		De Otro Modo:
			Escribir "Los datos introducidos no son validos"
	FinSegun
	
	Escribir "La suma de los dados es: " t1n + t2n
	
FinAlgoritmo
