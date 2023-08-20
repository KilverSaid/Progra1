#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int cantidadNumeros;

    // Pedir al usuario la cantidad de números para las dos listas
    cout << "Ingrese la cantidad de números para las listas: ";
    cin >> cantidadNumeros;

    // Crear las listas y leer los números ingresados por el usuario
    vector<int> lista1(cantidadNumeros);
    vector<int> lista2(cantidadNumeros);

    cout << "Ingrese los números para la primera lista: ";
    for (int i = 0; i < cantidadNumeros; i++) {
        cin >> lista1[i];
    }

    cout << "Ingrese los números para la segunda lista: ";
    for (int i = 0; i < cantidadNumeros; i++) {
        cin >> lista2[i];
    }

    // Ordenar las listas en una sola matriz
    vector<int> matriz(cantidadNumeros * 2);
    copy(lista1.begin(), lista1.end(), matriz.begin());
    copy(lista2.begin(), lista2.end(), matriz.begin() + cantidadNumeros);
    sort(matriz.begin(), matriz.end());

    // Imprimir la matriz resultante
    cout << "Matriz ordenada: ";
    for (int i = 0; i < cantidadNumeros * 2; i++) {
        cout << matriz[i] << " ";
    }
    cout << endl;

    return 0;
}

