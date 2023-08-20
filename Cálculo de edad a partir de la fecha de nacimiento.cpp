#include <iostream>
using namespace std;

int main() {
    int dia_nac, mes_nac, anio_nac;
    cout << "Ingrese su fecha de nacimiento:" << endl;
    cout << "Día: ";
    cin >> dia_nac;
    cout << "Mes: ";
    cin >> mes_nac;
    cout << "Año: ";
    cin >> anio_nac;
    
    int dia_actual, mes_actual, anio_actual;
    cout << "Ingrese la fecha actual:" << endl;
    cout << "Día: ";
    cin >> dia_actual;
    cout << "Mes: ";
    cin >> mes_actual;
    cout << "Año: ";
    cin >> anio_actual;
    
    int edad = anio_actual - anio_nac;
    
    // Ajustar la edad si todavía no ha cumplido años en el año actual
    if (mes_actual < mes_nac || (mes_actual == mes_nac && dia_actual < dia_nac)) {
        edad--;
    }
    
    cout << "La edad es: " << edad << " años." << endl;
    
    return 0;
}

