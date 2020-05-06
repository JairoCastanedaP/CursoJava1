<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Variables implicitas </title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br/>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente: ${header["User-Agent"]}</li>
            <li>Id sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web server :${pageContext.servletContext.serverInfo}</li>
            <li>Valor Parametro: ${param.usuario}</li>
            <li>Valor Parametro: ${param["usuario"]}</li>
            
        </ul>
            <br/>
            <br/>
            <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
