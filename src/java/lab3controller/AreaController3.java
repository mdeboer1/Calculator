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
        response.setContentType("text/html;charset=UTF-8");
        String recLength = request.getParameter("length");
        String recHeight = request.getParameter("height");
        String radius = request.getParameter("radius");
        String tBase = request.getParameter("base");
        String tHeight = request.getParameter("tHeight");
        String recArea = null;
        String circleArea = null;
        String triangleArea = null;
        CalculateArea calculator = new CalculateArea();
        
        if (!(recLength.isEmpty()) && (!(recHeight.isEmpty()))){
            double length = Double.parseDouble(recLength);
            double height = Double.parseDouble(recHeight);
            recArea = Double.toString(calculator.getCalculatedAreaRectangle(length, height));
        }
        if (!(radius.isEmpty())){
            double cirRadius = Double.parseDouble(radius);
            circleArea = Double.toString(calculator.getCalculatedAreaCircle(cirRadius));
        }
        if (!(tBase.isEmpty()) && (!(tHeight.isEmpty()))){
            double base = Double.parseDouble(tBase);
            double triHeight = Double.parseDouble(tHeight);
            triangleArea = Double.toString(calculator.getCalculatedAreaTriangle(base, triHeight));
        }

        request.setAttribute("rectangle", recArea);
        request.setAttribute("circle", circleArea);
        request.setAttribute("triangle", triangleArea);
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
