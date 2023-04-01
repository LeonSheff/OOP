package DZ6.srp1;

import DZ6.srp1.figure.Brush;
import DZ6.srp1.figure.Point;
import DZ6.srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Brush brush = new Brush(square);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        brush.draw(square);
    }
}