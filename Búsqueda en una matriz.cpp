#include <iostream>
using namespace std;

int main() {
    const int FILAS = 4;
    const int COLUMNAS = 5;
    int matriz[FILAS][COLUMNAS];
    
    // Cargar matriz con los primeros n�meros naturales
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            matriz[i][j] = i * COLUMNAS + j + 1;
        }
    }
    
    int numero;
    cout << "Ingrese un n�mero: ";
    cin >> numero;
    
    bool encontrado = false;
    int fila, columna;
    
    // Buscar n�mero en la matriz
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            if (matriz[i][j] == numero) {
                encontrado = true;
                fila = i + 1;
                columna = j + 1;
                break;
            }
        }
        if (encontrado) {
            break;
        }
    }
    
    if (encontrado) {
        cout << "El n�mero " << numero << " se encuentra en la fila " << fila << ", columna " << columna << "." << endl;
    } else {
        cout << "El n�mero no se encuentra en la matriz." << endl;
    }
    
    return 0;
}

