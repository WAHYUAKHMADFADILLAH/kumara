
package config;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection Go(){
        try {
//            MysqlDataSource m = new MysqlDataSource();
//            String url = "jdbc:mysql://localhost:3306/sambat";
//            String user = "root";
//            String pass = "Wahyu0085!";
            MysqlDataSource m = new MysqlDataSource();
            String url = "jdbc:mysql://localhost:8889/sambat";
            String user = "root";
            String pass = "root";
            
            Connection C = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!\n"+
                    e.getMessage());
        }
        
        
        return null;
    }
}
