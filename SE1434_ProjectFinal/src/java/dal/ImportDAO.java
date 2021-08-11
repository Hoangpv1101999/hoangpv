/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Import;
import model.ImportDetail;
import model.Product;

/**
 *
 * @author ADMIN
 */
public class ImportDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Import> getOrderid() {
        ArrayList<Import> imports = new ArrayList<>();
        String sql = "select * from Import_invoice";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Import i = new Import(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getInt(4));
                imports.add(i);
            }
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imports;

    }

    public ArrayList<Import> getImportForId(int pageindex, int pagesize) {
        ArrayList<Import> imports = new ArrayList<>();

        String sql = "select orderid, Payment, [Date] from\n"
                + "(select ROW_NUMBER() over(order by orderid ASC) as rid , * from Import_invoice)\n"
                + "tbl \n"
                + "where rid >=(? -1) * ? +1 \n"
                + "and rid <= ? * ? ";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pageindex);
            ps.setInt(2, pagesize);
            ps.setInt(3, pagesize);
            ps.setInt(4, pageindex);
            rs = ps.executeQuery();
            while (rs.next()) {
                Import i = new Import();
                i.setOrderid(rs.getInt("orderid"));
                i.setPayment(rs.getFloat("Payment"));
                i.setDate(rs.getDate("Date"));
                imports.add(i);
            }
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imports;
    }

    public int count() {
        String sql = "select count(*) as total from Import_invoice";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public ArrayList<ImportDetail> getImportDetail(int id) {
        ArrayList<ImportDetail> importdetails = new ArrayList<>();

        String sql = "select * from Import_invoice_Detail\n"
                + "where orderID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ImportDetail i = new ImportDetail(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getString(6));
                importdetails.add(i);
            }
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return importdetails;
    }

    public void insertInport(int orderid, int payment, Date date, int gid) {

        String sql = "INSERT INTO [dbo].[Import_invoice]\n"
                + "           ([OrderId]\n"
                + "           ,[Payment]\n"
                + "           ,[Date]\n"
                + "           ,[gid])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderid);
            ps.setInt(2, payment);
            ps.setDate(3, date);
            ps.setInt(4, gid);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertInportDetail(int orderid, int productid, String name, int amount, String note) {

        String sql = "INSERT INTO [dbo].[Import_invoice_Detail]\n"
                + "           ([orderID]\n"
                + "           ,[productID]\n"
                + "           ,[orderName]\n"
                + "           ,[Amount]\n"
                + "           ,[Note])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderid);
            ps.setInt(2, productid);
            ps.setString(3, name);
            ps.setInt(4, amount);
            ps.setString(5, note);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deteteInportDetail(int orderid) {
        String sql1 = "DELETE FROM [dbo].[Import_invoice_Detail]\n"
                + "      WHERE orderID  = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql1);
            ps.setInt(1, orderid);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deteteProduct(int productid) {

        String sql2 = "DELETE FROM [dbo].[Product]\n"
                + "      WHERE ProductId = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql2);
            ps.setInt(1, productid);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deteteInport(int orderid) {

        String sql3 = "DELETE FROM [dbo].[Import_invoice]\n"
                + "      WHERE OrderId = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql3);
            ps.setInt(1, orderid);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertImportDetail(int oid, String name, int amount, String note , String khsx , 
            String dvt) {
        String sql = "INSERT INTO [dbo].[Import_invoice_Detail]\n"
                + "           ([orderID]\n"
                + "           ,[orderName]\n"
                + "           ,[Amount]\n"
                + "           ,[Note]\n"
                + "           ,[KHSX]\n"
                + "           ,[DVT])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oid);
            ps.setString(2, name);
            ps.setInt(3,amount);
            ps.setString(4, note);
            ps.setString(5, khsx);
            ps.setString(6, dvt);
            ps.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public ImportDetail insertImportDetail() {
//        ImportDetail i = null;
//        String sql = "select * from Import_invoice_Detail";
//        
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            
//            rs  = ps.executeQuery();
//            while(rs.next()){
//                  i = new ImportDetail(rs.getInt(sql), sql, 0, sql, sql, sql)
//            }
//            
//        } catch (Exception ex) {
//            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    

    public static void main(String[] args) {
        ImportDAO dao = new ImportDAO();
        dao.insertImportDetail(1, "ds", 123, "fdsaf", "fdsa", "fsaf");
    }

}
