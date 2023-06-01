import utils.DB;

public class MainApplication {
    public static void main(String[] args) {

        DB db = new DB();
        db.connection();
        db.close();

        db.connection();
        db.close();

    }
}
