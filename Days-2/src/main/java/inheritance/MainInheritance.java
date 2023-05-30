package inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        Base p1 = new Person_1("Ali Bilmem", 10000, 3, 0.8);
        Person_1 p2 = new Person_1("Ahmet Bilmem", 10000, 7, 1.8);
        Person_2 person2 = new Person_2("Zehra Bilsin", 8000, 15, 0.4);
        Person_3 person3 = new Person_3("Mehmet Bilirler", 6000, 19, 0.3);


        fncCall(p1);
        fncCall(p2);
        fncCall(person2);
        fncCall(person3);

    }


    public static void fncCall( Base base ) {
        base.call();
    }

}
