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
public class Texto {
  private int idTexto;
  private int idDispositivo;
  private String textoCopiado;
  private String nombreDispositivo;

    public int getIdTexto() {
        return idTexto;
    }

    public void setIdTexto(int idTexto) {
        this.idTexto = idTexto;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getTextoCopiado() {
        return textoCopiado;
    }

    public void setTextoCopiado(String textoCopiado) {
        this.textoCopiado = textoCopiado;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }
  
  
    
}
