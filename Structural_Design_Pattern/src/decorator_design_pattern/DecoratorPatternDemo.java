package decorator_design_pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redShapeSquare = new RedShapeDecorator(new Square());
        RedShapeDecorator redShapeRectangle= new RedShapeDecorator(new Rectangle());

        System.out.println("Without Decorator");
        circle.draw();
        System.out.println("\n With Red Shape");
        redShapeCircle.draw();
        System.out.println("\nWith Red Shape");
        redShapeSquare.draw();
        System.out.println("\nWith Red Shape");
        redShapeRectangle.draw();

    }
}
