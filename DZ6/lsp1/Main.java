package DZ6.lsp1;

import DZ6.lsp1.shape.Quadrilaterial;
import DZ6.lsp1.shape.Rectangle;
import DZ6.lsp1.shape.Square;
import DZ6.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
//        rectangle.setSideA(4);
//        rectangle.setSideB(5);
//        System.out.printf("В квадрате сторона A = %d, сторона B = %d\n", square.getSide(), square.getSide());
//        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(square);
        ShapeView view1 = new ShapeView(rectangle);

        view.showArea();
        view1.showArea();
    }
}