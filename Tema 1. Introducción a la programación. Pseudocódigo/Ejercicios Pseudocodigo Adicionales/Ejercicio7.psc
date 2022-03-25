Algoritmo Ejercicio7
	
	Escribir "Dime un numero natural de hasta 2 cifras"
	Leer n
	
	Si n < 10 Entonces
		Escribir "Te faltan " 10 - n " numeros para ser un numero de dos cifras"
	SiNo
		Si n < 100 Entonces
			Escribir "Te faltan " 100 - n " numeros para ser un numero de tres cifras"
		SiNo
			Escribir "Solo puedes introducir numeros de hasta 2 cifras"
		FinSi
	FinSi
	
FinAlgoritmo
