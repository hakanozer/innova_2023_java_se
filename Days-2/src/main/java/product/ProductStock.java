package product;

public class ProductStock {

    protected void report() {
        ProductService productService = new ProductService();
        productService.list();
        System.out.println(productService.rowCount);
    }

}
