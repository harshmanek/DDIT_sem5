<%-- 
    Document   : index
    Created on : 22 Oct 2024, 12:01:08 pm
    Author     : harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            Username:<input name="Username" type="text">
            Password:<input name="password" type="text">
            <input type="submit" name="Submit">
        </form>
    </body>
</html>
