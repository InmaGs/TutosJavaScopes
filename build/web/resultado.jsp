<%-- 
    Document   : resultado
    Created on : 25-jul-2014, 14:42:54
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Scopes</title>
    </head>
    <body>
        <h1>Resultados</h1>
        <p>
            Request: <s:property value="#request.datosRequest"/><br/>
            Sesión: <s:property value="#session.datosSesion"/><br/>
            Aplicación: <s:property value="#application.datosAplicacion"/><br/>
        </p>
        <p>
            Para comprobar el request: Iniciar directamente la página del resultado.<br/>
            Para comprobar el session: Esperar a finalizar sesión (30 minutos), entrar a la misma dirección
            desde otro navegador o terminar sesiones activas en el navegador. <br/>
            El dato de aplicación deberá estar siempre activo.
        </p>
        <p>
            <a href="index.jsp">Inicio</a>
        </p>
    </body>
</html>
