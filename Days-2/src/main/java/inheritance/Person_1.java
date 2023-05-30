package inheritance;

public class Person_1 extends Base {

    public Person_1(String name, int total, int day, double number) {
        super(name, total, day, number);
    }

    @Override
    public void call() {
        name();
        total();
    }

    public void action() {
        System.out.println("Action Call");
    }
}
