<%-- 
    Document   : datosServletsInterfaces
    Created on : 28-jul-2014, 12:24:05
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scopes</title>
    </head>
    <body>
        <h1>Formulario.</h1>
        <p>
            <s:form action="datosInterface">
                <s:textfield name="datoSesion" label="Sesion"/>
                <s:textfield name="datoRequest" label="Request"/>
                <s:textfield name="datosAplicacion" label="Aplicacion"/>
                <s:submit value="Aceptar"/>
            </s:form>
        </p>
        <p>
            <a href="index.jsp">Inicio</a>
        </p>
    </body>
</html>
