#include <iostream>
#include <string>

int main() {
    using namespace std;
    int numero;
    string cadena;
    
    cout << "Ingrese numeros positivos (0 o negativo para terminar): " << endl;
    
    do {
        cout << "Numero: ";
        cin >> numero;
        
        if (numero > 0) {
            cadena += to_string(numero);
        }
    } while (numero > 0);
    
    cout << "Cadena resultante: " << cadena << endl;
    
    return 0;
}

