//Clase Punto
class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

//Clase Cuadrilatero
abstract class Cuadrilatero {
    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
    }

    abstract double calcularArea();
}

//Clase Trapezoide
class Trapezoide extends Cuadrilatero {
    private double base1, base2, altura;

    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double base1, double base2, double altura) {
        super(punto1, punto2, punto3, punto4);
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base1 + base2) / 2 * altura;
    }
}

//Clase Paralelogramo
class Paralelogramo extends Cuadrilatero {
    private double base, altura;

    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double base, double altura) {
        super(punto1, punto2, punto3, punto4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}

//Clase Rectangulo
class Rectangulo extends Paralelogramo {
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double base, double altura) {
        super(punto1, punto2, punto3, punto4, base, altura);
    }
}

//Clase Cuadrado
class Cuadrado extends Rectangulo {
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double lado) {
        super(punto1, punto2, punto3, punto4, lado, lado);
    }
}

