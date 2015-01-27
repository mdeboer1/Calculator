<%-- 
    Document   : form
    Created on : Jan 27, 2015, 2:05:47 PM
    Author     : mdeboer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Area</title>
    </head>
    <body>
        <h1>Enter in the length and height of the rectangle to get the area 
        calculated for you.</h1>
        <form id="input" name="input" method="POST" action='<%= request.getContextPath() + "/area2"%>'>
            <label for="length">Length</label>
            <input id="length" name="length" value=""/><br><br>
            <label for="height">Height</label>
            <input id="height" name="height" value=""/>
            <input type="submit" id="submit" name="submit" valued="Submit"/>
        </form>
        <form id="output" name="output" method="POST" action="">
            <%
                String result = (String)request.getAttribute("result");
                if (result == null){
                    out.print("");
                }
                else {
                    out.print("<h2>Your area is " + result);
                }
            %>    
        </form>
    </body>
</html>
