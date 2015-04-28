/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import bioskop.koneksiDB;
import java.sql.SQLException;

/**
 *
 * @author Ari Fajrianda Alfi
 */
public class Manage_Jadwal {
    public void insert(String idfilm, String tgl,String bln, String thn, String jam, String menit) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("INSERT INTO JADWAL (tanggal,waktu,id_film) VALUES ('"+thn+"-"+bln+"-"+tgl+"','"+jam+":"+menit+"','"+idfilm+"')");
    }
    public void delete(String id) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("delete from jadwal where tanggal='"+id+"'");
    }
    public void update(String idfilm, String tgl,String bln, String thn, String jam, String menit) throws SQLException{
        koneksiDB db = new koneksiDB();
        db.setData("update jadwal set tanggal='"+thn+"-"+bln+"-"+tgl+"',waktu='"+jam+":"+menit+":00' where id_film='"+idfilm+"';");
    }
}
