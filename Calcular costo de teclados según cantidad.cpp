#include <iostream>

int main() {
    using namespace std;
    int cantidad;
    double costoUnitario;
    double totalPagar;
    
    cout << "Ingrese la cantidad de teclados a comprar: ";
    cin >> cantidad;
    
    if (cantidad > 8) {
        costoUnitario = 85.0;
    } else if (cantidad >= 4) {
        costoUnitario = 90.0;
    } else {
        costoUnitario = 100.0;
    }
    
    totalPagar = cantidad * costoUnitario;
    
    cout << "Cantidad de teclados a comprar: " << cantidad << endl;
    cout << "Total a pagar: " << totalPagar << " Lempiras" << endl;
    
    return 0;
}

