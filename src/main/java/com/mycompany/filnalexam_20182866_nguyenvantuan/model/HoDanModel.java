package com.mycompany.filnalexam_20182866_nguyenvantuan.model;

/**
 *
 * @author Nguyen Van Tuan
 */
public class HoDanModel {
    String maHoDan;
    int soThanhVien;
    String soNha;
    String maKhuPho;

    public HoDanModel() {
    };

    public HoDanModel(String maHoDan, int soThanhVien, String soNha, String maKhuPho) {
        this.maHoDan = maHoDan;
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.maKhuPho = maKhuPho;
    }

    public String getMaHoDan() {
        return maHoDan;
    }

    public void setMaHoDan(String maHoDan) {
        this.maHoDan = maHoDan;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaKhuPho() {
        return maKhuPho;
    }

    public void setMaKhuPho(String maKhuPho) {
        this.maKhuPho = maKhuPho;
    }

    @Override
    public String toString() {
        return "HoDanModel{" + "maHoDan=" + maHoDan + ", soThanhVien=" + soThanhVien + ", soNha=" + soNha + ", maKhuPho=" + maKhuPho + '}';
    }
    
    
}
