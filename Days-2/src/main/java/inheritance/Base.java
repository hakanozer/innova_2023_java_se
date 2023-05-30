package inheritance;

public class Base {

    private String name;
    private int total;
    private int day;
    private double number;

    public Base(String name, int total, int day, double number) {
        this.name = name;
        this.total = total;
        this.day = day;
        this.number = number;
    }

    public void call() {}

    public void name( ) {
        System.out.println( name );
    }

    public void total() {
        double ttl = total + (day * number);
        System.out.println( ttl );
    }



}
