/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1model;

/**
 *
 * @author mdeboer1
 */
public class CalculateRectangleArea {
    private double area;
    
    public CalculateRectangleArea() {
    }
    
    public final double getCalculatedArea(double length, double height){
        area = length * height;
        return area;
    }
}
