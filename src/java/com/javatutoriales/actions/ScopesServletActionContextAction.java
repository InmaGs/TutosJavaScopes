/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.actions;

import org.apache.struts2.convention.annotation.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 *
 * @author inmaculada.garcia
 */

//Anotamos:
@Namespace(value="/")
@Action(value="scopesServletActionContext", results=
        {@Result(name="success", location = "/resultado.jsp")})

public class ScopesServletActionContextAction extends ActionSupport {
    
    //Valores procedentes del formulario:
    private String datosRequest, datosSesion, datosAplicacion;
    
    //Sobreescribimos médoto execute:
    @Override
    public String execute() throws Exception{
        //Usamos los métodos estáticos de la clase ServletActionContext para asignar
        //los valores de sesión, request y aplicación.
        HttpServletRequest request = ServletActionContext.getRequest();
        ServletContext context = ServletActionContext.getServletContext();
        HttpSession session = request.getSession();
        
        //Y finalmente, los atributos de los scopes quedan:
        request.setAttribute("datosRequest", datosRequest);
        session.setAttribute("datosSesion",datosSesion);
        context.setAttribute("datosAplicacion", datosAplicacion);
        
        return SUCCESS;
    }
    
    //Métodos setter para los valores recibidos del formulario:
    public void setDatosRequest(String datosRequest){
        this.datosRequest=datosRequest;
    }
    
    public void setDatosSesion(String datosSession){
        this.datosSesion=datosSession;
    }
    
    public void setDatosAplicacion(String datosAplicacion){
        this.datosAplicacion=datosAplicacion;
    }
}

