/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author avina
 */
@WebServlet(name = "controllerServlet", 
        loadOnStartup =1,
        urlPatterns = {"/category", 
                    "/addToCart", 
                    "/viewCart",
                    "/updateCart",
                    "/checkout",
                    "/purchase",
                    "/Login & SignUp"})
public class controllerServlet extends HttpServlet {

   
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
        String userPath = request.getServletPath();
        
        // if category page is requested
        if(userPath.equals("/category")){
            // TO: Implement category request
        }
        // if cart page is requested
        else if (userPath.equals("/viewCart")){
        userPath = "/cart"; 
        }
        // if checkout page is requested
        else if (userPath.equals("/checkout")){
            // TODO: checkout page requested
        }
        
        // if user choose to Login & SignUp
        else if(userPath.equals("/Login & SignUp")){
            // TODO Implement Login & SignUp request
        }
        
        //  use requestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";
        try{
            request.getRequestDispatcher(url).forward(request, response);
        }catch(IOException | ServletException ex){
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
         String userPath = request.getServletPath();
         
         // if addedToCart action is called
         if (userPath.equals("/addToCart")){
             // TODO: Implement add product to cart action 
         }
         
         // if updateCart action is called 
         else if (userPath.equals("/updateCart")){
            // TODO: Implement updateCart action
            }
         // if purchase action is called 
         else if(userPath.equals("/purchase")){
         // TODO: Implement purchase action
         userPath = "/confirmation";
         }
         
         //  use requestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";
        try{
            request.getRequestDispatcher(url).forward(request, response);
        }catch(IOException | ServletException ex){
        }
    }

}
