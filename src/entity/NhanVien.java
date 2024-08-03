/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int MaNV;
    private String TenNV;
    private String MatKhau;
    private boolean vaiTro=false;

    public NhanVien() {
    }

    public NhanVien(int MaNV, String TenNV, String MatKhau) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.MatKhau = MatKhau;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean isVaitro() {
        return vaiTro;
    }

    public void setVaitro(boolean vaitro) {
        this.vaiTro = vaitro;
    }

    
    
    
}
