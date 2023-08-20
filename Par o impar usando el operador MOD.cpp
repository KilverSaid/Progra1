#include <iostream>

int main() {
    using namespace std;
    int numero;
    
    cout << "Ingrese un numero: ";
    cin >> numero;
    
    if (numero % 2 == 0) {
        cout << "El numero es par." << endl;
    } else {
        cout << "El numero es impar." << endl;
    }
    
    return 0;
}

