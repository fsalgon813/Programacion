Algoritmo Ejercicio12_3
	
	Escribir "Dime dos numeros y te dire si uno es multiplo del otro"
	Leer n1,n2
	
	EsMultiplo(n1,n2)
	
FinAlgoritmo


SubProceso EsMultiplo(x1,x2)
	
	Si x1 % x2 = 0 Entonces
		Escribir x1 " es multiplo de " x2
	SiNo
		Si x2 % x1 = 0 Entonces
			Escribir x2 " es multiplo de " x1
		SiNo
			Escribir "Los numeros no son multiplo"
		FinSi
	FinSi
	
FinSubProceso
	