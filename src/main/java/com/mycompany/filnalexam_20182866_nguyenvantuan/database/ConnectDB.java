package com.mycompany.filnalexam_20182866_nguyenvantuan.database;

import com.mycompany.filnalexam_20182866_nguyenvantuan.config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nguyen Van Tuan
 */
public class ConnectDB {
    public static Connection connection = null;
    public void driverTest() throws ClassNotFoundException{
        try{
            Class.forName(Config.DRIVER);
        }catch(ClassNotFoundException e){
            throw new ClassNotFoundException("JDBC DRIVER NOT FOUND" + e.getMessage());
        }
    };
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        if (connection == null){
            driverTest();
            try{
                connection = DriverManager.getConnection(Config.URL_DATABASE, Config.USERNAME, Config.PASSWORD);
            }catch(SQLException e){
                throw new SQLException("Connect DataBase Fail!" + e.getMessage());
            }
        }
        return connection;
    }
    
    public void closeConnection() throws SQLException{
        if (connection != null){
            connection.close();
            System.out.println("Disconnect database.");
        }
    }
}
