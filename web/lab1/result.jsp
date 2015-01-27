<%-- 
    Document   : result
    Created on : Jan 27, 2015, 1:51:27 PM
    Author     : mdeboer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area result</title>
    </head>
    <body>
        <h1>Here is the area of the rectangle that you entered.</h1>
        <p>
        <%
            String area = (String)request.getAttribute("result");
            if (area == null){
                out.print("Sorry, something went wrong");
            }
            else {
                out.print(area);
            }
        %>    
        </p>
    </body>
</html>
