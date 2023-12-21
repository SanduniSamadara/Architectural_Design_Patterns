package factory_design_pattern;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");// call the method
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

    }
}
