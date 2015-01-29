/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorlabmodel;

/**
 *
 * @author mdeboer1
 */
public class CalculateArea {
    private double rectangleArea;
    private double circleArea;
    private double triangleArea;
    private final  int DIVIDE_BY_HALF = 2;
    
    public CalculateArea() {
    }
    
    public final double getCalculatedAreaRectangle(double length, double height){
        rectangleArea = length * height;
        return rectangleArea;
    }
    
    public final double getCalculatedAreaCircle(double radius){
        circleArea = Math.PI * (radius * radius);
        return circleArea;
    }
    
    public final double getCalculatedAreaTriangle(double base, double height){
        triangleArea = (base * height) / DIVIDE_BY_HALF;
        return triangleArea;
    }
}
