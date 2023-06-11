package database;


import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
    public static Connection dbConnect()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub","root","ENTERT@1nment");
            System.out.println("connected to database");
        return conn;
        }
        catch(Exception e)
        {
        }
        return null;
    }


}
