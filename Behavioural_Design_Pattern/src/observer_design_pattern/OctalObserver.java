package observer_design_pattern;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal Value : "+Integer.toOctalString(subject.getState()));
    }
}