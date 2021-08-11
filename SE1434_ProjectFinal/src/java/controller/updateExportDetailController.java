/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ExportDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ExportDetail;

/**
 *
 * @author ADMIN
 */
public class updateExportDetailController extends HttpServlet {

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
            out.println("<title>Servlet updateExportDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateExportDetailController at " + request.getContextPath() + "</h1>");
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
//        HttpSession session = request.getSession();
//        String id = (String) session.getAttribute("idss");
//        String type = request.getParameter("type");
//        ExportDAO dao = new ExportDAO();
//        ExportDetail exportDetailByIdNames = dao.getExportDetailByIdName(Integer.parseInt(id), type);
//        request.setAttribute("exportDetailByIdNames", exportDetailByIdNames);
//        request.setAttribute("typeS", type);
//        request.getRequestDispatcher("jsp/updateExportDetail.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        
        String productid = (String) session.getAttribute("idss");
        String type = request.getParameter("type");
        String amount = request.getParameter("amount");
        String rate = request.getParameter("rate");
        boolean allow = request.getParameter("allow").equals("yes");
        boolean notaloow = request.getParameter("notallow").equals("noyes");
        ExportDAO dao = new ExportDAO();
        dao.updateExportDetail(Integer.parseInt(amount), Float.parseFloat(rate), allow, notaloow,
                type, Integer.parseInt(productid));
        response.sendRedirect("exportDetail?productid=" +productid);

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
