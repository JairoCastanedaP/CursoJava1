<%-- 
    Document   : desplegarVariables
    Created on : 6/05/2020, 8:44:23 p. m.
    Author     : ENVYX360
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables!</h1>
        Variables en el alcance request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance de sesion:
        <br/>
        Rectangulo:
        base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">regresar al inicio</a>
    </body>
</html>
