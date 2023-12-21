package observer_design_pattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("Value is 1");
        subject.setState(2);
        System.out.println("\n Value is 14");
        subject.setState(14);
    }
}
