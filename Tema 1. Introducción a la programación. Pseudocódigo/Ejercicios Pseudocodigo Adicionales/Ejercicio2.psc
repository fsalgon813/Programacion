Algoritmo Ejercicio2
	
	Escribir "Introduce el dia en que estamos:"
	Leer d
	Escribir "Introduce el mes en el que estamos:"
	Leer m
	
	Segun m Hacer
		"enero": Escribir "Llevan pasado " d " dias"
		"febrero": Escribir "Llevan pasado " d+30 " dias"
		"marzo": Escribir "Llevan pasado " d+30+28 " dias"
		"abril": Escribir "Llevan pasado " d+(30*2)+28 " dias"
		"mayo": Escribir "Llevan pasado " d+(30*3)+28 " dias"
		"junio": Escribir "Llevan pasado " d+(30*4)+28 " dias"
		"julio": Escribir "Llevan pasado " d+(30*5)+28 " dias"
		"agosto": Escribir "Llevan pasado " d+(30*6)+28 " dias"
		"septiembre": Escribir "Llevan pasado " d+(30*7)+28 " dias"
		"octubre": Escribir "Llevan pasado " d+(30*8)+28 " dias"
		"noviembre": Escribir "Llevan pasado " d+(30*9)+28 " dias"
		"diciembre": Escribir "Llevan pasado " d+(30*10)+28 " dias"
		"Enero": Escribir "Llevan pasado " d " dias"
		"Febrero": Escribir "Llevan pasado " d+30 " dias"
		"Marzo": Escribir "Llevan pasado " d+30+28 " dias"
		"Abril": Escribir "Llevan pasado " d+(30*2)+28 " dias"
		"Mayo": Escribir "Llevan pasado " d+(30*3)+28 " dias"
		"Junio": Escribir "Llevan pasado " d+(30*4)+28 " dias"
		"Julio": Escribir "Llevan pasado " d+(30*5)+28 " dias"
		"Agosto": Escribir "Llevan pasado " d+(30*6)+28 " dias"
		"Septiembre": Escribir "Llevan pasado " d+(30*7)+28 " dias"
		"Octubre": Escribir "Llevan pasado " d+(30*8)+28 " dias"
		"Noviembre": Escribir "Llevan pasado " d+(30*9)+28 " dias"
		"Diciembre": Escribir "Llevan pasado " d+(30*10)+28 " dias"
		De Otro Modo:
			Escribir "Los datos introducidos no son validos"
	FinSegun
	
FinAlgoritmo
