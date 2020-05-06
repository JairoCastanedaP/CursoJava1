<%-- 
    Document   : index
    Created on : 5/05/2020, 8:02:24 p. m.
    Author     : ENVYX360
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>HOLA MUNDO JSP!</h1>
        <ul>
            <li><% out.print("Hola mundo con Scriptlets"); %></li>
            <li>${"Hola Mundo on Expression Language(EL)"}</li>
            <li><%= "Hola Mundo con Expresiones"%></li>
            <li><c:out value="Hola mundo con jstl"/></li>
        </ul>
    </body>
</html>
