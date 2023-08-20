#include <iostream>
using namespace std;

double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
}

double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

int main() {
    double temperatura;
    int opcion;
    
    cout << "Ingrese una temperatura: ";
    cin >> temperatura;
    
    cout << "Seleccione una opci�n:" << endl;
    cout << "1. Celsius a Fahrenheit" << endl;
    cout << "2. Fahrenheit a Celsius" << endl;
    cout << "Opci�n: ";
    cin >> opcion;
    
    switch (opcion) {
        case 1:
            cout << "Temperatura en Fahrenheit: " << celsiusToFahrenheit(temperatura) << endl;
            break;
        case 2:
            cout << "Temperatura en Celsius: " << fahrenheitToCelsius(temperatura) << endl;
            break;
        default:
            cout << "Opci�n inv�lida." << endl;
            break;
    }
    
    return 0;
}

