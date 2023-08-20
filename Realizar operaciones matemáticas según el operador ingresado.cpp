#include <iostream>

int main() {
    using namespace std;
    int numero1, numero2;
    char operador;
    
    cout << "Ingrese el primer numero: ";
    cin >> numero1;
    
    cout << "Ingrese el segundo numero: ";
    cin >> numero2;
    
    cout << "Ingrese el operador (+, -, x, /, mod): ";
    cin >> operador;
    
    switch (operador) {
        case '+':
            cout << "Resultado: " << numero1 + numero2 << endl;
            break;
        case '-':
            cout << "Resultado: " << numero1 - numero2 << endl;
            break;
        case 'x':
            cout << "Resultado: " << numero1 * numero2 << endl;
            break;
        case '/':
            cout << "Resultado: " << numero1 / numero2 << endl;
            break;
        case 'mod':
            cout << "Resultado: " << numero1 % numero2 << endl;
            break;
        default:
            cout << "Operador invalido." << endl;
            break;
    }
    
    return 0;
}

