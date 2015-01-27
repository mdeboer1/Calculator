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
        <form id="input" name="input" method="POST" action='<%= request.getContextPath() + "/area2?length=length&height=height"%>'>
            <label for="length">Length</label>
            <input id="length" name="length" value=""/><br><br>
            <label for="height">Height</label>
            <input id="height" name="height" value=""/>
            <input type="submit" id="submit" name="submit" valued="Submit"/>
        </form>
    </body>
</html>
