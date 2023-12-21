package decorator_design_pattern;

public class ShapeDecorator implements Shape{

    // shape type instance
    protected  Shape decoratorShape;


    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
     decoratorShape.draw();
    }
}
