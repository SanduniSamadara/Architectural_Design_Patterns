package facade_design_pattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        // we do not want to create objects one by one.objects that are in the constructor is called
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
