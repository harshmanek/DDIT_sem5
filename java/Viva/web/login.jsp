<%-- 
    Document   : login
    Created on : 22 Oct 2024, 11:05:11 am
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
        <form action="UserServlet">
            Username:<input name="username" type="text">
            <input type="submit" name="submit">
        </form>
    </body>
</html>
