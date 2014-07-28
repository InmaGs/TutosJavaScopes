/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.actions;

import org.apache.struts2.convention.annotation.*;
import com.opensymphony.xwork2.ActionSupport;
//Los siguientes import son para la implementación de las interfaces:
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;
//Cargamos los 'objetos' del servidor:
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author inmaculada.garcia
 */

//Anotaciones:
@Namespace(value="")
@Action(value="datosInterface", results=
        {@Result(name="success",location="/resultado.jsp")})

public class ObjetosServletAction extends ActionSupport implements ServletContextAware,
        ServletRequestAware{
    
    //Con estos parámetros almacenamos las referencias recibidas por los métodos de las 
    //interfaces 
    private ServletContext application;
    private HttpServletRequest request;
    
    //Implementamos las interfaces:
    public void setServletContext(ServletContext sc){
        this.application=sc;
    }
    
    public void setServletRequest(HttpServletRequest hsr){
        this.request=hsr;
    }
    
    //Agregamos las variables que reciben los datos del formulario junto con sus setters:
    private String datosSesion, datosRequest, datosAplicacion;
    
    public void setDatoSesion(String datoSesion){
        this.datosSesion=datoSesion;
    }
    
    public void setDatoRequest(String datoRequest){
        this.datosRequest=datoRequest;
    }
    
    public void setDatosAplicacion(String datosAplicacion){
        this.datosAplicacion=datosAplicacion;
    }
    
    //Método execute:
    @Override
    public String execute() throws Exception{
        
        //Establecemos los valores de los atributos en cada uno de los scopes:
        HttpSession session=request.getSession();
        application.setAttribute("datosAplicacion", datosAplicacion);
        session.setAttribute("datosSesion",datosSesion);
        request.setAttribute("datosRequest", datosRequest);
        
        return SUCCESS;
    }
}
