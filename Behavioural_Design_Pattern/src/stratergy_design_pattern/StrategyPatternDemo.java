package stratergy_design_pattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("Add Operation (9,5): "+context.executeOperation(9,5));
        Context context1 = new Context(new SubstractOperation());
        System.out.println("Substract Operation (20,9): "+context1.executeOperation(20,9));
        Context context2 = new Context(new MultiplyOperation());
        System.out.println("Multiply Operation (10,5): "+context2.executeOperation(10,5));

    }
}
