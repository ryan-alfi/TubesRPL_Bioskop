/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ari Fajrianda Alfi
 */
public class koneksiDB {
    private Statement st=null;
    private Connection con=null;
    private ResultSet rs=null;

    public koneksiDB() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            //System.out.println("sukses");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            con = DriverManager.getConnection("JDBC:mysql://localhost/tubes_bioskop","root","");
            st = con.createStatement();
            //System.out.println("sukses");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public ResultSet getData(String query) throws SQLException{
        ResultSet rs=null;
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    public void setData(String query) throws SQLException{
        try {
            st.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{ 
        if(con!=null)
        con.close();
        }
    }
    public void query(String SQLString) throws SQLException{
        try{
            st.executeUpdate(SQLString);
        }catch(Exception e){
            System.out.println("Error.5");
        }finally{ 
        if(con!=null)
        con.close();
        }
    }
}
