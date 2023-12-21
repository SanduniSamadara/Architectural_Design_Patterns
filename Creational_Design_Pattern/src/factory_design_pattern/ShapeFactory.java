package factory_design_pattern;

public class ShapeFactory {

    // Create objects and give a parameter in method.According to the parameter return the object
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }else {
            if (shapeType.equalsIgnoreCase("Circle")){
                return new Circle();
            } else if (shapeType.equalsIgnoreCase("Square")){
                return new Square();
            } else if (shapeType.equalsIgnoreCase("Rectangle")){
                return new Rectangle();
            }
        }
        return null;

    }
}
