package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement;

import com.mycompany.filnalexam_20182866_nguyenvantuan.database.ConnectDB;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface.IUserDAO;


/**
 *
 * @author AD
 */
public class UserDAO implements IUserDAO{
    Connection connection = null;
    PreparedStatement prepareStatement = null;
    ResultSet resultSet = null;
    
    @Override
    public UserModel findUser(String userName, String password, int checkBox) {
        UserModel user = null;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from user where username = ? and password = ? and role = ?";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, userName);
            prepareStatement.setString(2, password);
            prepareStatement.setInt(3, checkBox);
            resultSet = prepareStatement.executeQuery();
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
    
    public static void main(String[] args) {
        UserDAO loginDAO = new UserDAO();
        UserModel user = loginDAO.findUser("tuannvt", "123456", 0);
        System.out.println(user.toString());
    }
}
