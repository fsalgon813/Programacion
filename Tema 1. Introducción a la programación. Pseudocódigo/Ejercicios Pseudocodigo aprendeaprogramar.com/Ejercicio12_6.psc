Algoritmo Ejercicio12_6 
	
	Escribir "Dime un numero y si es par pondre Verdadero sino, pondre Falso"
	Leer x
	EsPar(x)
	
FinAlgoritmo


SubProceso EsPar(n)
	
	Si n % 2 = 0 Entonces
		p = Verdadero
	SiNo
		p = Falso
	FinSi
	
	Si p = Verdadero Entonces
		Escribir "Verdadero"
	SiNo
		Si p = Falso Entonces
			Escribir "Falso"
		FinSi
	FinSi
	
FinSubProceso
	