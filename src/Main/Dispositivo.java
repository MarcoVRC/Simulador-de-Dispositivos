/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author RC
 */
public class Dispositivo {
    private int idDispositivo;
    private String correoElectronico;
    private String nombreDelDispositivo;
    private String visibilidad;
    private String encendido;

    
     public int getIdDispositivo() {
        return idDispositivo;
    }

    /*    public Dispositivo(String correoElectronico, String nombreDelDispositivo, int visibilidad, int encendido) {
    this.correoElectronico = correoElectronico;
    this.nombreDelDispositivo=nombreDelDispositivo;
    this.visibilidad = visibilidad;
    this.encendido = encendido;
    }*/
    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreDelDispositivo() {
        return nombreDelDispositivo;
    }

    public void setNombreDelDispositivo(String nombreDelDispositivo) {
        this.nombreDelDispositivo = nombreDelDispositivo;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public String getEncendido() {
        return encendido;
    }

    public void setEncendido(String encendido) {
        this.encendido = encendido;
    }
}
