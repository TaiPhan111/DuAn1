/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    String MaHD;
    String MaKH;
    int MaSP;
    String TenSP;
    String Loai;
    float TotaPrice;
    String NgayLap;
    int so_luot_mua;
    public HoaDon() {
    }

    public int getSo_luot_mua() {
        return so_luot_mua;
    }

    public void setSo_luot_mua(int so_luot_mua) {
        this.so_luot_mua = so_luot_mua;
    }

    public HoaDon(String MaHD, String MaKH, int MaSP, String TenSP, String Loai, float TotaPrice, String NgayLap) {
        this.MaHD = MaHD;
        this.MaKH = MaKH;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Loai = Loai;
        this.TotaPrice = TotaPrice;
        this.NgayLap = NgayLap;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public float getTotaPrice() {
        return TotaPrice;
    }

    public void setTotaPrice(float TotaPrice) {
        this.TotaPrice = TotaPrice;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }
    
}