Algoritmo Ejercicio9
	
	Escribir "Dime el nombre del alumno 1"
	Leer nombrea1
	Escribir "Dime las 5 notas del alumno 1"
	Leer nota1a1
	Leer nota2a1
	Leer nota3a1
	Leer nota4a1
	Leer nota5a1
	mediaa1 = (nota1a1 + nota2a1 + nota3a1 + nota4a1 + nota5a1) / 5
	Escribir "Dime el nombre del alumno 2"
	Leer nombrea2
	Escribir "Dime las 5 notas del alumno 2"
	Leer nota1a2
	Leer nota2a2
	Leer nota3a2
	Leer nota4a2
	Leer nota5a2
	mediaa2 = (nota1a2 + nota2a2 + nota3a2 + nota4a2 + nota5a2) / 5
	Escribir "Dime el nombre del alumno 3"
	Leer nombrea3
	Escribir "Dime las 5 notas del alumno 3"
	Leer nota1a3
	Leer nota2a3
	Leer nota3a3
	Leer nota4a3
	Leer nota5a3
	mediaa3 = (nota1a3 + nota2a3 + nota3a3 + nota4a3 + nota5a3) / 5
	Escribir "Dime el nombre del alumno 4"
	Leer nombrea1
	Escribir "Dime las 5 notas del alumno 4"
	Leer nota1a4
	Leer nota2a4
	Leer nota3a4
	Leer nota4a4
	Leer nota5a4
	mediaa4 = (nota1a4 + nota2a4 + nota3a4 + nota4a4 + nota5a4) / 5
	Escribir "Dime el nombre del alumno 5"
	Leer nombrea5
	Escribir "Dime las 5 notas del alumno 5"
	Leer nota1a5
	Leer nota2a5
	Leer nota3a5
	Leer nota4a5
	Leer nota5a5
	mediaa5 = (nota1a5 + nota2a5 + nota3a5 + nota4a5 + nota5a5) / 5
	
	Si mediaa1 > mediaa2 y mediaa1 > mediaa3 y mediaa1 > mediaa4 y mediaa1 > mediaa5 Entonces
		Escribir "El alumno con la mayor nota media es: " nombrea1
	SiNo
		Si mediaa2 > mediaa1 y mediaa2 > mediaa3 y mediaa2 > mediaa4 y mediaa2 > mediaa5 Entonces
			Escribir "El alumno con la mayor nota media es: " nombrea2
		SiNo
			Si mediaa3 > mediaa2 y mediaa3 > mediaa1 y mediaa3 > mediaa4 y mediaa3 > mediaa5 Entonces
				Escribir "El alumno con la mayor nota media es: " nombrea3
			SiNo
				Si mediaa4 > mediaa2 y mediaa4 > mediaa3 y mediaa4 > mediaa1 y mediaa4 > mediaa5 Entonces
					Escribir "El alumno con la mayor nota media es: " nombrea4
				SiNo
					Escribir "El alumno con la mayor nota media es: " nombrea5
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
