/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Feature;
import model.Group;

/**
 *
 * @author ADMIN
 */
public class LoginDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account getAccount(String username, String password) {
        String sql = "select a.Username, a.[Password],g.gid,g.gname,f.fname,f.fid from Account a  \n"
                + "                 left join Group_Account ga on a.Accid = ga.accid\n"
                + "              left join [Group] g on ga.gid = g.gid\n"
                + "               left join Group_Feature gf  on g.gid = gf.gid \n"
                + "               left join Feature f on gf.fid = f.fid\n"
                + "              where a.Username =? and a.[Password] =?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            Account account = null;
            Group current = new Group();
            rs = ps.executeQuery();
            while (rs.next()) {
                if (account == null) {
                    account = new Account();
                    account.setUsername(username);
                    account.setPassword(password);
                }

                int gid = rs.getInt("gid");
                if (current.getGid()!= gid) {
                    current = new Group();
                    current.setGid(gid);
                    current.setGname(rs.getString("gname"));
                    account.getGroups().add(current);
                }

                Feature f = new Feature();
                f.setId(rs.getInt("fid"));
                f.setUrl(rs.getString("fname"));
                current.getFeatures().add(f);

            }
            return account;
        } catch (Exception ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public static void main(String[] args) {
        LoginDAO dao = new LoginDAO();
        Account account = dao.getAccount("supplier", "1");
        System.out.println(account);
    }
}
