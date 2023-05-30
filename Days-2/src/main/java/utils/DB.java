package utils;

public class DB {

    private String dbUrl = "jdbc:mysql://localhost/sample";
    private String username = "";
    private String pasword = "";

    public Object connet() {
        Object obj = dbUrl;
        securty();
        return obj;
    }

    private String securty() {
        return "12312031203";
    }

    public String getDbUrl() {
        return this.dbUrl;
    }


}
