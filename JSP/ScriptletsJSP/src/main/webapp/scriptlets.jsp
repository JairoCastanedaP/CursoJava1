<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets!</h1>
        <br>
        <%--Scriptlet para enviar información al navegador --%>
        <%
            out.print("Sludos desde Scriptlet");

        %>
        <%--Scriptlet para manejar los implicitos--%>
        <%            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%--Scriptlet con codigo condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        la sesión SI es nueva
        <%
            } else if(session!=null){
        %>
        la sesion No es nueva
        <%
            }
        %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
