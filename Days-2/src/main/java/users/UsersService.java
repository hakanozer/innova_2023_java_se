package users;

import product.ProductService;
import utils.DB;

public class UsersService {

    public void call() {
        ProductService productService = new ProductService();
        productService.orderList(100);

        DB db = new DB();
        db.connet();
        System.out.println( db.getDbUrl() );

    }

}
