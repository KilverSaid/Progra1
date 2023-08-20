#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Ingrese un número del 1 al 12: ";
    cin >> num;
    
    for (int i = 1; i <= 12; i++) {
        cout << num << " x " << i << " = " << num * i << endl;
    }
    return 0;
}

