/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ImportDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class insertImportdetail extends HttpServlet {

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
            out.println("<title>Servlet insertImportdetail</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet insertImportdetail at " + request.getContextPath() + "</h1>");
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

        request.getRequestDispatcher("jsp/insertImportdetail.jsp").forward(request, response);
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
        PrintWriter out = response.getWriter();
//        HttpSession session = request.getSession();
        String orderidS = request.getParameter("orderid");
        if(orderidS.length() == 0 || orderidS.equals("")){
            response.sendRedirect("insertImportdetail");
            return;
        }
        String name = request.getParameter("name");
        if(name.length() == 0 || name.equals("")){
            response.sendRedirect("insertImportdetail");
            return;
        }
        String amount = request.getParameter("amount");
        if(amount.length() == 0 || amount.equals("")){
            response.sendRedirect("insertImportdetail");
            return;
        }
        int amounts = Integer.parseInt(amount);
        String note = request.getParameter("note");
        if(note.length() == 0 || note.equals("")){
            response.sendRedirect("insertImportdetail");
            return;
        }
        String khsx = request.getParameter("khsx");
        if(khsx.length() == 0 || khsx.equals("")){
            response.sendRedirect("insertImportdetail");
            return;
        }
        String dvt = request.getParameter("dvt");
        if(dvt.length() == 0 || dvt.equals("")){
            response.sendRedirect("insertImportdetail");
            return;
        }
        ImportDAO dao = new ImportDAO();
        
        dao.insertImportDetail(Integer.parseInt(orderidS), name, amounts, note, dvt, khsx);
        response.sendRedirect("importDetail?orderid="+orderidS);
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
