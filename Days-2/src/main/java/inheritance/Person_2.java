package inheritance;

public class Person_2 extends Base{

    public Person_2(String name, int total, int day, double number) {
        super(name, total, day, number);
    }

    @Override
    public void call() {
        name();
        total();
    }
}
