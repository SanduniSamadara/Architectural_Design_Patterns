package singleton_design_pattern;

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    public SingletonObject() {
    }

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton");
    }

}
