#include <iostream>

using namespace std;

int main() {
    int numero;
    int sumaAsteriscos = 0;

    cout << "Ingrese un numero: ";
    cin >> numero;

    for (int i = 1; i <= numero; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "*";
            sumaAsteriscos++;
        }
        cout << endl;
    }

    cout << "La suma de todos los asteriscos impresos es: " << sumaAsteriscos << endl;

    return 0;
}

