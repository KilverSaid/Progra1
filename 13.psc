Proceso InvertirNumero
    Definir numero, numInvertido, resto Como Entero
	
    Escribir "Ingrese un n�mero:"
    Leer numero
	
    numInvertido <- 0
	
    Mientras numero > 0 Hacer
        resto <- numero Mod 10
        numInvertido <- numInvertido * 10 + resto
        numero <- numero / 10
    FinMientras
	
    Escribir "N�mero invertido:", numInvertido
	
FinProceso
