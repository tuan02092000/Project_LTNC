package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface;

import com.mycompany.filnalexam_20182866_nguyenvantuan.model.NguoiModel;
import java.util.List;

/**
 *
 * @author Nguyen Van Tuan
 */
public interface INguoiDAO {
    List<NguoiModel> findAll();
    NguoiModel findByID(String maNguoi);
    boolean addNguoi(NguoiModel nguoi);
    boolean editNguoi(String maNguoi, NguoiModel nguoi);
    List<NguoiModel> findByMaHoDan(String maHoDan);
}
