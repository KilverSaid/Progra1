#include <iostream>

int main() {
    using namespace std;
    const int tamano = 5;
    int arreglo[tamano];
    int numero;
    
    cout << "Ingrese " << tamano << " numeros: " << endl;
    
    for (int i = 0; i < tamano; i++) {
        cout << "Numero " << i + 1 << ": ";
        cin >> arreglo[i];
    }
    
    cout << "Ingrese un numero: ";
    cin >> numero;
    
    cout << "Elementos mayores que " << numero << ": ";
    
    for (int i = 0; i < tamano; i++) {
        if (arreglo[i] > numero) {
            cout << arreglo[i] << " ";
        }
    }
    
    cout << endl;
    
    return 0;
}

