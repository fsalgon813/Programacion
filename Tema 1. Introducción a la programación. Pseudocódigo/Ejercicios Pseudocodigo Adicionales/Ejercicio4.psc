Algoritmo Ejercicio4
	
	Escribir "¿En que dia naciste?"
	Leer d1
	Escribir "¿En que mes naciste?"
	Leer m1
	Escribir "¿En que año naciste?"
	Leer a1
	Escribir "Introduce el dia en que estamos:"
	Leer d2
	Escribir "Introduce el mes en el que estamos:"
	Leer m2
	Escribir "Introduce el año en el que estamos:"
	Leer a2
	
	
	a1 <- a2 - a1
	Si m1<m2 Entonces
		Escribir "Tienes " a1 " años"
	SiNo
		Si m1>m2 Entonces
			Si d1>d2 Entonces
				Escribir "Tienes " a1 " años"
			SiNo
				Escribir "Tienes " a1-1 " años"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
