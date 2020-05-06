<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones!</h1>
        Concatenacon: <%="Saludos"+" "+"JPS" %>
        <br>
        Operacion matematica <%= 2*2/2 %>
        <br>
        Session id= <%= session.getId()%>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
