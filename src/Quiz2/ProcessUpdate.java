/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import Quiz2.Koneksi;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Azis Nurjaman
 */
public class ProcessUpdate {
    public void update(String id, String fname, String lname, String age) {

        try {

            Connection con = (Connection) Koneksi.konek();
            Statement st = con.createStatement();

            String sql_fname = "update info set fname='" + fname + "'where id='" + id + "'";
            String sql_lname = "update info set lname='" + lname + "'where id='" + id + "'";
            String sql_age = "update info set age='" + age + "'where id='" + id + "'";

            st.executeUpdate(sql_fname);
            st.executeUpdate(sql_lname);
            st.executeUpdate(sql_age);
            st.close();

             JOptionPane.showMessageDialog(null, "Data has been updated");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
