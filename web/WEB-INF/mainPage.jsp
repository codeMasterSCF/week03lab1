<%-- 
    Document   : mainPage
    Created on : Sep 27, 2017, 8:03:13 AM
    Author     : 463849
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/header.html" />

        <h1>Welcome!</h1>
        <p>Hello, ${user} <a href="LoginServlet?logout=Loged Out">Logout</a></p>

<c:import url="/WEB-INF/footer.html" />