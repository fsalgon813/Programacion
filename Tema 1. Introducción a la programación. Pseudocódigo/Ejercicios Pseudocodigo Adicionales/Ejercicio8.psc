Algoritmo Ejercicio8
	
	Escribir "Dime un numero de 2 cifras y te dire su valor en letras"
	Leer n
	u = n % 10
	d = (n % 100 - u)/10
	Si n >= 10 o n < 100 Entonces
		Si n >= 11 y n <= 15 Entonces
			Segun n Hacer
				11: Escribir "Once"
				12: Escribir "Doce"
				13: Escribir "Trece"
				14: Escribir "Catorce"
				15: Escribir "Quince"
			FinSegun
		FinSi
		Si n > 15 Entonces
			Segun d Hacer
				1: decena = "Diez"
				2: decena = "Veinte"
				3: decena = "Treinta"
				4: decena = "Cuarenta"
				5: decena = "Cincuenta"
				6: decena = "Sesenta"
				7: decena = "Setenta"
				8: decena = "Ochenta"
				9: decena = "Noventa"
			FinSegun
		FinSi
		Segun u Hacer
			1: unidad = "uno"
			2: unidad = "dos"
			3: unidad = "tres"
			4: unidad = "cuatro"
			5: unidad = "cinco"
			6: unidad = "seis"
			7: unidad = "siete"
			8: unidad = "ocho"
			9: unidad = "nueve"
		FinSegun
		Si d = 1 y u <> 1 y u <> 2 y u <> 3 y u <> 4 y u <> 5 Entonces
			Escribir "Dieci" unidad
		SiNo
			Si d = 2 y u <> 0 Entonces
				Escribir "Veinti" unidad
			SiNo
				Si n >= 30 y u <> 0 Entonces
					Escribir decena " y " unidad
				SiNo
					Escribir decena
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir "Solo se pueden introducir numeros de dos cifras"
	FinSi
	
FinAlgoritmo
