/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

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
    public  ManejoComputadoraPortatil()
    {
    }
    
    public static ManejoComputadoraPortatil getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoComputadoraPortatil();
        }
        return instancia;
    }
     
    private ArrayList<Portatil> portatiles = new ArrayList<>();
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public String encendido = "SI";
    
    public void crearPortatil()
    {   
   
     Dispositivo d = crearDispositivo();
     Portatil p = new Portatil();
     p.setIdDispositivo(d.getIdDispositivo());
     p.setCorreoElectronico(d.getCorreoElectronico());
     p.setNombreDelDispositivo(d.getNombreDelDispositivo());
     p.setVisibilidad(d.getVisibilidad());
     p.setEncendido(d.getEncendido());
        portatiles.add(p);
    }
    
    public void tomarFoto()
    {
        for(Portatil d: portatiles)
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
        for(Portatil p: portatiles)
        {
            if(id == p.getIdDispositivo())
            {
                tomarFoto(p.getCorreoElectronico());
                 
            }
        }
        }catch(IOException e){}
    }
    
    public void administrarPortatil(){
        Portatil p = new Portatil();
       
        ArrayList<Dispositivo> myArrayList = castArrayList(portatiles);
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
