<%-- 
    Document   : datosScopesInterfaces
    Created on : 25-jul-2014, 14:09:48
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
        <h1>Formulario para introducir los nombres de los scopes:</h1>
        <p>
            <s:form action="scopesInterfaces">
                <s:textfield name="datosSesion" label="Sesion"/>
                <s:textfield name="datosRequest" label="Request"/>
                <s:textfield name="datosAplicacion" label="Aplicacion"/>
                <s:submit value="Aceptar"/>
            </s:form>
        </p>
        <p>
            <a href="index.jsp">Inicio</a>
        </p>
    </body>
</html>
