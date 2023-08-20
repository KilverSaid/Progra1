#include <iostream>
using namespace std;

int main() {
    double monto;
    int meses;
    cout << "Ingrese el monto del préstamo: $";
    cin >> monto;
    cout << "Ingrese el número de meses: ";
    cin >> meses;
    
    double tasa = 0.02;  // 2% mensual
    
    double interes = monto * tasa * meses;
    cout << "El monto total de intereses a pagar es: $" << interes << endl;
    
    return 0;
}

