package lab1.hometask.singleton;

public class Start {
    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();

        TestSingleton.getInstance().stop();
    }
}
