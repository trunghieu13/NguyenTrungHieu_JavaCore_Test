import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DatabaseConnection {
   private static String url ="jdbc:postgresql://localhost:5432/dvdental";
    private static String username ="postgres";
    private static String password ="hieunguyentheking";
    public static Connection getConnection()
    {
        Connection cnt = null;
        try
        {
            cnt = DriverManager.getConnection(url,username,password);//tạo kết nối
            return cnt;
        } catch (SQLException e)
        {
            return null;
        }

    }

}
