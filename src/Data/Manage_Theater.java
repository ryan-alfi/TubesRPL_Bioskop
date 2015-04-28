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
public class Manage_Theater {
    
    public void insert(String no_theater, String idFilm) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("INSERT INTO THEATER (no_theater,id_film) VALUES ('"+no_theater+"','"+idFilm+"')");
    }
    public void delete(String id) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("delete from film where no_theater='"+id+"'");
    }
    public void update(String no_theater, String idFilm) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("update THEATER set no_theater='"+no_theater+"' where id_film='"+idFilm+"';");
    }
}
