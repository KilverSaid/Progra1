#include <iostream>
#include <vector>

bool esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    
    for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    
    return true;
}

int main() {
    using namespace std;
    const int tamano = 10;
    vector<int> numeros(tamano);
    int cantidadPrimos = 0;
    
    // Llenar el vector con números aleatorios
    for (int i = 0; i < tamano; i++) {
        numeros[i] = rand() % 100 + 1;  // Números entre 1 y 100
    }
    
    // Contar números primos
    for (int i = 0; i < tamano; i++) {
        if (esPrimo(numeros[i])) {
            cantidadPrimos++;
        }
    }
    
    // Mostrar resultados
    cout << "Numeros generados: ";
    
    for (int i = 0; i < tamano; i++) {
        cout << numeros[i] << " ";
    }
    
    cout << endl;
    cout << "Cantidad de numeros primos: " << cantidadPrimos << endl;
    
    return 0;
}

