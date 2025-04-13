package kadai_004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeesTable {
    public static void main(String[] args) {

        Connection con = null;
        Statement statement = null;

        try {
            // データベースに接続
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost/challenge_java",
                "root",
                "takrou1096" 
            );

            System.out.println("データベース接続成功");

            // SQLクエリを準備
            statement = con.createStatement();
            String sql = """
                         CREATE TABLE IF NOT EXISTS employees (
                           id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(100) NOT NULL,
                           position VARCHAR(100),
                           salary INT,
                           hire_date DATE
                         );
                         """;

            // SQLクエリを実行（DBMSに送信）
            int rowCnt = statement.executeUpdate(sql);
            System.out.println("テーブルを作成: rowCnt = " + rowCnt);

        } catch (SQLException e) {
            System.out.println("エラー発生：" + e.getMessage());

        } finally {
            // リソースを解放
            if (statement != null) {
                try { statement.close(); } catch (SQLException ignore) {}
            }
            if (con != null) {
                try { con.close(); } catch (SQLException ignore) {}
            }
        }
    }
}
