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
public class SmartPhone extends Dispositivo{
    private String numero;
    private final String tipoDeDispositivo = "SMARTPHONE";

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    

    public  String getTipoDeDispositivo() {
        return tipoDeDispositivo;
    }
    
    
    
    
}
