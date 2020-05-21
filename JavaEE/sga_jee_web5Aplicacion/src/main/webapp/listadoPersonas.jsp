<%-- 
    Document   : listadoPersonas
    Created on : 17/05/2020, 10:51:46 p. m.
    Author     : ENVYX360
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de PERSONAS</title>
    </head>
    <body>
        <h1>LISTADO DE PERSONAS</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li> ${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </ul>
    </body>
</html>
