Algoritmo Codigo_juego_en_sucio_funcionando
	
	//Defino todas las variables
	Definir seguir Como Logico
	Definir jugando Como Logico
	Definir mx Como Entero
	Definir my Como Entero
	Definir tx Como Entero
	Definir ty Como Entero
	Definir x Como Entero
	Definir yy Como Entero
	Definir s Como Caracter
	
		
		Dimension coordenada[4,5] //Crea la matriz
		Escribir "_________________________________________"
		Escribir "|Bienvenido al juego Busqueda del tesoro|"
		Escribir "_________________________________________"
			//Crea la mina y el tesoro
			mx = azar(4) + 1
			my = azar(5) + 1
			tx = azar(4) + 1
			ty = azar(5) + 1
			
			//Si se repite la mina cambia la posicion
			Mientras mx = tx o my = ty Hacer
				mx = azar(4) + 1
				my = azar(5) + 1
			FinMientras
			
			// asigna espacio a toda la matriz de coordenada
			Para z<-1 Hasta 4 Hacer    
				Para n<-1 Hasta 5 Hacer
					coordenada[z,n] = "  "
				FinPara
			FinPara
			
			jugando = Verdadero // Inicia la variable jugando como Verdadero para que empieze el juego
			Mientras jugando = Verdadero Hacer     // Mientras la mina no se haya encontrado la mina o el tesoro, sigue el juego
					//Pide las coordenadas al usuario
					Escribir Sin Saltar "Coordenada x: "
					Leer x
					Escribir Sin Saltar "Coordenada y: "
					Leer yy
					
					//Control de errores para que mientras ponga un numero mayor o menor a la dimension del tablero, diga que los datos introducidos no son correctos y siga pidiendo la coordenada al usuario
					Si x < 1 o x > 5 o yy < 1 o yy > 4 Entonces
						Escribir "Los datos introducidos no son correctos"
						Mientras x < 1 o x > 5 o yy < 1 o yy > 4 Hacer
							Escribir Sin Saltar "Coordenada x: "
							Leer x
							Escribir Sin Saltar "Coordenada y: "
							Leer yy
						FinMientras
					FinSi
					
					coordenada[yy,x] = "x " //Asigna una x a la coordenada dicha por el usuario
					
					//Empieza a crear el tablero
					Para alto <- 4 Hasta 1 Hacer
						Escribir Sin Saltar alto, "|"
						Para ancho <- 1 Hasta 5 Hacer
							Escribir Sin Saltar coordenada[alto,ancho]
						FinPara
						Escribir ""
					FinPara
					
					Escribir Sin Saltar " "
					Para ancho <- 1 Hasta 5 Hacer
						Escribir Sin Saltar " -"
					FinPara
					Escribir ""
					
					Escribir Sin Saltar " "
					Para ancho <- 1 Hasta 5 Hacer
						Escribir Sin Saltar " " ancho
					FinPara
					Escribir ""
					//Termina de crear el tablero
					
					//Si encuentra la mina cambia la variable jugando a falso y dice que ha perdido, sino sigue el juego
					Si coordenada[yy,x] = coordenada[mx,my] Entonces
						
						coordenada[mx,my] = "* "
						coordenada[tx,ty] = "$ "
						
						//Empieza a crear el tablero
						Para alto <- 4 Hasta 1 Hacer
							Escribir Sin Saltar alto, "|"
							Para ancho <- 1 Hasta 5 Hacer
								Escribir Sin Saltar coordenada[alto,ancho]
							FinPara
							Escribir ""
						FinPara
						
						Escribir Sin Saltar " "
						Para ancho <- 1 Hasta 5 Hacer
							Escribir Sin Saltar " -"
						FinPara
						Escribir ""
						
						Escribir Sin Saltar " "
						Para ancho <- 1 Hasta 5 Hacer
							Escribir Sin Saltar " " ancho
						FinPara
						Escribir ""
						//Termina de crear el tablero
						
						Escribir "Has perdido :("
						Escribir "La proxima vez sera"
						jugando = Falso
						
					FinSi
					
					//Si encuentra el tesoro cambia la variable jugando a falso y dice que ha ganado, sino sigue el juego
					Si coordenada[yy,x] = coordenada[tx,ty] Entonces
						
						coordenada[mx,my] = "* "
						coordenada[tx,ty] = "$ "
						
						//Empieza a crear el tablero
						Para alto <- 4 Hasta 1 Hacer
							Escribir Sin Saltar alto, "|"
							Para ancho <- 1 Hasta 5 Hacer
								Escribir Sin Saltar coordenada[alto,ancho]
							FinPara
							Escribir ""
						FinPara
						
						Escribir Sin Saltar " "
						Para ancho <- 1 Hasta 5 Hacer
							Escribir Sin Saltar " -"
						FinPara
						Escribir ""
						
						Escribir Sin Saltar " "
						Para ancho <- 1 Hasta 5 Hacer
							Escribir Sin Saltar " " ancho
						FinPara
						Escribir ""
						//Termina de crear el tablero
						
						Escribir "Has ganado :)"
						Escribir "Enhorabuena!!!"
						jugando = Falso
						
					FinSi
					
				FinMientras
FinAlgoritmo