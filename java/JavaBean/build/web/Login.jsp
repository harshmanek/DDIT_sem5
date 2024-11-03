<%-- 
    Document   : Login
    Created on : 25 Sept 2024, 1:49:03 pm
    Author     : harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="com.javaBean.PersonBean" scope="request"/>
<>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        
           
        request.setAttribute("USERNAME", name);
        request.setAttribute("PASSWORD", password);
        
        RequestDispatcher  rd = request.getRequestDispatcher("Success.jsp");
        rd.forward(request, response);
        %>
    </body>
</html>
