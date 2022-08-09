package com.mycompany.filnalexam_20182866_nguyenvantuan.model;

/**
 *
 * @author Nguyen Van Tuan
 */

public class KhuPhoModel {
    String maKhuPho;
    String tenKhuPho;
    
    public KhuPhoModel(){};
    
    public KhuPhoModel(String maKhuPho, String tenKhuPho)
    {
        this.maKhuPho = maKhuPho;
        this.tenKhuPho = tenKhuPho;
    };
    
    public String getMaKhuPho()
    {
        return this.maKhuPho;
    };
    
    public void setMaKhuPho(String maKhuPho)
    {
        this.maKhuPho = maKhuPho;
    };
    
    public String getTenKhuPho()
    {
        return this.tenKhuPho;
    };        
    
    public void setTenKhuPho(String tenKhuPho)
    {
        this.tenKhuPho = tenKhuPho;
    };  

    @Override
    public String toString() {
        return "KhuPhoModel{" + "maKhuPho=" + maKhuPho + ", tenKhuPho=" + tenKhuPho + '}';
    }    
}
