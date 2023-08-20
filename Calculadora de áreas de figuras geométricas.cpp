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
    
    cout << "Seleccione la figura para la cual desea calcular el área:" << endl;
    cout << "1. Triángulo" << endl;
    cout << "2. Cuadrado" << endl;
    cout << "3. Rectángulo" << endl;
    cout << "4. Círculo" << endl;
    cout << "Opción: ";
    cin >> opcion;
    
    switch (opcion) {
        case 1:
            double base, altura;
            cout << "Ingrese la base del triángulo: ";
            cin >> base;
            cout << "Ingrese la altura del triángulo: ";
            cin >> altura;
            cout << "Área del triángulo: " << calcularAreaTriangulo(base, altura) << endl;
            break;
        case 2:
            double lado;
            cout << "Ingrese el lado del cuadrado: ";
            cin >> lado;
            cout << "Área del cuadrado: " << calcularAreaCuadrado(lado) << endl;
            break;
        case 3:
            double base_rect, altura_rect;
            cout << "Ingrese la base del rectángulo: ";
            cin >> base_rect;
            cout << "Ingrese la altura del rectángulo: ";
            cin >> altura_rect;
            cout << "Área del rectángulo: " << calcularAreaRectangulo(base_rect, altura_rect) << endl;
            break;
        case 4:
            double radio;
            cout << "Ingrese el radio del círculo: ";
            cin >> radio;
            cout << "Área del círculo: " << calcularAreaCirculo(radio) << endl;
            break;
        default:
            cout << "Opción inválida." << endl;
            break;
    }
    
    return 0;
}

