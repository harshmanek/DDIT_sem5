import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String userInput = "sayyam";
        try {

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDB", "postgres", "123");
//            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM student WHERE sname = ? ";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.executeUpdate("INSERT INTO PRODUCT VALUES (133,'sayyam', 'halvad')" );
            pstm.setString(1,userInput);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("User: " + rs.getString("sname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}