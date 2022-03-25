Algoritmo Ejercicio4_4
	
	Escribir "Dime el primer numero"
	Leer num1
	Escribir "Dime el segundo numero"
	Leer num2
	Si num1>0 y num2>0 Entonces
		Escribir "Los dos numeros son positivos"
	FinSi
	Si num1>0  o num2>0   
		Si num1>0 y num2<0 
			Escribir num1 " es positivo y " num2 " es negativo"
		FinSi
		Si num2>0 y num1<0 
			Escribir num2 " es positivo y " num1 " es negativo"
		FinSi
	SiNo
		Escribir "Los dos numeros son negativos"
	FinSi
	
FinAlgoritmo