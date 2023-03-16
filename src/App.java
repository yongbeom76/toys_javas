import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        String input = scanner.next();

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
            // - SELECT * FROM users ;
            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);
            // - 결과 출력
            while(resultSet.next()){
                String UNIQUE_ID = resultSet.getString("UNIQUE_ID");
                System.out.print("UNIQUE_ID :" + UNIQUE_ID);
                System.out.print(", NAME :" + resultSet.getString("NAME"));
                System.out.print(", EMAIL :" + resultSet.getString("EMAIL"));
                System.out.print(", JOB :" + resultSet.getString("JOB"));
                System.out.println();
            }
            
            // insert into
            // query = "INSERT INTO users (UNIQUE_ID,NAME,EMAIL,JOB)"+
            //             "VALUES ('U6','Sanghun','sanghun@naver.com','IT Billing')";
            // statement.executeQuery(query);

            // update
            query = "update users SET NAME = 'SANG'";
            statement.execute(query);

        } catch (SQLException exception) {
            exception.printStackTrace();            
        }

    }
}
