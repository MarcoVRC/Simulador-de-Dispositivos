/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author RC
 */
public class ManejoSmartWatch extends ManejoDispositivo{
    private static ManejoSmartWatch instancia;
    private ArrayList<SmartWatch> relojes = new ArrayList<>();
    private ManejoSmartWatch()
    {}
    
    public static ManejoSmartWatch getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoSmartWatch();
        }
        return instancia;
    }
    
    
    public void crearReloj()
    {
        Dispositivo d = crearDispositivo();
        SmartWatch reloj = new SmartWatch();
        reloj.setIdDispositivo(d.getIdDispositivo());
        reloj.setCorreoElectronico(d.getCorreoElectronico());
        reloj.setNombreDelDispositivo(d.getNombreDelDispositivo());
        reloj.setVisibilidad(d.getVisibilidad());
        reloj.setEncendido(d.getEncendido());
           relojes.add(reloj);
    }
    
    public void administrarSmartWatch(){
        SmartWatch reloj = new SmartWatch();
       
       ArrayList<Dispositivo> myArrayList = castArrayList(relojes);
       administrarDispositivo(myArrayList, reloj.getTipoDeDispositivo());
    }	
    
    public static <Dispositivo, SmartWatch> ArrayList<Dispositivo> castArrayList(ArrayList<SmartWatch> list){
    ArrayList<Dispositivo> newlyCastedArrayList = new ArrayList<Dispositivo>();
    for(SmartWatch listObject : list){
        newlyCastedArrayList.add((Dispositivo)listObject);
    }
    return newlyCastedArrayList;
}
}
