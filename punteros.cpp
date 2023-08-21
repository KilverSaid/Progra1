#include <iostream>

using namespace std;

void numeroParOImpar() {
    int numero, resultado;

    cout << "Verificar si un numero es par o impar" << endl;
    cin >> numero;

    resultado = numero % 2;

    if (resultado == 0) {
        cout << numero << " Es un numero par." << endl;
    } else {
        cout << numero << " Es un numero impar." << endl;
    }
}

int main() {
    numeroParOImpar();

    return 0;
}

