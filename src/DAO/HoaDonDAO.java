/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.HoaDon;
import entity.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class HoaDonDAO {

    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon(MaHD, MaKH, MaSP, TenSP, NgayLap, TotaPrice, Loai) VALUES(?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                model.getMaHD(),
                model.getMaKH(),
                model.getMaSP(),
                model.getTenSP(),
                model.getNgayLap(),
                model.getTotaPrice(),
                model.getLoai());
        

    }

    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET MaKH=?, MaSP=?,TenSP=? , NgayLap=?, TotaPrice=? , Loai=? WHERE MaHD=?";
        JDBCHelper.executeUpdate(sql,
                model.getMaKH(),
                model.getMaSP(),
                model.getTenSP(),
                model.getNgayLap(),
                model.getTotaPrice(),
                model.getLoai(),
                model.getMaHD());
    }

    public void delete(String MaHD) {
        String sql = "DELETE FROM HoaDon WHERE MaHD=?";
        JDBCHelper.executeUpdate(sql, MaHD);
    }

    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return selectBySql(sql);
    }

    public HoaDon selectById(String mahd) {
        String sql = "SELECT * FROM HoaDon WHERE MaHD=?";
        List<HoaDon> list = selectBySql(sql, mahd);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setMaHD(rs.getString("MaHD"));
                    entity.setMaKH(rs.getString("MaKH"));
                    entity.setMaSP(rs.getInt("MaSP"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setNgayLap(rs.getString("NgayLap"));
                    entity.setTotaPrice(rs.getFloat("TotaPrice"));
                    entity.setLoai(rs.getString("Loai"));

                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    
}
