/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.actions;

import com.opensymphony.xwork2.ActionSupport;
//Las tres clases siguientes son las necesarias para usar los scopes:
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import org.apache.struts2.convention.annotation.*;

/**
 *
 * @author inmaculada.garcia
 */
//Anotamos:
@Namespace(value="") //lo dejamos vacío porque es el directorio raíz
@Action(value="scopesInterfaces", results={@Result(name="success",location="/resultado.jsp")})
//Implementamos las interfaces de los scopes:
public class ScopesInterfacesAction extends ActionSupport implements RequestAware,
        SessionAware,ApplicationAware
{
    
    //Declaración de las variables recibidas del formulario
    private String datosSesion, datosRequest, datosAplicacion;
    //Añadimos un atributo para almacenar el argumento establecido por el framework 
    //y poder usarlo luego en el método execute:
    private Map<String, Object> session;
    private Map<String, Object> application;
    private Map<String, Object> request;
    
    //Declaración del método execute, que pondrá el valor que se recibe del mapeo en 
    //las cajas de texto correspondientes
    @Override
    public String execute() throws Exception{
        
        application.put("datosAplicacion", datosAplicacion);
        session.put("datosSesion", datosSesion);
        request.put("datosRequest", datosRequest);
        
        return SUCCESS;
    }
    
    //Declaración de los setters de las variables del formulario. No se ponen los getters, 
    //ya que son tratados de una forma diferente a la habitual.
    public void setDatosSesion(String datosSesion){
        this.datosSesion=datosSesion;
    }
    
    public void setDatosRequest(String datosRequest){
        this.datosRequest=datosRequest;
    }
    
    public void setDatosAplicacion(String datosAplicacion){
        this.datosAplicacion=datosAplicacion;
    }
    
    //Declaración de los setters del mapeo:
    public void setRequest(Map<String,Object> map){
        this.request=map;
    }
    
    public void setApplication(Map<String, Object> map){
        this.application=map;
    }
    
    public void setSession(Map<String, Object> map){
        this.session=map;
    }
}
