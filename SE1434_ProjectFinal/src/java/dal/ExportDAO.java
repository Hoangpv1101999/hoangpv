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
import model.Export;
import model.ExportDetail;
import model.Import;

/**
 *
 * @author ADMIN
 */
public class ExportDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int count() {
        String sql = "select count(*) as total from Export_invoice";

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

    public void insertTypeOfError(int id, String type, int amount, float rate, boolean allow, boolean notallow) {
        String sql = "INSERT INTO [dbo].[Export_invoice_Detail]\n"
                + "           ([ProductID]\n"
                + "           ,[TypeOfErrors]\n"
                + "           ,[AmountOfErrors]\n"
                + "           ,[RateOfErrors]\n"
                + "           ,[ErrorsAllow]\n"
                + "           ,[ErrorsNotAllow])\n"
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
            ps.setInt(1, id);
            ps.setString(2, type);
            ps.setInt(3, amount);
            ps.setFloat(4, rate);
            ps.setBoolean(5, allow);
            ps.setBoolean(6, notallow);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateExportDetail(int amount, float rate, boolean allow,
            boolean notallow, String type, int productid) {
        String sql = "UPDATE [dbo].[Export_invoice_Detail]\n"
                + "   SET \n"
                + "      \n"
                + "      [AmountOfErrors] = ?\n"
                + "      ,[RateOfErrors] = ?\n"
                + "      ,[ErrorsAllow] = ?\n"
                + "      ,[ErrorsNotAllow] = ?\n"
                + " WHERE TypeOfErrors = ? and ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, amount);
            ps.setFloat(2, rate);
            ps.setBoolean(3, allow);
            ps.setBoolean(4, notallow);
            ps.setString(5, type);
            ps.setInt(6, productid);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteExportDetail(String type) {
        String sql = "DELETE FROM [dbo].[Export_invoice_Detail]\n"
                + "      WHERE TypeOfErrors = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, type);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertExport(int proid, int lowq, int quali, float payment) {
        String sql = "INSERT INTO [dbo].[Export_invoice]\n"
                + "           ([ProductId]\n"
                + "           ,[LowQuality]\n"
                + "           ,[Qualified]\n"
                + "           ,[Payment])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, proid);
            ps.setInt(2, lowq);
            ps.setInt(3, quali);
            ps.setFloat(4, payment);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertManyExportDetail(int id, String type, int amount, float rate, boolean allow, boolean notallow) {
        String sql = "INSERT INTO [dbo].[Export_invoice_Detail]\n"
                + "           ([ProductID]\n"
                + "           ,[TypeOfErrors]\n"
                + "           ,[AmountOfErrors]\n"
                + "           ,[RateOfErrors]\n"
                + "           ,[ErrorsAllow]\n"
                + "           ,[ErrorsNotAllow])\n"
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
            ps.setInt(1, id);
            ps.setString(2, type);
            ps.setInt(3, amount);
            ps.setFloat(4, rate);
            ps.setBoolean(5, allow);
            ps.setBoolean(6, notallow);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateExportInvoice(int low, int quali, float payment, int id) {
        String sql = "UPDATE [dbo].[Export_invoice]\n"
                + "   SET [LowQuality] = ?\n"
                + "      ,[Qualified] = ?\n"
                + "      ,[Payment] = ?\n"
                + " WHERE [ProductId] = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, low);
            ps.setInt(2, quali);
            ps.setFloat(3, payment);
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteAllExportDetail(int id) {
        String sql = "DELETE FROM [dbo].[Export_invoice_Detail]\n"
                + "      WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteExport(int id) {
        String sql = "DELETE FROM [dbo].[Export_invoice]\n"
                + "      WHERE ProductId = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Export> getExport(int id) {
        ArrayList<Export> list = new ArrayList<>();
        String sql = "select * from Export_invoice\n"
                + "where orderid = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Export e = new Export(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
                        rs.getDate(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getFloat(9),
                        rs.getInt(10), rs.getFloat(11), rs.getFloat(12));
                list.add(e);
            }
        } catch (Exception ex) {
        }
        return list;
    }

    public void updateRateAll(int id) {
        String sql = "update Export_invoice \n"
                + "             set rateall = cast((proFinish)/cast(total as numeric(13,1)) * 100.0 as numeric(4,1)) \n"
                + "                 where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateProFinish(int id) {
        String sql = "update Export_invoice \n"
                + "set proFinish = (total -(lowquality + qualified))\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateRateLow(int id) {
        String sql = "update Export_invoice \n"
                + "set rateLow =cast((lowquality /cast(total as  numeric(13,1)) )*100.0  as numeric(4,1))\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateRateQualified(int id) {
        String sql = "update Export_invoice \n"
                + "set ratequalified =cast( (qualified /cast(total as numeric(13,1)) )*100.0 as numeric(4,1) )\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertExport(int stt, int prod, int low, int quali, Date date, String note,
            int oid, int total) {
        String sql = "INSERT INTO [dbo].[Export_invoice]\n"
                + "           ([stt]\n"
                + "           ,[proid]\n"
                + "           ,[lowquality]\n"
                + "           ,[qualified]\n"
                + "           ,[date]\n"
                + "           ,[note]\n"
                + "           ,[orderid]\n"
                + "           ,[total])\n"
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
            ps.setInt(1, stt);
            ps.setInt(2, prod);
            ps.setInt(3, low);
            ps.setInt(4, quali);
            ps.setDate(5, date);
            ps.setString(6, note);
            ps.setInt(7, oid);
            ps.setInt(8, total);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteProduct(int id) {
        String sql = "DELETE FROM [dbo].[productss]\n"
                + "      WHERE proid =?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteExportPro(int id) {
        String sql = "DELETE FROM [dbo].[Export_invoice]\n"
                + "      WHERE stt = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int totalFinish(int oid) {
        String sql = "select sum(proFinish) as finish from Export_invoice\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oid);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int totalLow(int oid) {
        String sql = "select sum(lowquality) as finish from Export_invoice\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oid);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int totalQuali(int oid) {
        String sql = "select sum(qualified) as finish from Export_invoice\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oid);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<ExportDetail> getExDetail(int id) {
        ArrayList<ExportDetail> list = new ArrayList<>();
        String sql = "select * from Export_Detail\n"
                + "where proid = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ExportDetail e = new ExportDetail(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getFloat(6), rs.getString(7), rs.getInt(8));
                list.add(e);
            }
        } catch (Exception ex) {
        }
        return list;

    }

    public void updateExDetail(String type, String allow, String notAllow, int amount, float rate,
            String note, int pid, int stt) {
        String sql = "UPDATE [dbo].[Export_Detail]\n"
                + "   SET \n"
                + "      [TypeError] = ?\n"
                + "      ,[Allow] = ?\n"
                + "      ,[notAllow] = ?\n"
                + "      ,[amount] = ?\n"
                + "      ,[rate] = ?\n"
                + "      ,[note] = ?\n"
                + "      ,[proid] = ?\n"
                + " WHERE [stt] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, type);
            ps.setString(2, allow);
            ps.setString(3, notAllow);
            ps.setInt(4, amount);
            ps.setFloat(5, rate);
            ps.setString(6, note);
            ps.setInt(7, pid);
            ps.setInt(8, stt);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ExportDetail getEportByid(int stt) {
        ExportDetail e = null;
        String sql = "select * from Export_Detail \n"
                + "where stt = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, stt);
            rs = ps.executeQuery();
            while (rs.next()) {
                e = new ExportDetail(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getFloat(6), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public int getTotalPro(int oid) {
        String sql = "select total from Export_invoice\n"
                + "where proid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oid);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void updaterateDetail(int total, int proid, int stt) {
        String sql = "update Export_Detail\n"
                + "set rate = cast( (amount /cast(? as numeric(13,1)) )*100.0 as numeric(4,1) )\n"
                + "where proid = ? and stt = ?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, total);
            ps.setInt(2, proid);
            ps.setInt(3, stt);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertDetail( String type, String allow, String notallow, int amount, float rate,
            String note, int pid) {
        String sql = "INSERT INTO [dbo].[Export_Detail]\n"
                + "           ([TypeError]\n"
                + "           ,[Allow]\n"
                + "           ,[notAllow]\n"
                + "           ,[amount]\n"
                + "           ,[rate]\n"
                + "           ,[note]\n"
                + "           ,[proid])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, type);
            ps.setString(2, allow);
            ps.setString(3, notallow);
            ps.setInt(4, amount);
            ps.setFloat(5, rate);
            ps.setString(6, note);
            ps.setInt(7, pid);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ExportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        ExportDAO dao = new ExportDAO();
        dao.insertDetail("hi", "s", "gfsd", 0, 0, "", 2);
    }

}
