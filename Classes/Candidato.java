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
public class Candidato extends Persona{
    private String foto;
    private String boleta;
    private int idCandidato;
    private int idAsesor;
    
    private int teléfonoCelular;
    private String carrera;
    private String generación;
    private String temaDeTesis;
    private String directorDeTesis;
    private String trabaja;
    private String lugarDeTrabajo;
    private String horarioDeTrabajo;
    private String admitido;

    public Candidato() {
    }

    public Candidato(String foto, String boleta, int idCandidato, int teléfonoCelular, String carrera, String generación, String temaDeTesis, String directorDeTesis, String trabaja, String lugarDeTrabajo, String horarioDeTrabajo, String admitido, String nombre, String appPaterno, String appMaterno, String correoElectrónico) {
        super(nombre, appPaterno, appMaterno, correoElectrónico);
        this.foto = foto;
        this.boleta = boleta;
        this.idCandidato = idCandidato;
        this.teléfonoCelular = teléfonoCelular;
        this.carrera = carrera;
        this.generación = generación;
        this.temaDeTesis = temaDeTesis;
        this.directorDeTesis = directorDeTesis;
        this.trabaja = trabaja;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.horarioDeTrabajo = horarioDeTrabajo;
        this.admitido = admitido;
    }

    public int getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }

    
    
    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public int getTeléfonoCelular() {
        return teléfonoCelular;
    }

    public void setTeléfonoCelular(int teléfonoCelular) {
        this.teléfonoCelular = teléfonoCelular;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGeneración() {
        return generación;
    }

    public void setGeneración(String generación) {
        this.generación = generación;
    }

    public String getTemaDeTesis() {
        return temaDeTesis;
    }

    public void setTemaDeTesis(String temaDeTesis) {
        this.temaDeTesis = temaDeTesis;
    }

    public String getDirectorDeTesis() {
        return directorDeTesis;
    }

    public void setDirectorDeTesis(String directorDeTesis) {
        this.directorDeTesis = directorDeTesis;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String getHorarioDeTrabajo() {
        return horarioDeTrabajo;
    }

    public void setHorarioDeTrabajo(String horarioDeTrabajo) {
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

    public String getAdmitido() {
        return admitido;
    }

    public void setAdmitido(String admitido) {
        this.admitido = admitido;
    }
    
    
}
