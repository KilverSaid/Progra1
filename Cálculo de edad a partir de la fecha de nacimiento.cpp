#include <iostream>
using namespace std;

int main() {
    int dia_nac, mes_nac, anio_nac;
    cout << "Ingrese su fecha de nacimiento:" << endl;
    cout << "D�a: ";
    cin >> dia_nac;
    cout << "Mes: ";
    cin >> mes_nac;
    cout << "A�o: ";
    cin >> anio_nac;
    
    int dia_actual, mes_actual, anio_actual;
    cout << "Ingrese la fecha actual:" << endl;
    cout << "D�a: ";
    cin >> dia_actual;
    cout << "Mes: ";
    cin >> mes_actual;
    cout << "A�o: ";
    cin >> anio_actual;
    
    int edad = anio_actual - anio_nac;
    
    // Ajustar la edad si todav�a no ha cumplido a�os en el a�o actual
    if (mes_actual < mes_nac || (mes_actual == mes_nac && dia_actual < dia_nac)) {
        edad--;
    }
    
    cout << "La edad es: " << edad << " a�os." << endl;
    
    return 0;
}

