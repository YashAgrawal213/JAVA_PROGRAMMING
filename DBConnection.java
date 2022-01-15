import java.sql.*;
public class DBConnection {
    Connection con;
    DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");
            System.out.println("Connection success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        DBConnection a = new DBConnection();
    }
}
