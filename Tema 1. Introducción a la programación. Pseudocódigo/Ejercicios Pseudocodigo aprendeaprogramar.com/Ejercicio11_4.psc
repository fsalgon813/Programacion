Algoritmo Ejercicio11_4
	
	Escribir "Dime tu noombre y te dire sus vocales"
	Leer nombre
	longitudn = Longitud(nombre)
	nombre <- Minusculas(nombre)
	Para x<-1 Hasta longitudn Hacer
		Si Subcadena(nombre,x,x) = "a" Entonces
			a = a+1
		Sino
			Si  Subcadena(nombre,x,x) = "e" Entonces
				e = e + 1
			SiNo
				Si Subcadena(nombre,x,x) = "i"
					i = i + 1
				SiNo
					Si Subcadena(nombre,x,x) = "o"
						oo = oo + 1
					SiNo
						Si Subcadena(nombre,x,x) = "u"
							u = u + 1
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
	FinPara
	
	Escribir "Las vocales del nombre son: "
	Si a > 0 Entonces
		Escribir Sin Saltar "a"
	FinSi
	Si e > 0 Entonces
		Escribir Sin Saltar "e"
	FinSi
	Si i > 0 Entonces
		Escribir Sin Saltar "i"
	FinSi
	Si oo > 0 Entonces
		Escribir Sin Saltar "o"
	FinSi
	Si u > 0 Entonces
		Escribir Sin Saltar "u"
	FinSi
					

FinAlgoritmo
