/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.JDBCHelper;
import entity.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class SanPhamDao {

  

    /**
     *
     */
   

    public void insert(SanPham model){
        String sql="INSERT INTO SanPham(MaSP , TenSP, Gia, SoLuong, MoTa) VALUES(?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql, 
                model.getMaSP(), 
                model.getTenSP(),
                model.getGia(),
                model.getSoLuong(),
                model.getMoTa());
    }
    
    public void update(SanPham model){
        String sql="UPDATE SanPham SET TenSP=?, Gia=?, SpLuong=?,  MoTa=? WHERE MaSP=?";
        JDBCHelper.executeUpdate(sql, 
               model.getMaSP(), 
                model.getTenSP(),
                model.getGia(),
                model.getSoLuong(),
                model.getMoTa());
    }
    
    public void delete(Integer MaSP){
        String sql="DELETE FROM SanPham WHERE MaSP=?";
        JDBCHelper.executeUpdate(sql, MaSP);
    }
    
//    public void select(SanPham model){
//        String sql="Select * from SanPham";
//        JDBCHelper.executeQuery(sql, 
//                model.getMaSP(), 
//                model.getTenSP(),
//                model.getGia(),
//                model.getSoLuong(),
//                model.getMoTa());
//    }
    
    public  List<SanPham> selectAll(){
        String sql="SELECT * FROM SanPham";
        return selectBySql(sql);
    }
    
    public SanPham selectById(Integer MaSP){
        String sql="SELECT * FROM SanPham WHERE MaSP=?";
        List<SanPham> list = selectBySql(sql, MaSP);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<SanPham> selectBySql(String sql, Object...args){
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while(rs.next()){
                    SanPham entity=new SanPham();
                    entity.setMaSP(rs.getInt("MaSP"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setGia(rs.getFloat("Gia"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setMoTa(rs.getString("MoTa"));
                   
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
   

}
