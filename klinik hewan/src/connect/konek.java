/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class konek {
    Connection connect = null;
public static Connection koneksi(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/klinik_hewan","root","");
        return koneksi;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}   
}
