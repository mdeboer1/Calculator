<%-- 
    Document   : form
    Created on : Jan 27, 2015, 2:41:58 PM
    Author     : mdeboer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Calculator</title>
    </head>
    <body>
        <h1>Enter in numbers below to calculate areas of certain shapes</h1>
        <form id="input" name="input" method="POST" action='<%= 
                request.getContextPath() + "/area3"%>'>
            <fieldset>
                <legend>Rectangle Area Calculator</legend>
                    <label for="length">Length</label>
                    <input id="length" name="length" value=""/><br><br>
                    <label for="height">Height</label>
                    <input id="height" name="height" value=""/>
                    <%
                        String rectangleArea = (String)request.getAttribute("rectangle");
                        if (rectangleArea == null){
                            out.print("");
                        }
                        else {
                            out.print("<h2>The area is " + rectangleArea + "</h2>");
                        }
                    %>
            </fieldset><br>
            <fieldset>
                <legend>Circle Area Calculator</legend>
                    <label for="radius">Radius</label>
                    <input id="radius" name="radius" value=""/><br><br>
                    <%
                        String circleArea = (String)request.getAttribute("circle");
                        if (circleArea == null){
                            out.print("");
                        }
                        else {
                            out.print("<h2>The area is " + circleArea);
                        }
                    %>
            </fieldset><br>
            <fieldset>
                <legend>Triangle Area Calculator</legend>
                    <label for="base">Base</label>
                    <input id="base" name="base" value=""/>
                    <label for="tHeight">Height</label>
                    <input id="tHeight" name="tHeight" value=""/>
                    <%
                        String triangleArea = (String)request.getAttribute("triangle");
                        if (triangleArea == null){
                            out.print("");
                        }
                        else {
                            out.print("<h2>The area is " + triangleArea + "</h2>");
                        }
                    %>
            </fieldset><br>
            <input type="submit" id="submit" name="submit" valued="Submit"/>
        </form>    
    </body>
</html>
