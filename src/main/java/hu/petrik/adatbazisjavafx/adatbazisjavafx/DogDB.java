package hu.petrik.adatbazisjavafx.adatbazisjavafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DogDB {
    Connection conn;

    public static String DB_DRIVER = "mysql";
    public static String DB_USER = "root";
    public static String DB_PASS = "";


    public DogDB() throws SQLException {
        String url = String.format("");
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);


    }
    public createDogDB;
}
