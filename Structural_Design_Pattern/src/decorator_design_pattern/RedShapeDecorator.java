package decorator_design_pattern;

//new added functionality
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape); // call method in super constructor
    }

    @Override
    public void draw(){
        decoratorShape.draw();
        setRedShape(decoratorShape);
    }

    private void setRedShape(Shape redShape){
        System.out.println("Set Red Border");
    }
}
