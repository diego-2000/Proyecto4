package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEll
 */
public class Persona {
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private String correoElectrónico;

    public Persona(String nombre, String appPaterno, String appMaterno, String correoElectrónico) {
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.correoElectrónico = correoElectrónico;
    }
    
    public Persona(){
    this.nombre="nombre";
    this.appPaterno="appePat";
    this.appMaterno="appmater";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }
    
    @Override
    public String toString(){
    return ""+nombre+","+appPaterno+","+appMaterno;
    }
}
