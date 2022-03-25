Algoritmo Ejercicio9
	
	Escribir "Dime tres numero enteros"
	Leer n1, n2, n3
	
	Si n1 + n2 = n3 Entonces
		Escribir "La suma del primer numero con el segundo numero da de resultado el tercer numero"
	SiNo
		Si n1 + n3 = n2
			Escribir "La suma del primer numero con el tercer numero da de resultado el segundo numero"
		SiNo
			Escribir "La suma del tercer numero con el segundo numero da de resultado el primer numero"
		FinSi
	FinSi
	
FinAlgoritmo
