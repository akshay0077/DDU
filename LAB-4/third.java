import java.text.DecimalFormat;

abstract class Geometry {
    abstract double perimeter();
}

class Square extends Geometry {
    double length;

    Square(double length) {
        this.length = length;
    }

    double perimeter() {
        return 4 * length;
    }
}

class Circle extends Geometry {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class third {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Circle circle = new Circle(5.0);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Perimeter of Square: " + df.format(square.perimeter()));
        System.out.println("Perimeter of Circle: " + df.format(circle.perimeter()));
    }
}
