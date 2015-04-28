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
public class Manage_Film {
    
    public void insert(String idfilm, String judul, int harga) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("INSERT INTO FILM (id_film,judul,harga) VALUES ('"+idfilm+"','"+judul+"','"+harga+"')");
    }
    public void delete(String id) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("delete from film where judul='"+id+"'");
    }
    public void update(String idfilm, String judul, int harga) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("update film set judul='"+judul+"',harga="+harga+" where id_film='"+idfilm+"';");
    }
}
