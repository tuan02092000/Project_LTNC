package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface;

import com.mycompany.filnalexam_20182866_nguyenvantuan.model.HoDanModel;
import java.util.List;

/**
 *
 * @author Nguyen Van Tuan
 */
public interface IHoDanDAO {
    List<HoDanModel> findAll();
    HoDanModel findByID(String maHoDan);
    boolean addHoDan(HoDanModel hoDan);
    int getSoThanhVien(String maHoDan);
    void editSoThanhvien(String maHoDan, int soThanhVien);
    boolean editHoDan(String maHoDan, String soNha);
    List<HoDanModel> findByMaKhuPho(String maKhuPho);
    boolean deleteHoDanByID(String maHoDan);
}
