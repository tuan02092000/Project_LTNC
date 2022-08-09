package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement;

import com.mycompany.filnalexam_20182866_nguyenvantuan.database.ConnectDB;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface.IUserDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nguyen Van Tuan
 */
public class UserDAO implements IUserDAO{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    @Override
    public UserModel findUser(String userName, String password, int checkBox) {
        UserModel user = null;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from user where username = ? and password = ? and role = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            preparedStatement.setInt(3, checkBox);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                user = new UserModel();
                user.setTenTaiKhoan(resultSet.getString("username"));
                user.setMatKhau(resultSet.getString("password"));
                user.setVaiTro(resultSet.getInt("role"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;     
    }
    
    @Override
    public boolean addUser(String userName, String password, int checkBox) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "insert into user (username, password, role) values (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            preparedStatement.setInt(3, checkBox);
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }     
        return rs;
    }
    
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        UserModel user = userDAO.findUser("tuannvt", "123456", 0);
        System.out.println(user.toString());
        
        if(userDAO.addUser("tuannguyen", "1", 0)) {
            System.out.println("Them user thanh cong");
        } else {
            System.out.println("Them user khong thanh cong");
        }
        
        
    }
}
