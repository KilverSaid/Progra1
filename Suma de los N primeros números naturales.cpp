#include <iostream>
using namespace std;

int main() {
    int N, sum = 0;
    cout << "Ingrese el n�mero l�mite: ";
    cin >> N;
    
    for (int i = 1; i <= N; i++) {
        sum += i;
    }
    
    cout << "La suma de los " << N << " primeros n�meros naturales es: " << sum << endl;
    return 0;
}

