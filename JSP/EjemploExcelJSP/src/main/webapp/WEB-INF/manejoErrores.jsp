<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Este es el JPS de manejo de errores</title>
    </head>
    <body>
        <h1>Este es el JPS de manejo de errores!</h1>
        <br>
        Ocurrio una Excepcion:<%= exception.getMessage()%>
        <br/>
        <textarea cols="30" rows="50">
        
                <% exception.printStackTrace(new PrintWriter(out));%>
       
        </textarea>
    </body>
</html>
