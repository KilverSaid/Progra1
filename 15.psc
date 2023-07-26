Algoritmo BuscarNumeroEnMatriz
    Dimension matriz[4, 5] Como Entero
    Definir numero, fila, columna Como Entero
	
    # Cargar la matriz con los primeros n�meros naturales
    Para i <- 0 Hasta 3 Hacer
        Para j <- 0 Hasta 4 Hacer
            matriz[i, j] <- i * 5 + j + 1
        FinPara
    FinPara
	
    # Mostrar la matriz
    Escribir "Matriz:"
    Para i <- 0 Hasta 3 Hacer
        Para j <- 0 Hasta 4 Hacer
            Escribir matriz[i, j]
        FinPara
        Escribir "" # Salto de l�nea despu�s de cada fila
    FinPara
	
    # Buscar un n�mero en la matriz
    Escribir "Ingrese un n�mero:"
    Leer numero
	
    fila <- -1
    columna <- -1
	
    Para i <- 0 Hasta 3 Hacer
        Para j <- 0 Hasta 4 Hacer
            Si matriz[i, j] = numero Entonces
                fila <- i
                columna <- j
                Detener
            FinSi
        FinPara
    FinPara
	
    Si fila <> -1 Y columna <> -1 Entonces
        Escribir "El n�mero ", numero, " se encuentra en la fila ", fila, " y columna ", columna
    Sino
        Escribir "El n�mero ", numero, " no se encuentra en la matriz."
    FinSi
	
FinAlgoritmo

