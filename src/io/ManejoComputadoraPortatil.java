/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import bean.Dispositivo;
import bean.Portatil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



/**
 *
 * tipo de dispositivo, numero de telefono, dispositivo asociado, correo electronico, nombre de dispositivo, visible

 * @author RC
 */
public class ManejoComputadoraPortatil extends ManejoDispositivo{
  //  private String tipoDeDispositivo;
    private static ManejoComputadoraPortatil instancia;
    private ArrayList<Portatil> arrayPortatiles = new ArrayList<>();
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private String encendido = "SI";
    private int id=1;
    
    private  ManejoComputadoraPortatil()
    {
        if(!arrayPortatiles.isEmpty())
        {
        id = arrayPortatiles.get(arrayPortatiles.size()-1).getIdDispositivo()+1;
        }
    }
    
    public static ManejoComputadoraPortatil getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoComputadoraPortatil();
        }
        return instancia;
    }
    
    public void crearPortatil()
    {   
   
    Dispositivo d = crearDispositivo();
    Portatil portatil = new Portatil();
    portatil.setIdDispositivo(id);
    portatil.setCorreoElectronico(d.getCorreoElectronico());
    portatil.setNombreDelDispositivo(d.getNombreDelDispositivo());
    portatil.setVisibilidad(d.getVisibilidad());
    portatil.setEncendido(d.getEncendido());
        arrayPortatiles.add(portatil);
        id++;
    }
    
    public void cargarPortatil(String correo, String nombre, String visible)
   {
       Portatil portatil1 = new Portatil(); 
    portatil1.setIdDispositivo(id);
    portatil1.setCorreoElectronico(correo);
    portatil1.setNombreDelDispositivo(nombre);
    portatil1.setVisibilidad(visible);
    portatil1.setEncendido(encendido);
         arrayPortatiles.add(portatil1);
         id++;
      // System.out.println(correo /*+ nombre + visible*/);
        //mostrar();
   }
    
    public void capturarFotoPortatil()
    {
        for(Portatil d: arrayPortatiles)
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
        for(Portatil p: arrayPortatiles)
        {
            if(id == p.getIdDispositivo())
            {
                tomarFoto(p.getCorreoElectronico(), p.getTipoDeDispositivo(), p.getNombreDelDispositivo());
                 
            }
        }
        }catch(IOException e){}
    }
    
    public void administrarPortatil(){
        Portatil p = new Portatil();
       
        ArrayList<Dispositivo> myArrayList = castArrayList(arrayPortatiles);
        administrarDispositivo(myArrayList, p.getTipoDeDispositivo());
    }	
    
    public static <Dispositivo, Portatil> ArrayList<Dispositivo> castArrayList(ArrayList<Portatil> list){
    ArrayList<Dispositivo> newlyCastedArrayList = new ArrayList<Dispositivo>();
    for(Portatil listObject : list){
        newlyCastedArrayList.add((Dispositivo)listObject);
    }
    return newlyCastedArrayList;
}
    
}
