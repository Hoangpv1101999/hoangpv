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
public class updateDetail extends HttpServlet {

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
            out.println("<title>Servlet updateDetail</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateDetail at " + request.getContextPath() + "</h1>");
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
        String id = request.getParameter("stt");
        ExportDAO dao = new ExportDAO();
        ExportDetail eportByid = dao.getEportByid(Integer.parseInt(id));
        request.setAttribute("eportByid", eportByid);
        request.getRequestDispatcher("jsp/updateDetail.jsp").forward(request, response);
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
        int oid = (int) session.getAttribute("ids");
        int stt = Integer.parseInt(request.getParameter("sttt"));
        String type = request.getParameter("type");
        int amount = Integer.parseInt(request.getParameter("amount"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        String allow = request.getParameter("allow");
        String notallow = request.getParameter("notallow");
        String note = request.getParameter("note");
        ExportDAO dao = new ExportDAO();
        dao.updateExDetail(type, allow, notallow, amount, rate, note, oid, stt);
        int total = dao.getTotalPro(oid);
        dao.updaterateDetail(total, oid, stt);
        response.sendRedirect("detail?proid="+oid);
        
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
