#include <iostream>

int main() {
    using namespace std;
    int totalSegundos, horas, minutos, segundos;
    
    cout << "Ingrese el total de segundos: ";
    cin >> totalSegundos;
    
    horas = totalSegundos / 3600;
    minutos = (totalSegundos % 3600) / 60;
    segundos = (totalSegundos % 3600) % 60;
    
    cout << "Horas: " << horas << endl;
    cout << "Minutos: " << minutos << endl;
    cout << "Segundos: " << segundos << endl;
    
    return 0;
}

