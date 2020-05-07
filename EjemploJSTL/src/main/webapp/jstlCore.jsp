<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core (Jsp Standard Tag Library!</h1>
        <!--Manipulacion de variables-->
        <!--Definimos la variable-->
        <br/>
        <c:set var="nombre" value="ernesto"/>
        <!--Desplegamosel valor de la variable-->
        Variable nombre : <c:out value="${nombre}"/>
        <br/>
        <br/>
        Variable con código html:
        <c:out value="<h4>hola</h4>" escapeXml="false"/>
        <br/>
        <br/>
        <!--Codigo condicionado -->
        <c:set var="bandera" value="true"/>
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!--Switch-->
        <c:if test="${param.opcion!=null}">
            <c:choose>
                <c:when test="${param.opcion==1}">
                    Opcion 1 seleccionada
                </c:when>
                    <c:when test="${param.opcion==2}">
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br/>
                    Opción proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!--Iteración de un arreglo-->
        <%
            String nombres[]={"pedro","juaco","cami"};
            request.setAttribute("nombres",nombres);
        %>
        <br/>
        Lista de Nombres:
        <ul>
            <c:forEach var="persona" items="${nombres}">
            <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
