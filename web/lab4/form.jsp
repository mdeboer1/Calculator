<%-- 
    Document   : form
    Created on : Jan 29, 2015, 2:59:38 PM
    Author     : mdeboer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter in numbers below to calculate areas of certain shapes</h1>
        <form id="input" name="input" method="POST" action='<%= 
                request.getContextPath()%>/area3'>
            <fieldset>
                <legend>Rectangle Area Calculator</legend>
                    <label for="length">Length</label>
                    <input id="length" name="length" value=""/><br><br>
                    <label for="height">Height</label>
                    <input id="height" name="height" value=""/>
                    <input type="hidden" id="rectangle" name="rectangle" value="rectangle"/>
                    <%
                    String rectangleArea = "";
                        Object obj = request.getAttribute("rectangle");
                        if (obj == null){
                            out.print("");
                        }
                        else {
                            rectangleArea = (String)obj;
                        }
                    %>
                    <h2><%= rectangleArea %></h2>
                    <input type="submit" id="submit" name="submit" value="Submit"/>
            </fieldset><br>
        </form>
            <form id="circleInput" name="circleInput" method="POST" action='<%= 
                request.getContextPath()%>/area3'>    
                <fieldset>
                    <legend>Circle Area Calculator</legend>
                        <label for="radius">Radius</label>
                        <input id="radius" name="radius" value=""/><br><br>
                        <input type="hidden" id="circle" name="circle" value="circle"/>
                        <%
                            String circleArea = "";
                            Object obj2 = request.getAttribute("circle");
                            if (obj2 == null){
                                out.print("");
                            }
                            else {
                                circleArea = (String)obj2;
                            }
                            %>
                            <h2><%= circleArea%></h2>    
                        <input type="submit" id="submit" name="submit" value="Submit"/>    
                </fieldset><br>
            </form>
            <form id="triangleInput" name="triangleInput" action='<%= 
            request.getContextPath()%>/area3'>    
                <fieldset>
                    <legend>Triangle Area Calculator</legend>
                        <label for="base">Base</label>
                        <input id="base" name="base" value=""/>
                        <label for="tHeight">Height</label>
                        <input id="tHeight" name="tHeight" value=""/>
                        <input type="hidden" id="triangle" name="triangle" value="triangle"/>
                        <%
                            String triangleArea = "";
                            Object obj3 = request.getAttribute("triangle");
                            if (obj3 == null){
                                out.print("");
                            }
                            else {
                                triangleArea = (String)obj3;
                            }
                        %>
                        <h2><%= triangleArea%></h2>
                        <input type="submit" id="submit" name="submit" value="Submit"/>
                </fieldset><br>
            </form>   
        </form>    
    </body>
</html>
