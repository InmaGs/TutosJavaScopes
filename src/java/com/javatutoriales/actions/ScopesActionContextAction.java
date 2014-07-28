/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.actions;

import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext; //Importamos para que funcionen los métodos
import org.apache.struts2.convention.annotation.*;
/**
 *
 * @author inmaculada.garcia
 */
//Anotamos la clase:
@Namespace(value="/")
@Action(value="scopesActionContext", results =
        {@Result(name="success", location="/resultado.jsp")})
public class ScopesActionContextAction extends ActionSupport {
    
    //Variables que vienen del formulario:
    private String datoSesion, datosAplicacion;
    
    //Sobreescribimos método execute:
    @Override
    public String execute() throws Exception{
        //hacemos uso del ActionContext para estableces los valores adecuados:
        ActionContext contexto=ActionContext.getContext();
        
        //Teniendo esto ya referenciado, hacemos uso de  getApplication y getSession
        //para obtener los mapeos de los Scopes:
        
        Map<String, Object> application = contexto.getApplication();
        Map<String, Object> session=contexto.getSession();
        
        //Colocamos los atributos recibidos del formulario en los mapas correspondientes:
        application.put("datosAplicacion", datosAplicacion);
        session.put("datosSesion", datoSesion);
        
        return SUCCESS;
    }
            
    //Setter de los datos del formulario:
    public void setDatoSesion(String datosSesion){
        this.datoSesion=datosSesion;
    }
    
    public void setDatosAplicacion(String datosAplicacion){
        this.datosAplicacion=datosAplicacion;
    }
}

