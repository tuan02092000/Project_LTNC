package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement;

import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface.IHoDanDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.database.ConnectDB;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.HoDanModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Van Tuan
 */
public class HoDanDAO implements IHoDanDAO{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public List<HoDanModel> findAll() {
        List<HoDanModel> listHodan = new ArrayList<>();
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from hodan";
            preparedStatement =connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                HoDanModel hoDan = new HoDanModel(resultSet.getString("maHoDan"), 
                                                  resultSet.getInt("soThanhVien"),
                                                  resultSet.getString("soNha"),
                                                  resultSet.getString("maKhuPho"));
                listHodan.add(hoDan);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listHodan;
    }

    @Override
    public HoDanModel findByID(String maHoDan) {
        HoDanModel hoDan = null;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from hodan where maHoDan = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHoDan);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                hoDan = new HoDanModel(resultSet.getString("maHoDan"), 
                                                  resultSet.getInt("soThanhVien"),
                                                  resultSet.getString("soNha"),
                                                  resultSet.getString("maKhuPho"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return hoDan;
    }
    
    @Override
    public List<HoDanModel> findByMaKhuPho(String maKhuPho) {
        List<HoDanModel> listHodan = new ArrayList<>();
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from hodan where maKhuPho = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKhuPho);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                HoDanModel hoDan = new HoDanModel(resultSet.getString("maHoDan"), 
                                                  resultSet.getInt("soThanhVien"),
                                                  resultSet.getString("soNha"),
                                                  resultSet.getString("maKhuPho"));
                listHodan.add(hoDan);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listHodan;
    }
    
    @Override
    public boolean addHoDan(HoDanModel hoDan) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "insert into hodan (maHoDan, soThanhVien, soNha, maKhuPho) values (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hoDan.getMaHoDan());
            preparedStatement.setInt(2, hoDan.getSoThanhVien());
            preparedStatement.setString(3, hoDan.getSoNha());
            preparedStatement.setString(4, hoDan.getMaKhuPho());
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int getSoThanhVien(String maHoDan) {
        int soTV = 0;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from hodan where maHoDan = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHoDan);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                soTV = resultSet.getInt("soThanhVien");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return soTV;
    }
    
    @Override
    public boolean editHoDan(String maHoDan, String soNha) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "update hodan set soNha = ? where maHoDan = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, soNha);
            preparedStatement.setString(2, maHoDan);
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public void editSoThanhvien(String maHoDan, int soThanhVien) {
        try {
            connection = new ConnectDB().getConnection();
            String sql = "update hodan set soThanhVien = ? where maHoDan = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, soThanhVien);
            preparedStatement.setString(2, maHoDan);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public boolean deleteHoDanByID(String maHoDan) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "delete from hodan where maHodan = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHoDan);
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    public static void main(String[] args) {
        HoDanDAO hdDAO = new HoDanDAO();
        
//        HoDanModel hDan = new HoDanModel("HD0002", 1, "1", "KP0002");
//        boolean rs = hdDAO.addHoDan(hDan);
//        if (rs) {
//            System.out.println("Them ho dan thanh cong");
//        } else {
//            System.out.println("Them ho dan that bai");
//        }

        
//        List<HoDanModel> listHoDan = new ArrayList<>();
//        listHoDan = hdDAO.findAll();
//        for(HoDanModel hd : listHoDan) {
//            System.out.println(hd.toString());
//        }
//        
//        HoDanModel hoDan = hdDAO.findByID("HD0000");
//        System.out.println(hoDan.toString());
//        
//        hdDAO.editSoThanhvien("HD0002", 3);
//        
//        int soTv = hdDAO.getSoThanhVien("HD0002");
//        System.out.println("So thanh vien: " + soTv);

        if(hdDAO.deleteHoDanByID("HD0020")) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }
}
