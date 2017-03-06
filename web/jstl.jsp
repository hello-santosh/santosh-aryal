<%-- 
    (JSP standard tag library)
    Document   : newjspjstl
    Created on : Apr 18, 2016, 2:18:01 PM
    Author     : HP
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:out value="hi"></c:out>
        <c:set var="a" value="9"></c:set>
        <c:out value="${a}"></c:out>
        <c:if test="${a>5}">
        <c:out value="hi"></c:out>
        </c:if>
        
        <c:choose>
            <c:when test="${a>10}">
                <c:out value="${a}"></c:out>
            </c:when>
            
            <c:otherwise>
                <c:out value="b"></c:out>
            </c:otherwise>
            
            
        </c:choose>
        
    </body>
</html>
