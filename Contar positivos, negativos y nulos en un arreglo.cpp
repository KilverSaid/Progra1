#include <iostream>

int main() {
    using namespace std;
    const int tamano = 10;
    int numeros[tamano];
    int positivos = 0, negativos = 0, nulos = 0;
    
    cout << "Ingrese 10 numeros: " << endl;
    
    for (int i = 0; i < tamano; i++) {
        cout << "Numero " << i + 1 << ": ";
        cin >> numeros[i];
        
        if (numeros[i] > 0) {
            positivos++;
        } else if (numeros[i] < 0) {
            negativos++;
        } else {
            nulos++;
        }
    }
    
    cout << "Cantidad de numeros positivos: " << positivos << endl;
    cout << "Cantidad de numeros negativos: " << negativos << endl;
    cout << "Cantidad de numeros nulos: " << nulos << endl;
    
    return 0;
}

