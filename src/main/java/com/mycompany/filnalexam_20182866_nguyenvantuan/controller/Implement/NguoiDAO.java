package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement;

import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface.INguoiDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.database.ConnectDB;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.NguoiModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Van Tuan
 */
public class NguoiDAO implements INguoiDAO{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public List<NguoiModel> findAll() {
        List<NguoiModel> listNguoi = new ArrayList<>();
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from nguoi";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                NguoiModel nguoi = new NguoiModel(resultSet.getString("maNguoi"),
                                                  resultSet.getString("hoVaTen"),
                                                  resultSet.getInt("tuoi"),
                                                  resultSet.getInt("namSinh"),
                                                  resultSet.getString("ngheNghiep"),
                                                  resultSet.getString("maHoDan"));
                listNguoi.add(nguoi);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listNguoi;
    }

    @Override
    public NguoiModel findByID(String maNguoi) {
        NguoiModel nguoi = null;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from nguoi where maNguoi = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNguoi);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                nguoi = new NguoiModel(resultSet.getString("maNguoi"),
                                                  resultSet.getString("hoVaTen"),
                                                  resultSet.getInt("tuoi"),
                                                  resultSet.getInt("namSinh"),
                                                  resultSet.getString("ngheNghiep"),
                                                  resultSet.getString("maHoDan"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return nguoi;
    }
    
    @Override
    public List<NguoiModel> findByMaHoDan(String maHoDan) {
        List<NguoiModel> listNguoi = new ArrayList<>();
        try {
            connection = new ConnectDB().getConnection();
            String sql = "select * from nguoi where maHoDan = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHoDan);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                NguoiModel nguoi = new NguoiModel(resultSet.getString("maNguoi"),
                                                  resultSet.getString("hoVaTen"),
                                                  resultSet.getInt("tuoi"),
                                                  resultSet.getInt("namSinh"),
                                                  resultSet.getString("ngheNghiep"),
                                                  resultSet.getString("maHoDan"));
                listNguoi.add(nguoi);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listNguoi;
    }
    
    @Override
    public boolean addNguoi(NguoiModel nguoi) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "insert into nguoi (maNguoi, hoVaTen, tuoi, namSinh, ngheNghiep, maHoDan) values (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nguoi.getMaNguoi());
            preparedStatement.setString(2, nguoi.getHoVaTen());
            preparedStatement.setInt(3, nguoi.getTuoi());
            preparedStatement.setInt(4, nguoi.getNamSinh());
            preparedStatement.setString(5, nguoi.getNgheNghiep());
            preparedStatement.setString(6, nguoi.getMaHoDan());
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public boolean editNguoi(String maNguoi, NguoiModel nguoi) {
        boolean rs = false;
        try {
            connection = new ConnectDB().getConnection();
            String sql = "update nguoi set hoVaTen = ?, tuoi = ?, namSinh = ?, ngheNghiep = ? where maNguoi = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nguoi.getHoVaTen());
            preparedStatement.setInt(2, nguoi.getTuoi());
            preparedStatement.setInt(3, nguoi.getNamSinh());
            preparedStatement.setString(4, nguoi.getNgheNghiep());
            preparedStatement.setString(5, maNguoi);
            
            int result = preparedStatement.executeUpdate();
            if(result > 0) rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static void main(String[] args) {
        NguoiDAO nguoiDAO = new NguoiDAO();
        
//        NguoiModel nguoiModel = new NguoiModel("N0002", "Le Khanh Huyen", 20, 2002, "Sinh vien", "HD0002");
//        boolean rs = nguoiDAO.addNguoi(nguoiModel);
//        if (rs) {
//            System.out.println("Them nguoi thanh cong");
//        } else {
//            System.out.println("Them nguoi that bai");
//        }
        
        List<NguoiModel> listNguoi = nguoiDAO.findAll();
        for(NguoiModel nguoi: listNguoi) {
            System.out.println(nguoi.toString());
        }
        NguoiModel nguoi = nguoiDAO.findByID("N0000");
        System.out.println(nguoi.toString());
    }
}
