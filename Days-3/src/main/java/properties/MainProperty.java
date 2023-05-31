package properties;

public class MainProperty {
    public static void main(String[] args) {

        String[] arr = { "İstanbul", "Ankara", "Adana", "Antalya" };
        int[] ints = { 10,20,30 };
        int[][] ints1 = { {10,11,12}, { 13,14,15 } };
        Integer[] integers = { 10,20,30 };
        Action action = new Action();

        Product p = new Product();
        p.setTitle("TV");
        p.setPrice(12000);
        p.setStar(4);
        action.productSave(p);

        Product p1 = new Product("Bilgisayar", 30000, 3);
        Product p2 = new Product("Masa", 11000, 5);
        Product p3 = new Product("Laptop", 33000, 4);

        Product[] product = { p1, p2, p3 };
        action.allProduct(product);

    }
}
