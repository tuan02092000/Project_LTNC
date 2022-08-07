package com.mycompany.filnalexam_20182866_nguyenvantuan.model;

/**
 *
 * @author Nguyen Van Tuan
 */
public class UserModel {
    String tenTaiKhoan;
    String matKhau;
    int vaiTro;
    
    public UserModel(){};

    public UserModel(String tenTaiKhoan, String matKhau, int vaiTro)
    {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    };

    public String getTenTaiKhoan() 
    {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) 
    {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    
    

    public String getMatKhau() 
    {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) 
    {
        this.matKhau = matKhau;
    }

    public int getVaiTro() 
    {
        return this.vaiTro;
    }

    public void setVaiTro(int vaiTro) 
    {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "UserModel{" + "tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + '}';
    }
    
    
}
