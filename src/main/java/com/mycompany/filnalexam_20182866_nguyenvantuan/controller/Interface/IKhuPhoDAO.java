package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface;

import com.mycompany.filnalexam_20182866_nguyenvantuan.model.KhuPhoModel;
import java.util.List;

/**
 *
 * @author Nguyen Van Tuan
 */

public interface IKhuPhoDAO {
    List<KhuPhoModel> findAll();
    KhuPhoModel findByID(String maKhuPho);
    boolean addKhuPho(KhuPhoModel khuPho);
    boolean editKhuPho(String maKhuPho, String tenKhuPho);
}
