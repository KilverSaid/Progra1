Proceso SumaNPrimerosNaturales
    Definir limite, suma, i Como Entero
	
    Escribir "Ingrese un n�mero l�mite:"
    Leer limite
	
    suma <- 0
	
    Para i <- 1 Hasta limite Con Paso 1 Hacer
        suma <- suma + i
    FinPara
	
    Escribir "La suma de los primeros ", limite, " n�meros naturales es: ", suma
	
FinProceso
