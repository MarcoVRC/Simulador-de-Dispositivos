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
public class SmartPhone extends Dispositivo{
    private int numero;
    private final String tipoDeDispositivo = "SmartPhone";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public  String getTipoDeDispositivo() {
        return tipoDeDispositivo;
    }
    
    
    
    
}
