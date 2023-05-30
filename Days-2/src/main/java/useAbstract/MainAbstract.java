package useAbstract;

public class MainAbstract {
    public static void main(String[] args) {

        Person person = new Person(102, 12345678999l);
        System.out.println( person.name() );
        System.out.println( person.total() );

        Customer cus = new Customer() {
            @Override
            int customerNumber() {
                return 101;
            }

            @Override
            long customerTC() {
                return 101;
            }
        };
        System.out.println( cus.name() );
        System.out.println( cus.total() );

    }
}
