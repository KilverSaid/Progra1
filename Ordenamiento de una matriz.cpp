#include <iostream>
#include <algorithm>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    const int FILAS = 3;
    const int COLUMNAS = 3;
    int matriz[FILAS][COLUMNAS];
    
    // Generar números aleatorios en la matriz
    srand(time(0));
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            matriz[i][j] = rand() % 100;  // Números aleatorios del 0 al 99
        }
    }
    
    // Mostrar matriz original
    cout << "Matriz original:" << endl;
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            cout << matriz[i][j] << " ";
        }
        cout << endl;
    }
    
    // Ordenar matriz
    int arreglo[FILAS * COLUMNAS];
    int index = 0;
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            arreglo[index++] = matriz[i][j];
        }
    }
    sort(arreglo, arreglo + FILAS * COLUMNAS);
    
    // Mostrar matriz ordenada
    cout << "Matriz ordenada:" << endl;
    index = 0;
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            matriz[i][j] = arreglo[index++];
            cout << matriz[i][j] << " ";
        }
        cout << endl;
    }
    
    return 0;
}

