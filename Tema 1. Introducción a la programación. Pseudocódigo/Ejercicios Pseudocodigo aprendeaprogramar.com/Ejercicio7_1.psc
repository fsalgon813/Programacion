Algoritmo Ejercicio7_1
	
	Repetir
		Escribir "�Cual es el codigo de usuario?"
		Leer user
		Escribir "�Cual es la contrase�a?"
		Leer pass
		
		Si user <> 1 o pass <> 1234 Entonces
			Escribir ""
			Escribir "Codigo de usuario o contrase�a incorrecto"
			Escribir ""
		FinSi
	Hasta Que user = 1 y pass = 1234
	Escribir ""
	Escribir "Bienvenido!"
	
FinAlgoritmo
