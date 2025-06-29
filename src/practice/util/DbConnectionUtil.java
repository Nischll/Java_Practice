package practice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {
    private static final String url = "jdbc:postgresql://localhost:5433/java_practice";
    private static final String username ="postgres";
    private static final String password = "postgres";

//            Connect to database;
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
