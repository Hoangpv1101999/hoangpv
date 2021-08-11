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
import model.Export;
import model.ExportDetail;
import model.Import;
import model.ImportDetail;
import model.Product;
import model.ProductPayment;

/**
 *
 * @author ADMIN
 */
public class ProductDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

//    public ArrayList<Product> getAll() {
//        ArrayList<Product> products = new ArrayList<>();
//        String sql = "select *  from Product";
//
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
//                products.add(p);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return products;
//
//    }
    public void insertproduct(int productid, String name, int amount, String img) {

        String sql = "INSERT INTO [dbo].[Product]\n"
                + "           ([ProductId]\n"
                + "           ,[ProductName]\n"
                + "           ,[Amount]\n"
                + "           ,[Img])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, productid);
            ps.setString(2, name);
            ps.setInt(3, amount);
            ps.setString(4, img);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ImportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Product> getPageSize(int pageindex, int pagesize) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select proid, proName , img  from \n"
                + "            (select ROW_NUMBER() over(order by proid ASC) as rid , * from productss)\n"
                + "              tbl where rid >= (? -1) * ? +1\n"
                + "             and rid <= ? *?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pageindex);
            ps.setInt(2, pagesize);
            ps.setInt(3, pagesize);
            ps.setInt(4, pageindex);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setImg(rs.getString(3));
                list.add(p);

            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public int count() {
        String sql = "select count(*) as total from productss";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public Import getPaymentOrder(int id) {
        Import i = null;
        String sql = "select * from Import_invoice where OrderId = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                i = new Import(rs.getInt(1), rs.getFloat(2), rs.getDate(3), rs.getInt(4));
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

//    public Export getPaymentProduct(int id) {
//        Export e = null;
//        String sql = "select * from Export_invoice\n"
//                + "where ProductId = ?";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                e = new Export(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
//
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return e;
//    }
    public ProductPayment getPayment(int id) {
        ProductPayment p = null;
        String sql = "select * from ProductPayment\n"
                + "where productid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                p = new ProductPayment(rs.getInt(1), rs.getFloat(2));
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

//    public ArrayList<Product> getproductForPayment() {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "select * from Product ";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
//                list.add(p);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//
//    }
    public int getProductid() {
        String sql = "select ProductId from Product";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("ProductId");
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

//    public ImportDetail getAmountOrder(int pid) {
//        ImportDetail list = null;
//        String sql = "select * from Import_invoice_Detail\n"
//                + "where productID = ?";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, pid);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                list = new ImportDetail(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
//                        rs.getString(5));
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//    public Product getAmountProduct(int pid) {
//        Product products = null;
//        String sql = "	select * from Product\n"
//                + "	where productID = ?";
//
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, pid);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                products = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return products;
//
//    }
    public void insertPaymentTT(int id, float pay) {
        String sql = "INSERT INTO [dbo].[ProductPayment]\n"
                + "           ([productid]\n"
                + "           ,[productPayment])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?)";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setFloat(2, pay);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Product> getProduct() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from productss";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insertProductEx(int id, String name, int amount1, int amount2, String img, String producer, String supplier,
            int oid) {
        String sql = "INSERT INTO [dbo].[productss]\n"
                + "           ([proid]\n"
                + "           ,[proName]\n"
                + "           ,[AmountOfBunch]\n"
                + "           ,[AmountProductInPunch]\n"
                + "           ,[img]\n"
                + "           ,[producer]\n"
                + "           ,[supplier]\n"
                + "           ,[orderid])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, amount1);
            ps.setInt(4, amount2);
            ps.setString(5, img);
            ps.setString(6, producer);
            ps.setString(7, supplier);
            ps.setInt(8, oid);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTotal(int pid) {
        String sql = "update productss set total = (AmountOfBunch * AmountProductInPunch) where proid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pid);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

    }

}
