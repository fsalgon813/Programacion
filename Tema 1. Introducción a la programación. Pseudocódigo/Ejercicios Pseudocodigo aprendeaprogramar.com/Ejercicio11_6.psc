Algoritmo Ejercicio11_6

	Escribir "Dime tu nombre"
	leer nombre
	nombre <- Minusculas(nombre)
	
	Escribir "Tu nombre con las mayusculas bien puestas es: "
	Escribir sin saltar Mayusculas(Subcadena(nombre,1,1))
	
	para i <- 1 Hasta longitud(nombre) hacer
		si subcadena(nombre,n,n) == " " & Subcadena(nombre,n+1,n+1) <> " "   Entonces
			Escribir sin saltar mayusculas(subcadena(nombre,n+1,n+1))
		SiNo
			Escribir sin saltar subcadena(nombre,n+1,n+1)
		FinSi
	FinPara
	Escribir ""
	
FinAlgoritmo
