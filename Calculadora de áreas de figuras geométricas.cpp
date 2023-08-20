#include <iostream>
#include <cmath>
using namespace std;

double calcularAreaTriangulo(double base, double altura) {
    return (base * altura) / 2;
}

double calcularAreaCuadrado(double lado) {
    return lado * lado;
}

double calcularAreaRectangulo(double base, double altura) {
    return base * altura;
}

double calcularAreaCirculo(double radio) {
    return M_PI * pow(radio, 2);
}

int main() {
    int opcion;
    
    cout << "Seleccione la figura para la cual desea calcular el �rea:" << endl;
    cout << "1. Tri�ngulo" << endl;
    cout << "2. Cuadrado" << endl;
    cout << "3. Rect�ngulo" << endl;
    cout << "4. C�rculo" << endl;
    cout << "Opci�n: ";
    cin >> opcion;
    
    switch (opcion) {
        case 1:
            double base, altura;
            cout << "Ingrese la base del tri�ngulo: ";
            cin >> base;
            cout << "Ingrese la altura del tri�ngulo: ";
            cin >> altura;
            cout << "�rea del tri�ngulo: " << calcularAreaTriangulo(base, altura) << endl;
            break;
        case 2:
            double lado;
            cout << "Ingrese el lado del cuadrado: ";
            cin >> lado;
            cout << "�rea del cuadrado: " << calcularAreaCuadrado(lado) << endl;
            break;
        case 3:
            double base_rect, altura_rect;
            cout << "Ingrese la base del rect�ngulo: ";
            cin >> base_rect;
            cout << "Ingrese la altura del rect�ngulo: ";
            cin >> altura_rect;
            cout << "�rea del rect�ngulo: " << calcularAreaRectangulo(base_rect, altura_rect) << endl;
            break;
        case 4:
            double radio;
            cout << "Ingrese el radio del c�rculo: ";
            cin >> radio;
            cout << "�rea del c�rculo: " << calcularAreaCirculo(radio) << endl;
            break;
        default:
            cout << "Opci�n inv�lida." << endl;
            break;
    }
    
    return 0;
}

