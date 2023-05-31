package properties;

public class Action {

    public void productSave( Product product ) {
        System.out.println( product.toString() );
    }

    public void allProduct( Product[] products ) {
        for( Product item : products ) {
            System.out.println(item);
        }
    }

}
