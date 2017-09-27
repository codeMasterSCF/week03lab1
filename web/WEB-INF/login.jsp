<%-- 
    Document   : login
    Created on : Sep 27, 2017, 8:04:23 AM
    Author     : 463849
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/WEB-INF/header.html" />

        <h1>Please Login Below</h1>
        
        <form action="LoginServlet" method="post">
            Username: <input type="text" name="user" value=${user}><br><br>
            Password: <input type="text" name="pw" value=${password}><br><br>
            <input type="submit" value="Login">
        </form>
            <br>
        <div>${errorMessage}</div>
        <div>${invalid}</div>
        <div>
            ${farewell}  
        </div>
        <div>
            ${logout}  
        </div>
    <c:import url="/WEB-INF/footer.html" />
