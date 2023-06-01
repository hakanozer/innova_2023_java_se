package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/innova_2023_java_se";
    private final String username = "sa";
    private final String password = "sa";

    private Connection conn = null;

    public Connection connection() {
        try {
            if ( conn == null || conn.isClosed() ) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Success");
            }
        }catch (Exception ex) {
            System.err.println("Connection error :" + ex);
        }
        return conn;
    }


    public void close() {
        try {
            if ( conn != null && !conn.isClosed() ) {
                conn.close();
                System.out.println("Close Success");
            }
        }catch (Exception ex) {
            System.err.println("Close error :"+ ex) ;
        }
    }

}
