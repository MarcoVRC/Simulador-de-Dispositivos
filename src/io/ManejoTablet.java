/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import bean.Dispositivo;
import bean.Foto;
import bean.Tablet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author RC
 */
public class ManejoTablet extends ManejoDispositivo{
    private static ManejoTablet instancia;
    private ArrayList<Tablet> arrayTablets = new ArrayList<>();
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private int Id=1;
    
    private ManejoTablet()
    {
    if(!arrayTablets.isEmpty())
        {
        Id = arrayTablets.get(arrayTablets.size()-1).getIdDispositivo()+1;
        }
    }
    public static ManejoTablet getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoTablet();
        }
        return instancia;
    }
   
    
    public void crearTablet()
    {
        Dispositivo d = crearDispositivo();
        Tablet tablet = new Tablet();
        tablet.setIdDispositivo(Id);
        tablet.setCorreoElectronico(d.getCorreoElectronico());
        tablet.setNombreDelDispositivo(d.getNombreDelDispositivo());
        tablet.setVisibilidad(d.getVisibilidad());
        tablet.setEncendido(d.getEncendido());
           arrayTablets.add(tablet);
    }
    
    public void cargarTablet(String correo, String nombre, String visible)
    {
     
    Tablet tablet1 = new Tablet();
    tablet1.setIdDispositivo(Id);
    tablet1.setCorreoElectronico(correo);
    tablet1.setNombreDelDispositivo(nombre);
    tablet1.setVisibilidad(visible);
    tablet1.setEncendido(encendido);
         arrayTablets.add(tablet1);
         Id++;
    
    }
    
    public void capturarFotoTablet()
    {
        for(Tablet d: arrayTablets)
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
        for(Tablet p: arrayTablets)
        {
            if(id == p.getIdDispositivo())
            {
                tomarFoto(p.getCorreoElectronico(), p.getTipoDeDispositivo(), p.getNombreDelDispositivo(), p.getIdDispositivo());
                 
            }
        }
        }catch(IOException e){}
    }
    
    public void mostrarFotoTablet()
    {
       for(Tablet d: arrayTablets)
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
        for(Tablet p: arrayTablets)
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
    
    public void copiarTextoTablet()
     {
        for(Tablet d: arrayTablets)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("--------------------------------------------------------------------");
            
        }
         System.out.println("Selecciona el dispositivo que va a copiar el texto: ");
        try{
            try{
        int id = Integer.parseInt(bf.readLine());
           
        for(Tablet p: arrayTablets)
        {
            if(id == p.getIdDispositivo() && p.getEncendido().equals("SI"))
            {
                copiarTexto(p.getIdDispositivo(),p.getNombreDelDispositivo());    
            }
        }
         }catch(NumberFormatException ex){}
        }catch(IOException e){}
     }
    
    public void pegarTextoTablet()
    {
        for(Tablet d: arrayTablets)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("--------------------------------------------------------------------");
        }
        System.out.println("Selecciona el dispositivo en el que vas pegar el texto: ");
        try{
            try{
                int id = Integer.parseInt(bf.readLine());
                for(Tablet p: arrayTablets)
                {
                    if(id == p.getIdDispositivo() && p.getVisibilidad().equalsIgnoreCase("SI") && p.getEncendido().equals("SI"))
                    {
                        pegarTexto();
                    }
                }
            }catch(NumberFormatException ex){}
        }catch(IOException e){}
    }
    public void administrarTablet(){
        Tablet tablet = new Tablet();
       
       ArrayList<Dispositivo> myArrayList = castArrayList(arrayTablets);
       administrarDispositivo(myArrayList, tablet.getTipoDeDispositivo());
    }	
    
    public static <Dispositivo, Tablet> ArrayList<Dispositivo> castArrayList(ArrayList<Tablet> list){
    ArrayList<Dispositivo> newlyCastedArrayList = new ArrayList<Dispositivo>();
    for(Tablet listObject : list){
        newlyCastedArrayList.add((Dispositivo)listObject);
    }
    return newlyCastedArrayList;
    }
}
