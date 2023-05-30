package inheritance;

public class Person_3 extends Base{

    public Person_3(String name, int total, int day, double number) {
        super(name, total, day, number);
    }

    @Override
    public void call() {
        name();
        total();
    }
}
