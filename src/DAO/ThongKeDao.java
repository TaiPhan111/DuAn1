/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.HoaDon;
import java.util.ArrayList;
import java.util.List;
import entity.JDBCHelper;
import java.sql.SQLException;
import entity.SanPham;
import entity.HoaDon;
import entity.KhachHang;


/**
 *
 * @author ADMIN
 */
public class ThongKeDao {
    
    public List<HoaDon> selectByDate(String date){
     String sql="SELECT * FROM HoaDon WHERE NgayLap LIKE ?";
     return selectBySql(sql,"%"+date+"%");
}
   
 protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            java.sql.ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setMaHD(rs.getString("MaHD"));
                    entity.setNgayLap(rs.getString("NgayLap"));
                    entity.setTotaPrice(rs.getFloat("TotaPrice"));

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
        
    
