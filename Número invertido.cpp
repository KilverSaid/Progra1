#include <iostream>
using namespace std;

int main() {
    int num, inverted = 0;
    cout << "Ingrese un número: ";
    cin >> num;
    
    while (num != 0) {
        inverted = inverted * 10 + num % 10;
        num /= 10;
    }
    
    cout << "Número invertido: " << inverted << endl;
    return 0;
}

