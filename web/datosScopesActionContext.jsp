<%-- 
    Document   : datosScopesActionContext
    Created on : 28-jul-2014, 12:02:51
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scopes</title>
    </head>
    <body>
        <h1>Formulario para uso de Scopes desde ActionContext</h1>
        <p>
            <s:form action="scopesActionContext">
                <s:textfield name="datoSesion" label="Sesión"/>
                <s:textfield name="datosAplicacion" label="Aplicación"/>
                <s:submit value="Aceptar" />
            </s:form>
        </p>
        <p>
            <a href="index.jsp">Inicio</a>
        </p>
    </body>
</html>

