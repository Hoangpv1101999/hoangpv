/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ExportDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class insertExportDetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insertExportDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet insertExportDetailController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("jsp/insertExportDetail.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String productid =  request.getParameter("productid");
        String stt = request.getParameter("stt");
        String productid = request.getParameter("productid");
        String low = request.getParameter("low");
        String qualified = request.getParameter("qualified");
        String date = request.getParameter("date");
        String note = request.getParameter("note");
        String orderid = request.getParameter("orderid");
        String total = request.getParameter("total");

        ExportDAO dao = new ExportDAO();
        dao.insertExport(Integer.parseInt(stt), Integer.parseInt(productid), Integer.parseInt(low),
                Integer.parseInt(qualified), Date.valueOf(date), note, Integer.parseInt(orderid), Integer.parseInt(total));
        
        dao.updateProFinish(Integer.parseInt(orderid));
        dao.updateRateLow(Integer.parseInt(orderid));
        dao.updateRateQualified(Integer.parseInt(orderid));
        dao.updateRateAll(Integer.parseInt(orderid));
        dao.insertDetail( "loi con trung", "0.5", "0.5", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "ban", "0.5", "0.5", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "khong may quai", "0.05", "0.1", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "sut vien > 2.5cm", "1.5", "2.5", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "loi quai", "1.0", "2.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "may vo mat manh", "2.0", "4.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "may cao xuoc mang, rach manh , rach goc", "2.0", "4.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "ban  nhe", "1.0", "1.5", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "gap mieng sai 4mm", "2.0", "5.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "chap day sai", "2.0", "5.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "loi vien khong dat(khong bao gom loi sut vien)", "1.0", "2.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "may truot my quai", "1.5", "3.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "lech quai , van quai", "2.0", "3.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "may quai khong bang dau 10mm", "3.0", "5.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "dut chi quai", "1.0", "3.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "hang cat chi khong dat", "3.0", "6.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "gap lech tu 1-1.5cm", "2.0", "4.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "gap lech > 1.5cm", "1.0", "2.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "hang nhan , nhau", "2.0", "4.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "sui chi mieng , dut chi mieng", "1.0", "3.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "may sai buoc chi 2mm", "5.0", "10.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "lech hong va than > 4mm", "5.0", "10.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "vien van than", "1.0", "2.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "thieu tem  , sai tem , the bai", "0.5", "1.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "thieu so luong trong bo", "0.5", "1.0", 0, 0, "", Integer.parseInt(productid));
        dao.insertDetail( "thua so luong trong bo", "0.5", "1.0", 0, 0, "", Integer.parseInt(productid));
        response.sendRedirect("exportDetail?productid="+ orderid);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
