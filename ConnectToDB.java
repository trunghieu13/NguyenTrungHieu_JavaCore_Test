
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Scanner;


public class ConnectToDB {
    private static List<Actor> ListofActor = new ArrayList<>();
    public void GetAllTheName() // Dùng câu lệnh SELECT
    {
        Connection cnt = null;
        PreparedStatement stm = null;
        ResultSet rlt =null;

        try {
            String sql = "SELECT * FROM actor";

            cnt = DatabaseConnection.getConnection(); // tạo kết nối
            stm = cnt.prepareStatement(sql); //tạo câu lệnh truy vấn
            rlt = stm.executeQuery(); // thực thi câu lệnh truy vấn
            while (rlt.next())
            {
                Integer id = rlt.getInt("actor_id");
                String firsname = rlt.getString("first_name");
                String lastname = rlt.getString("last_name");
                String lastupdate = rlt.getTimestamp("last_update").toString();
                Actor b = new Actor(id,firsname,lastname,lastupdate);
                ListofActor.add(b);
            }
        }catch (SQLException e)
        {
            return;
        }finally {
            try {
                if(cnt != null)
                {
                    cnt.close();
                }
                if(stm != null)
                {
                    stm.close();
                }
                if(rlt != null)
                {
                    rlt.close();
                }

            }catch (Exception e1) {
                e1.printStackTrace();
            }

        }
    }
    //-------------------------------------------------------------------------------------//
    public void getnamewithWHERE(String ten)
    {
        Connection cnt = null;
        PreparedStatement stm = null;
        ResultSet rlt =null;

        try {
            String sql = "SELECT * FROM actor" +" "+ "WHERE first_name = ?";

            cnt = DatabaseConnection.getConnection(); // tạo kết nối
            stm = cnt.prepareStatement(sql); //tạo câu lệnh truy vấn
            stm.setString(1,ten);// vi tri dau ? = ten
            rlt = stm.executeQuery(); // thực thi câu lệnh truy vấn
            while (rlt.next())
            {
                Integer id = rlt.getInt("actor_id");
                String firsname = rlt.getString("first_name");
                String lastname = rlt.getString("last_name");
                String lastupdate = rlt.getTimestamp("last_update").toString();
                Actor b = new Actor(id,firsname,lastname,lastupdate);
                ListofActor.add(b);
            }
        }catch (SQLException e)
        {
            return;
        }finally {
            try {
                if(cnt != null)
                {
                    cnt.close();
                }
                if(stm != null)
                {
                    stm.close();
                }
                if(rlt != null)
                {
                    rlt.close();
                }

            }catch (Exception e1) {
                e1.printStackTrace();
            }

        }
    }
    //----------------------------------------------------------------------------------//

    public void INSERT(String First_name,String Last_name,Timestamp Time)
    {
        Connection cnt = null;
        PreparedStatement stm = null;
        ResultSet rlt =null;

        try {
            String sql = "INSERT INTO ACTOR (first_name,last_name,last_update)"+"VALUE(?,?,?)";

            cnt = DatabaseConnection.getConnection(); // tạo kết nối
            stm = cnt.prepareStatement(sql); //tạo câu lệnh truy vấn
            stm.setString(1,First_name);
            stm.setString(2,Last_name);
            stm.setTimestamp(3,Time);

            rlt = stm.executeQuery(); // thực thi câu lệnh truy vấn
            while (rlt.next())
            {
                Integer id = rlt.getInt("actor_id");
                String firsname = rlt.getString("first_name");
                String lastname = rlt.getString("last_name");
                String lastupdate = rlt.getTimestamp("last_update").toString();
                Actor b = new Actor(id,firsname,lastname,lastupdate);
                ListofActor.add(b);

            }
        }catch (SQLException e)
        {
            return;
        }finally {
            try {
                if(cnt != null)
                {
                    cnt.close();
                }
                if(stm != null)
                {
                    stm.close();
                }
                if(rlt != null)
                {
                    rlt.close();
                }

            }catch (Exception e1) {
                e1.printStackTrace();
            }

        }
    }
    public static void UPDATE(Integer Id,String FirstName,String LastName,Timestamp Time) throws SQLException {
        Connection cnt = null;
        PreparedStatement stm = null;
        ResultSet rlt =null;
        try{
            String sql = "UPDATE actor"+"SET first_name=?,lastname = ?,last_update= ?"+"WHERE actor_id = ?";
            cnt = DatabaseConnection.getConnection();
            stm = cnt.prepareStatement(sql); //tạo câu lệnh truy vấn
            cnt.setAutoCommit(false); // dung Transacton
            stm.setString(1,FirstName);
            stm.setString(2,LastName);
            stm.setTimestamp(3,Time);
            stm.setInt(4,Id);
            stm.executeUpdate(); // thực thi câu lệnh update
            cnt.commit();
        }catch (SQLException e)
        {
            System.out.printf(e.getMessage());
            cnt.rollback();// tra ve gtri ban dau neu co loi
        }finally {
            try{
                if(cnt != null)
                {
                    cnt.close();
                }
                if(stm != null)
                {
                    stm.close();
                }
                if(rlt != null)
                {
                    rlt.close();
                }
            }catch (SQLException e1){
                e1.getMessage();
            }
        }
    }
    public static void main(String args[])
    {
        // for the INSERT
        Scanner sc = new Scanner(System.in);
        ConnectToDB CALL = new ConnectToDB();
        System.out.println("nhap first name: ");
        String ho = sc.nextLine();
        System.out.println("nhap ten: ");
        String ten = sc.nextLine();
        Timestamp time = new Timestamp(System.currentTimeMillis());
        CALL.INSERT(ho,ten,time);
        CALL.getnamewithWHERE(ho);
    }
}
