Proceso CalcularEdad
    Definir diaNac, mesNac, anioNac, diaActual, mesActual, anioActual, edad Como Entero
	
    Escribir "Ingrese el d�a de nacimiento:"
    Leer diaNac
	
    Escribir "Ingrese el mes de nacimiento:"
    Leer mesNac
	
    Escribir "Ingrese el a�o de nacimiento:"
    Leer anioNac
	
    Escribir "Ingrese el d�a actual:"
    Leer diaActual
	
    Escribir "Ingrese el mes actual:"
    Leer mesActual
	
    Escribir "Ingrese el a�o actual:"
    Leer anioActual
	
    edad <- anioActual - anioNac
	
    Si mesActual < mesNac Entonces
        edad <- edad - 1
    FinSi
	
    Si mesActual = mesNac Y diaActual < diaNac Entonces
        edad <- edad - 1
    FinSi
	
    Escribir "La edad es: ", edad
	
FinProceso
