/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class loginController extends HttpServlet {

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
        request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
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
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        LoginDAO dao = new LoginDAO();
        Account log = dao.getAccount(account, password);
        if (log!= null) {
            HttpSession session = request.getSession();
            session.setAttribute("log", log);
            Cookie caccount = new Cookie("account", account);
            Cookie cpassword = new Cookie("password", password);
            Cookie cremember = new Cookie("remember", remember);
            if (remember != null) {
                caccount.setMaxAge(60 * 60 * 24);
                cpassword.setMaxAge(60 * 60 * 24);
                cremember.setMaxAge(60 * 60 * 24);
                response.sendRedirect("main");
            } else {
                
                caccount.setMaxAge(0);
                cpassword.setMaxAge(0);
                cremember.setMaxAge(0);
                response.sendRedirect("main");
                
            }
            response.addCookie(caccount);
            response.addCookie(cpassword);
            response.addCookie(cremember);
        } else {
            response.getWriter().println("invalid username or password!");
        }

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
