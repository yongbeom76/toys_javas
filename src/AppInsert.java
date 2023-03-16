import java.sql.*;

public class AppInsert {
    public void InsertFunction(Statement statement){
        try {
            String query = "INSERT INTO users (UNIQUE_ID,NAME,EMAIL,JOB) "+
                            "VALUES ('U8','Sanghun','sanghun@naver.com','IT Billing')";
                statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
