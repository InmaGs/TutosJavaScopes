<%-- 
    Document   : index
    Created on : 25-jul-2014, 13:58:40
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Scopes</title>
    </head>
    <body>
        <h1>Tipos de Scopes</h1>
        <p>
            Los scopes son los tiempos de vida de las peticiones de intercambio de datos
            que se hace a un servidor. Se tienen tres tipos:
        <ul>
            <li><strong>Application: </strong>Abarca el tiempo de vida de la aplicación</li>
            <li><strong>Session: </strong>Abarca el tiempo de conexión del usuario</li>
            <li><strong>Request: </strong>Sólo válido para una petición.</li>
        </ul>
        </p>
        <p>
            <a href="datosScopesInterfaces.jsp">Datos</a>
            <a href="datosScopesActionContext.jsp">Datos Action</a>
            <a href="datosScopesServletActionContext.jsp">Datos Servlet</a>
        </p>
    </body>
</html>
