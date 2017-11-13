/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author DEll
 */
public class Asesor extends Persona{
    
private int idAsesor;
private String cubículo;
private String horarioDeAsesorías;

 
    public Asesor(int idAsesor, String cubículo, String horarioDeAsesorías, String nombre, String appPaterno, String appMaterno, String correoElectrónico) {
        super(nombre, appPaterno, appMaterno, correoElectrónico);
        this.idAsesor = idAsesor;
        this.cubículo = cubículo;
        this.horarioDeAsesorías = horarioDeAsesorías;
    }

    public Asesor(int idAsesor, String cubículo, String horarioDeAsesorías) {
        this.idAsesor = idAsesor;
        this.cubículo = cubículo;
        this.horarioDeAsesorías = horarioDeAsesorías;
    }

    public Asesor() {
     
    }


    public String getCubículo() {
        return cubículo;
    }

    public void setCubículo(String cubículo) {
        this.cubículo = cubículo;
    }

    public String getHorarioDeAsesorías() {
        return horarioDeAsesorías;
    }

    public void setHorarioDeAsesorías(String horarioDeAsesorías) {
        this.horarioDeAsesorías = horarioDeAsesorías;
    }

    public int getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }

    @Override
    public String toString() {
        return "Asesor{" + "cub\u00edculo=" + cubículo + ", horarioDeAsesor\u00edas=" + horarioDeAsesorías + '}';
    }
 
}
