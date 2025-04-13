package kadai_007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Posts_Chapter07 {
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
            
            //テーブルを作成
           String createTablesql = """
                 CREATE TABLE IF NOT EXISTS posts (
                       post_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       user_id INT NOT NULL,
                       posted_at DATE NOT NULL,
                       post_content VARCHAR(255) NOT NULL,
                       likes INT DEFAULT 0
                 );
                 """;
                 statement.executeUpdate(createTablesql);
                 
             //データ追加前にテーブルを初期化
                 statement.executeUpdate("TRUNCATE TABLE posts;");
                 System.out.println("レコード追加を実施します");
                            
            // データを挿入
            String insertSql = """
                    INSERT INTO posts (user_id, posted_at, post_content, likes) VALUES
                    	(1003, "2023-02-08", "昨日の夜は徹夜でした・・", 13),
                    	(1002, "2023-02-08", "お疲れ様です！", 12),
                    	(1003, "2023-02-09", "今日も頑張ります！", 18),
                    	(1001, "2023-02-09", "無理は禁物ですよ！", 17),
                    	(1002, "2023-02-10", "明日から連休ですね！", 20);
                	"""; 
            int insertCount = statement.executeUpdate(insertSql);
            System.out.println(insertCount + "件のレコードが追加されました");
            
         // データを検索
            System.out.println("ユーザーIDが1002のレコードを検索しました");
            String selectSql = """
                SELECT * FROM posts WHERE user_id = 1002;
                """;
            ResultSet resultSet = statement.executeQuery(selectSql);
            
            
            
            int count = 1;
            while (resultSet.next()) {
                String postedAt = resultSet.getString("posted_at");
                String postContent = resultSet.getString("post_content");
                int likes = resultSet.getInt("likes");

                System.out.println(count + "件目：投稿日時=" + postedAt 
                    + "／投稿内容=" + postContent 
                    + "／いいね数=" + likes);

                count++;
            }           

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
