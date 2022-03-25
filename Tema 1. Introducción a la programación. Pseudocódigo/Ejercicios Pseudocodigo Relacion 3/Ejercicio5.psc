Algoritmo Ejercicio5
	
	Escribir "Dime el primer caracter"
	Leer c1
	Escribir "Dime el segundo caracter"
	Leer c2
	Escribir "Dime el tercer caracter"
	Leer c3
	
	Si c1 > c2 y c1 > c3 Entonces
		Si c2 > c3 Entonces
			Escribir c1 " > " c2 " > " c3
		SiNo
			Escribir c1 " > " c3 " > " c2
		FinSi
	SiNo
		Si c2 > c1 y c2 > c3 Entonces
			Si c1 > c3 Entonces
				Escribir c2 " > " c1 " > " c3
			SiNo
				Escribir c2 " > " c3 " > " c1
			FinSi
		SiNo
			Si c3 > c1 y c3 > c2 Entonces
				Si c1 > c2 Entonces
					Escribir c3 " > " c1 " > " c2
				FinSi
			SiNo
				Escribir c3 " > " c2 " > " c1
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
