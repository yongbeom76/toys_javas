import java.sql.*;
public class AppMain {
    public static void main(String[] args) {
        // Done - MySQL workbench  실행: JDBC
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/study_sqls";
        String user = "root";
        String password = "*khacademy!";
        // - database 지정
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            // query EDIT
            Statement statement = connection.createStatement();         // 연결한 상태에서  edit 창을 만든거다.
            
            //select statement
            AppSelect appSelect = new AppSelect();
            appSelect.SelectFunction(statement);

            // insert into
            AppInsert appInsert = new AppInsert();
            appInsert.InsertFunction(statement);

            // update
            AppUpdate appUpdate = new AppUpdate();
            appUpdate.UpdateFunction(statement);

        } catch (SQLException exception) {
            exception.printStackTrace();            
        }

    }
}
