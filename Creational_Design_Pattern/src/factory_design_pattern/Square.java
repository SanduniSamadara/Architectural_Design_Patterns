package factory_design_pattern;

public class Square implements Shape{
    @Override
    public void draw() {  //return the obj
        System.out.println("Square Method Called!");
    }
}
