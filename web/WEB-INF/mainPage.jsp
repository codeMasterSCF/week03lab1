<%-- 
    Document   : mainPage
    Created on : Sep 27, 2017, 8:03:13 AM
    Author     : 463849
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <p>Hello, ${user} <a href="LoginServlet?logout=Loged Out">Logout</a></p>
    </body>
</html>
