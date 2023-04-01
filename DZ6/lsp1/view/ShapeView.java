package DZ6.lsp1.view;

import DZ6.lsp1.shape.Quadrilaterial;
import DZ6.lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadrilaterial quadrilaterial;

    public ShapeView(Quadrilaterial quadrilaterial) {
        this.quadrilaterial = quadrilaterial;
    }

    public void showArea() {
        System.out.print("Площадь четырехугольника равна:");
        System.out.println(quadrilaterial.getArea());
    }
}