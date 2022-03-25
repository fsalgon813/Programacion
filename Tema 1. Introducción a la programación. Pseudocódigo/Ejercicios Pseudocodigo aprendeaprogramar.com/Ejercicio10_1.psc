Algoritmo Ejercicio10_1
	
	x = azar(101) +1
	
	Si x <> n Entonces
		Para i<-1 Hasta 7 Hacer
			Escribir ""
			Escribir "Intenta adivinar el numero" x
			Leer n
				Si n > x Entonces
					Escribir "Te has pasado"
				SiNo
					Si n < x Entonces
						Escribir "Te has quedado corto"
					FinSi
				FinSi	
			FinPara
		
	FinSi
	
FinAlgoritmo
