Proceso CalcularInteres
    Definir monto, meses, interes, totalPago Como Real
	
    Escribir "Ingrese el monto del pr�stamo:"
    Leer monto
	
    Escribir "Ingrese el n�mero de meses:"
    Leer meses
	
    interes <- monto * 0.02 * meses
    totalPago <- monto + interes
	
    Escribir "El inter�s a pagar es: ", interes
    Escribir "El total a pagar es: ", totalPago
	
FinProceso
