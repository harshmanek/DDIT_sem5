<%-- 
    Document   : Success
    Created on : 25 Sept 2024, 1:49:12 pm
    Author     : harsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="person" class="com.javaBean.PersonBean" scope="request"/>
<jsp:setProperty name="person" property="*"></jsp:setProperty>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Name : <jsp:getProperty name="person" property="id"/></p>
        <p>Password : <jsp:getProperty name="person" property="name"/></p>
    </body>
</html>
