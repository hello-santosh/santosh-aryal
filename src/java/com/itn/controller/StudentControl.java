/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;


import com.itn.dao.CourseDao;
import com.itn.dao.StudentDao;
import com.itn.model.CourseModel;
import com.itn.model.StudentModel;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class StudentControl extends HttpServlet {

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
        ArrayList<StudentModel> al = StudentDao.select();
        request.setAttribute("studentdata",al);
        RequestDispatcher rd = request.getRequestDispatcher("DisplayStudent.jsp");
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
            int sid = Integer.parseInt(request.getParameter("sid"));
            StudentDao.delete(sid);
             processRequest(request,response);
        }
        else if("edit".equals(request.getParameter("action")))
                {
                    int sid = Integer.parseInt(request.getParameter("sid"));
                    ArrayList<StudentModel> al = StudentDao.select_by_sid(sid);
                    request.setAttribute("studentdata",al);
                    RequestDispatcher rd = request.getRequestDispatcher("EditStudent.jsp");
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
        String firstname=request.getParameter("firstname");
        String middlename=request.getParameter("middlename");
        String lastname=request.getParameter("lastname");
        String gender=request.getParameter("gender");
        String city=request.getParameter("city");
        String address=request.getParameter("address");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String level=request.getParameter("level");
        String area=request.getParameter("area");
        System.out.println(firstname);
        
        StudentModel sm = new StudentModel(0,firstname,middlename,lastname,gender,city,address,phone,email,level,area);
        StudentDao sdao=new StudentDao();
        sdao.insert(sm);
         processRequest(request, response);
       }
       else{
        int sid = Integer.parseInt(request.getParameter("sid"));  
        String firstname=request.getParameter("firstname");
        String middlename=request.getParameter("middlename");
        String lastname=request.getParameter("lastname");
        String gender=request.getParameter("gender");
        String city=request.getParameter("city");
        String address=request.getParameter("address");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String level=request.getParameter("level");
        String area=request.getParameter("area");
        System.out.println(firstname);
        
        StudentModel sm = new StudentModel(sid,firstname,middlename,lastname,gender,city,address,phone,email,level,area);
        StudentDao sdao=new StudentDao();
        sdao.edit(sm);
         processRequest(request, response);
           
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
