/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.dao.CourseDao;
import com.itn.model.CourseModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "CourseControl", urlPatterns = {"/CourseControl"})
public class CourseControl extends HttpServlet {

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
        ArrayList<CourseModel> al = CourseDao.select();
        request.setAttribute("coursedata",al);
        RequestDispatcher rd = request.getRequestDispatcher("Displaycourse.jsp");
        rd.forward(request,response);
        
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
        
       

        if("delete".equals(request.getParameter("action")))
        {
            int cid = Integer.parseInt(request.getParameter("cid"));
            CourseDao.delete(cid);
             processRequest(request,response);
        }
        else if("edit".equals(request.getParameter("action")))
                {
                    int cid = Integer.parseInt(request.getParameter("cid"));
                    ArrayList<CourseModel> al = CourseDao.select_by_cid(cid);
                    request.setAttribute("coursedata",al);
                    RequestDispatcher rd = request.getRequestDispatcher("EditCourse.jsp");
                    rd.forward(request,response);

                }
        else
        {
           processRequest(request,response);
        }
                

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
        if(request.getParameter("insert")!=null){
        String title=request.getParameter("title");
        int price = Integer.parseInt(request.getParameter("price"));
        String duration=request.getParameter("duration");
        System.out.println(title);
        
        CourseModel cm = new CourseModel(0,title,price,duration);
        
        CourseDao cdao=new CourseDao();
        cdao.insert(cm);
        processRequest(request, response);
        }
        
        else{
            int cid = Integer.parseInt(request.getParameter("cid"));
            String title=request.getParameter("title");
            int price = Integer.parseInt(request.getParameter("price"));
            String duration=request.getParameter("duration");
            CourseModel cm = new CourseModel(cid,title,price,duration);
            
            CourseDao cdao = new CourseDao();
            cdao.edit(cm);
            processRequest(request, response);
            
        }
              
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
