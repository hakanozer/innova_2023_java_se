package properties;

public class Product {

    private String title;
    private int price;
    private int star;

    public Product() {

    }

    public Product(String title, int price, int star) {
        this.title = title;
        this.price = price;
        this.star = star;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", star=" + star +
                '}';
    }

}
