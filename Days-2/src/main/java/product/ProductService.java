package product;

public class ProductService {

    protected int rowCount = 50;

    protected void save() {
        System.out.println("Product Save");
    }

    protected void list() {
        System.out.println("Product List");
    }

    public void orderList( int userID ) {
        System.out.println("User Order List : " + userID);
    }

}
