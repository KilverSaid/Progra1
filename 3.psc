Algoritmo ContarPositivosNegativosNulos
    Definir positivos, negativos, nulos, numero Como Entero
	
    positivos = 0
    negativos = 0
    nulos = 0
	
    Para i <- 1 Hasta 10 Hacer
        Escribir "Ingrese el n�mero ", i, ": "
        Leer numero
		
        Si numero > 0 Entonces
            positivos = positivos + 1
        Sino
            Si numero < 0 Entonces
                negativos = negativos + 1
            Sino
                nulos = nulos + 1
            FinSi
        FinSi
    FinPara
	
    Escribir "Cantidad de n�meros positivos:", positivos
    Escribir "Cantidad de n�meros negativos:", negativos
    Escribir "Cantidad de n�meros nulos:", nulos
FinAlgoritmo

