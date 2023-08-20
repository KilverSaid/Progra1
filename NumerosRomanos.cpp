#include <iostream>
using namespace std;

string toRoman(int num) {
    const int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    const string roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    string result = "";
    for (int i = 0; i < 13; i++) {
        while (num >= values[i]) {
            result += roman[i];
            num -= values[i];
        }
    }
    return result;
}

int main() {
    int num;
    cout << "Ingrese un n�mero entero: ";
    cin >> num;

    if (num >= 1 && num <= 3999) {
        string romanNumeral = toRoman(num);
        cout << "El n�mero romano correspondiente es: " << romanNumeral << endl;
    } else {
        cout << "El n�mero debe estar entre 1 y 3999." << endl;
    }

    return 0;
}


