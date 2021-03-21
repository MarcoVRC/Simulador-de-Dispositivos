/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import bean.Dispositivo;
import bean.Foto;
import bean.SmartWatch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author RC
 */
public class ManejoSmartWatch extends ManejoDispositivo{
    private static ManejoSmartWatch instancia;
    private ArrayList<SmartWatch> arrayRelojes = new ArrayList<>();
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private int Id=1;
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
        reloj.setIdDispositivo(Id);
        reloj.setCorreoElectronico(d.getCorreoElectronico());
        reloj.setNombreDelDispositivo(d.getNombreDelDispositivo());
        reloj.setVisibilidad(d.getVisibilidad());
        reloj.setEncendido(d.getEncendido());
           arrayRelojes.add(reloj);
           Id++;
    }
    
    public void cargarReloj(String correo, String nombre, String visible)
    {
     
    SmartWatch reloj1 = new SmartWatch();
    reloj1.setIdDispositivo(Id);
    reloj1.setCorreoElectronico(correo);
    reloj1.setNombreDelDispositivo(nombre);
    reloj1.setVisibilidad(visible);
    reloj1.setEncendido(encendido);
         arrayRelojes.add(reloj1);
         Id++;
    
    }
    
        public void capturarFotoReloj()
    {
        for(SmartWatch d: arrayRelojes)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("--------------------------------------------------------------------");
            
        }
         System.out.println("Selecciona el dispositivo tomar una fotografia.: ");
        try{
        int id = Integer.parseInt(bf.readLine());
        for(SmartWatch p: arrayRelojes)
        {
            if(id == p.getIdDispositivo())
            {
                tomarFoto(p.getCorreoElectronico(), p.getTipoDeDispositivo(), p.getNombreDelDispositivo(), p.getIdDispositivo());
                 
            }
        }
        }catch(IOException e){}
    }
        
    public void mostrarFotoReloj()
    {
       for(SmartWatch d: arrayRelojes)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("--------------------------------------------------------------------");
            
        }
        System.out.println("Selecciona el dispositivo para ingresar a su galeria: ");
        try{
        int id = Integer.parseInt(bf.readLine());
        for(SmartWatch p: arrayRelojes)
        {
            if(p.getIdDispositivo() == id)
            {
                for(Foto f: arrayFotos)
                {
                    if(f.getIdDispositivo() == id )
                    {
                        System.out.println("Tipo de Dispositivo : " + f.getTipoDispositivo());
                        System.out.println("Capturado desde: " + f.getNombreDispositivo());
                        System.out.println("Nombre de Foto : " + f.getNombreFoto());
                    }
                }
            }
        }
        }catch(IOException e){}
    }    
    public void administrarSmartWatch(){
        SmartWatch reloj = new SmartWatch();
       
       ArrayList<Dispositivo> myArrayList = castArrayList(arrayRelojes);
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
