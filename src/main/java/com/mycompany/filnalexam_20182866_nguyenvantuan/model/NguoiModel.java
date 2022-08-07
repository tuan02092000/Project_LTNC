package com.mycompany.filnalexam_20182866_nguyenvantuan.model;

/**
 *
 * @author Nguyen Van Tuan
 */
public class NguoiModel {
    String maNguoi;
    String hoVaTen;
    int tuoi;
    int namSinh;
    String ngheNghiep;
    String maHoDan;

    public NguoiModel() {
    }

    public NguoiModel(String maNguoi, String hoVaTen, int tuoi, int namSinh, String ngheNghiep, String maHoDan) {
        this.maNguoi = maNguoi;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
        this.maHoDan = maHoDan;
    }

    public String getMaNguoi() {
        return maNguoi;
    }

    public void setMaNguoi(String maNguoi) {
        this.maNguoi = maNguoi;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getMaHoDan() {
        return maHoDan;
    }

    public void setMaHoDan(String maHoDan) {
        this.maHoDan = maHoDan;
    }

    @Override
    public String toString() {
        return "NguoiModel{" + "maNguoi=" + maNguoi + ", hoVaTen=" + hoVaTen + ", tuoi=" + tuoi + ", namSinh=" + namSinh + ", ngheNghiep=" + ngheNghiep + ", maHoDan=" + maHoDan + '}';
    }
    
    
}
