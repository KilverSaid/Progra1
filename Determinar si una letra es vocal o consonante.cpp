#include <iostream>

int main() {
    using namespace std;
    char letra;
    
    cout << "Ingrese una letra: ";
    cin >> letra;
    
    // Convertir a minúscula para simplificar las comparaciones
    letra = tolower(letra);
    
    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        cout << "La letra ingresada es una vocal." << endl;
    } else {
        cout << "La letra ingresada es una consonante." << endl;
    }
    
    return 0;
}

