/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CC;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Rafsan
 */
public class CC extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("fcountry");
        String password = request.getParameter("tcountry");
           
 double US_Dollar=1.244;
double Euro=1.12;
double Indian_Rupee=85.82;
 double bdt=105;
 double cad=1.64;
        PrintWriter writer = response.getWriter();
         
        // build HTML code
          
             double changep = 0;
         double amount=Double.parseDouble(request.getParameter("c2"));
        switch(username){
              case "usd" : changep=amount / US_Dollar;break;
          }
          double result=0.0;
     switch(password){
         case"inr": result=changep * Indian_Rupee;break;   
         case "bdt":result=changep * bdt;break;        
         case "cad":result=changep * cad;break;  
     }
              
              
               
                //cu2=Integer.parseInt(request.getParameter("c2"));
               
        String htmlRespone = "<html>";
        htmlRespone += "</h2>"+"<h2>Your converted currency is: " + result + "<br/>";    
        htmlRespone += "</html>";
        
         
        // return response
        writer.println(htmlRespone);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
