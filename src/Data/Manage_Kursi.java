/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import bioskop.koneksiDB;
import java.sql.SQLException;

/**
 *
 * @author Ari Fajrianda Alfi
 */
public class Manage_Kursi {
    
    public void insert(String kursi, String status, String idTheater) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("INSERT INTO KURSI (no_kursi,status,id_theater) VALUES ('"+kursi+"','"+status+"','"+idTheater+"')");
    }
    public void delete(String id) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("delete from Kursi where no_kursi='"+id+"'");
    }
    public void update(String kursi, String status, String idTheater) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("update KURSI set no_kursi='"+kursi+"',status="+status+" where id_theater='"+idTheater+"';");
    }
}
