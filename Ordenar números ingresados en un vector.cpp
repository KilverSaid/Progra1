#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    using namespace std;
    const int tamano = 10;
    vector<int> numeros(tamano);
    
    cout << "Ingrese 10 numeros: " << endl;
    
    for (int i = 0; i < tamano; i++) {
        cout << "Numero " << i + 1 << ": ";
        cin >> numeros[i];
    }
    
    // Ordenar el vector en orden ascendente
    sort(numeros.begin(), numeros.end());
    
    cout << "Numeros ordenados: ";
    
    for (int i = 0; i < tamano; i++) {
        cout << numeros[i] << " ";
    }
    
    cout << endl;
    
    return 0;
}

