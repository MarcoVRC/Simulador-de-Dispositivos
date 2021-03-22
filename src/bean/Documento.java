/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author RC
 */
public class Documento {
    private int idDocumento;
    private String nombreDocumento;
    private String nombreDispositivoOrigen;
    private String nombreDispositivoDestino;
    private int idDispositivo;

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getnombreDispositivoOrigen() {
        return nombreDispositivoOrigen;
    }

    public void setNombreDispositivoOrigen(String nombreDispositivo) {
        this.nombreDispositivoOrigen = nombreDispositivoOrigen;
    }

    public String getNombreDispositivoDestino() {
        return nombreDispositivoDestino;
    }

    public void setNombreDispositivoDestino(String nombreDispositivoDestino) {
        this.nombreDispositivoDestino = nombreDispositivoDestino;
    }
    
    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }
    
    
}
