#include <iostream>
using namespace std;

int main() {
    int num, inverted = 0;
    cout << "Ingrese un n�mero: ";
    cin >> num;
    
    while (num != 0) {
        inverted = inverted * 10 + num % 10;
        num /= 10;
    }
    
    cout << "N�mero invertido: " << inverted << endl;
    return 0;
}

