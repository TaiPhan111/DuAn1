/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class DateHalper {
    static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("MM/dd/yyyy");
     public static Date toDate(String date, String...pattern) {
     try {
     if(pattern.length > 0){
     DATE_FORMATER.applyPattern(pattern[0]);
     }
     if(date == null){
     return DateHalper.now();
     }
     return DATE_FORMATER.parse(date);
     }
     catch (ParseException ex) {
     
     }
         return null;
 }
     
     /*
     * Chuyển đổi từ Date sang String
     * @param date là Date cần chuyển đổi
     * @param pattern là định dạng thời gian
     * @return String kết quả
     */
     public static String toString(Date date, String...pattern) {
         if(pattern.length > 0){ 
             DATE_FORMATER.applyPattern(pattern[0]); 
         }
         if(date == null){
             date = DateHalper.now();
         }
         return DATE_FORMATER.format(date);
     }
 
    /*Lấy thời gian hiện tại
     * @return Date kết quả 
  */     public static Date now() { 
        return new Date();
  }
    /* Bổ sung số ngày vào thời gian
 * @param date thời gian hiện có
* @param days số ngày cần bổ sung váo date
* @return Date kết quả 
*/    
public static Date addDays(Date date, int days) {
date.setTime(date.getTime() + days*24*60*60*1000);
return date;
}     /* Bổ sung số ngày vào thời gian hiện hành
* @param days số ngày cần bổ sung vào thời gian hiện tại
* @return Date kết quả
*/     public static Date add(int days) { 
Date now = DateHalper.now();
now.setTime(now.getTime() + days*24*60*60*1000); 
return now;   
}
}

