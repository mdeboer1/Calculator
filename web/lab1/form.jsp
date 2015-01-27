<%-- 
    Document   : form
    Created on : Jan 27, 2015, 1:34:28 PM
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
        <form id="form1" name="form1" method="POST" action="../area">
            <label for="lenght">Length</label>
            <input id="length" name="length" value=""/><br><br>
            <label for="height">Height</label>
            <input id="height" name="height" value=""/>
            <input type="submit" id="submit" name="submit" valued="Submit"/>
        </form>
    </body>
</html>
