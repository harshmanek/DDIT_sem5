import javax.management.Query;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            /*
            * Load  and register driver
            * create connection
            * create statement
            * execute statement
            * close connection
            * */
        try {
            String sql = "Select * from Student ";
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDB","postgres","123");
            System.out.println("----Connection Established----");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //ResultSetMetaData
            ResultSetMetaData meta = rs.getMetaData();
            int iColumnCount = meta.getColumnCount();
            for (int i =1 ; i <= iColumnCount ; i++){
                System.out.println("Column Name:"+ meta.getColumnName(i));
                System.out.println("Column Type" + meta.getColumnType(i));
                System.out.println("Display Size: " + meta.getColumnDisplaySize(i) );
                System.out.println("Precision: " + meta.getPrecision(i));
                System.out.println("Scale: " + meta.getScale(i) );
            }


//            rs.next();//this return boolean value for the presence and absence of next elements in the table.
            while(rs.next())
            {
                System.out.println("The sid is "+rs.getString("sid") + " and name is "+rs.getString("sname")+" he comes from " + rs.getString("city")+"\n");
            }
        }
        catch (Exception e){
            System.out.println("error occurred");
        }

    }
}