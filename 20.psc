Algoritmo CalculadoraAreas
    Escribir "Seleccione la figura para la cual desea calcular el �rea:"
    Escribir "1. Tri�ngulo"
    Escribir "2. Cuadrado"
    Escribir "3. Rect�ngulo"
    Escribir "4. C�rculo"
    Leer opcion
    Si opcion = 1 Entonces
        Escribir "Ingrese la base del tri�ngulo:"
        Leer base
        Escribir "Ingrese la altura del tri�ngulo:"
        Leer altura
        area <- (base * altura) / 2
        Escribir "El �rea del tri�ngulo es:", area
    Sino Si opcion = 2 Entonces
			Escribir "Ingrese el lado del cuadrado:"
			Leer lado
			area <- lado * lado
			Escribir "El �rea del cuadrado es:", area
		Sino Si opcion = 3 Entonces
				Escribir "Ingrese el largo del rect�ngulo:"
				Leer largo
				Escribir "Ingrese el ancho del rect�ngulo:"
				Leer ancho
				area <- largo * ancho
				Escribir "El �rea del rect�ngulo es:", area
			Sino Si opcion = 4 Entonces
					Escribir "Ingrese el radio del c�rculo:"
					Leer radio
					area <- 3.14159 * radio * radio
					Escribir "El �rea del c�rculo es:", area
				Sino
					Escribir "Opci�n inv�lida."
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
