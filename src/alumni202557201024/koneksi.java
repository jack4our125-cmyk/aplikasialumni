/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumni202557201024;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hype G12
 */
public class koneksi {
    //mendeklarasikan variabel koneksi sebagai static agar bia diakses dari mana saja di dalm class
    private static Connection mysqlconfig;
    //method static untuk membuka koneksi ke database mysql
    public static Connection konek(){
        
        try {
            String url = "jdbc:mysql://localhost:3306/alumni_202557201024";
            
            String user = "root";
            
            String pass = "";
            
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException sQLException) {
            
            System.err.println(sQLException.getMessage());
        }
 
        return mysqlconfig;
    }
    
}
