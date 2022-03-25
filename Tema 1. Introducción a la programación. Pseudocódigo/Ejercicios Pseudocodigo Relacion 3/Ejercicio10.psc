Algoritmo Ejercicio10
	
	Escribir "Que saca el primer jugador: Piedra,Ppapel o Tijeras"
	Leer j1
	Escribir "Que saca el segundo jugador: Piedra, Papel o Tijeras"
	
	Leer j2

	Si (j1 = "Piedra" y j2 = "Tijeras") o (j1 = "Papel" y j2 = "Piedra") o (j1 = "Tijeras" y j2 = "Papel") Entonces
		Escribir "Gana el Jugador 1"
	SiNo
		Si (j2 = "Piedra" y j1 = "Tijeras") o (j2 = "Papel" y j1 = "Piedra") o (j2 = "Tijeras" y j1 = "Papel") Entonces
			Escribir "Gana el jugador 2"
		SiNo
			Escribir "Empate"
		FinSi
	FinSi
	
FinAlgoritmo
