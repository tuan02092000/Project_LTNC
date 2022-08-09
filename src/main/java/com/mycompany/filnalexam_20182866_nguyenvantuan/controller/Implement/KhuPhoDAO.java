package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement;

import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface.IKhuPhoDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.database.ConnectDB;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.KhuPhoModel;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Van Tuan
 */
public class KhuPhoDAO implements IKhuPhoDAO{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    @Override
    public List<KhuPhoModel> findAll() {
        List<KhuPhoModel> listKhuPho = new ArrayList<>();
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from khupho";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                KhuPhoModel khuPho = new KhuPhoModel(resultSet.getString("maKhuPho"), resultSet.getString("tenKhuPho"));
                listKhuPho.add(khuPho);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listKhuPho;
    }

    @Override
    public KhuPhoModel findByID(String maKhuPho) {
        KhuPhoModel khuPho = null;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from khupho where maKhuPho = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKhuPho);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                khuPho = new KhuPhoModel(resultSet.getString("maKhuPho"), resultSet.getString("tenKhuPho"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return khuPho;
    }
    
    @Override
    public boolean addKhuPho(KhuPhoModel khuPho) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "insert into khupho (maKhuPho, tenKhuPho) values (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khuPho.getMaKhuPho());
            preparedStatement.setString(2, khuPho.getTenKhuPho());
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public boolean editKhuPho(String maKhuPho, String tenKhuPho) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "update khupho set tenKhuPho = ? where maKhuPho = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tenKhuPho);
            preparedStatement.setString(2, maKhuPho);
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public boolean deleteKhuPhoByID(String maKhuPho) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "delete from khupho where maKhuPho = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKhuPho);
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static void main(String[] args) {
        KhuPhoDAO kpDAO = new KhuPhoDAO();
        
//        KhuPhoModel kp = new KhuPhoModel("KP0002", "Le Thanh Nghi");
//        boolean rs = kpDAO.addKhuPho(kp);
//        if (rs) {
//            System.out.println("Them khu pho thanh cong");
//        } else {
//            System.out.println("Them khu pho that bai");
//        }
        
        
//        List<KhuPhoModel> listKhuPho = new ArrayList<>();
//        listKhuPho = kpDAO.findAll();
//        for (KhuPhoModel item : listKhuPho){
//            System.out.println(item.toString());
//        }
//        
//        KhuPhoModel khuPho = new KhuPhoModel();
//        khuPho = kpDAO.findByID("KP0000");
//        System.out.println(khuPho.toString());
        
        if(kpDAO.deleteKhuPhoByID("KP0009")) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }
}
