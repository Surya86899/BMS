
import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","123456789");
        Statement stmt = con.createStatement();
        String s="insert into login values('suraj','123ABC')";
        stmt.execute(s);
        con.close();
        System.out.println("Query"); 
       // ResultSet rs = stmt.executeQuery("select * from table login");
    
        /*while (rs.next()) {
            String x = rs.getString("Username");
            String s = rs.getString("Password");
            System.out.println("Username : "+x+"Password"+s);
            stmt.close();
            con.close();*/
        }
    }
