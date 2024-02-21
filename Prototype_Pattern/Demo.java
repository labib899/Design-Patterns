import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.radius = 15;
        circle.color = "red";
        Font font1 = new Font("Arial");
        circle.font = font1;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Triangle triangle = new Triangle();
        triangle.height = 10;
        triangle.ground = 20;
        triangle.color = "green";
        Font font2 = new Font("SutuniiMj");
        triangle.font = font2;
        shapes.add(triangle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        Font font3 = new Font("Arial");
        rectangle.font = font3;
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        Font font = new Font("Ar");

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects");
                shapes.get(0).font = font;
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical");
                } else {
                    System.out.println(i + ": But they are not identical");
                }
            } else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }
}