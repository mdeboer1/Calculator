/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import calculatorlabmodel.CalculateArea;

/**
 *
 * @author mdeboer1
 */
@WebServlet(name = "AreaController3", urlPatterns = {"/area3"})
public class AreaController3 extends HttpServlet {
    private static final String RESULT_PAGE = "/lab3/form.jsp";
    private static final String RECT_CALC = "rectangle";
    private static final String CIRC_CALC = "circle";
    private static final String TRI_CALC = "triangle";
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
        String rectangle = request.getParameter("rectangle");
        String circle = request.getParameter("circle");
        String triangle = request.getParameter("triangle");
        String recLength;
        String recHeight;
        String radius;
        String tBase;
        String tHeight;
        String recArea;
        String circleArea;
        String triangleArea;
        CalculateArea calculator = new CalculateArea();
        double length = 0;
        double height = 0;
        
        if (rectangle != null && rectangle.equals(RECT_CALC)){
            recLength = request.getParameter("length");
            recHeight = request.getParameter("height");
            try{
                length = Double.parseDouble(recLength);
                height = Double.parseDouble(recHeight);
            } catch (NumberFormatException nfe){
                request.setAttribute("rectangle", "You must provide numbers!");
                length = 0;
                height = 0;
            }
            if (length > 0 && height > 0){
                recArea = Double.toString(calculator.getCalculatedAreaRectangle(length, height));
                request.setAttribute("rectangle", recArea);
            }
        }
               
        if (circle != null && circle.equals(CIRC_CALC)){
            radius = request.getParameter("radius");
            double cirRadius = 0;
            try {
                cirRadius = Double.parseDouble(radius);
            } catch (NumberFormatException nfe){
                request.setAttribute("circle", "You must provide numbers!");
                cirRadius = 0;
            }
            if (cirRadius > 0 ){
                circleArea = Double.toString(calculator.getCalculatedAreaCircle(cirRadius));
                request.setAttribute("circle", circleArea);
            }
        }
        
        if (triangle != null && triangle.equals(TRI_CALC)){
            tBase = request.getParameter("base");
            tHeight = request.getParameter("tHeight");
            double base = 0;
            double triHeight = 0;
            try {
                base = Double.parseDouble(tBase);
                triHeight = Double.parseDouble(tHeight);
            } catch (NumberFormatException nfe){
                request.setAttribute("triangle", "You must provide only numbers");
                base = 0;
                base = 0;
            }
            if (base > 0 && triHeight > 0){
                triangleArea = Double.toString(calculator.getCalculatedAreaTriangle(base, triHeight));
                request.setAttribute("triangle", triangleArea);
            }
        }
       
        RequestDispatcher view =
            request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
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
