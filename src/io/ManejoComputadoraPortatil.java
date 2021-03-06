/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import bean.Dispositivo;
import bean.Documento;
import bean.Foto;
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
   }
    
    public void mostrarLista()
    {
        for(Portatil d: arrayPortatiles)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("--------------------------------------------------------------------");
        }
    }
    
    public void mostrarListaVisibles()
    {
        for(Portatil d: arrayPortatiles)
        {
            if(d.getVisibilidad().equals("SI"))
            {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("ID : " + d.getIdDispositivo()+"\n");
                System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
                System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }
    
    public void capturarFotoPortatil()
    {
        mostrarLista();
        System.out.println("Selecciona el dispositivo tomar una fotografia.: ");
        try{
        int id = Integer.parseInt(bf.readLine());
        for(Portatil p: arrayPortatiles)
        {
            if(id == p.getIdDispositivo())
            {
                tomarFoto(p.getCorreoElectronico(), p.getTipoDeDispositivo(), p.getNombreDelDispositivo(), p.getIdDispositivo());
                 
            }
        }
        }catch(IOException e){}
    }
    
    public void mostrarFotoPortatil()
    {
        mostrarLista();
        System.out.println("Selecciona el dispositivo para ingresar a su galeria: ");
        try{
        int id = Integer.parseInt(bf.readLine());
        for(Portatil p: arrayPortatiles)
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
    
    public void copiarTextoPortatil()
     {
         mostrarLista();
         System.out.println("Selecciona el dispositivo que va a copiar el texto: ");
        try{
            try{
        int id = Integer.parseInt(bf.readLine());
           
        for(Portatil p: arrayPortatiles)
        {
            if(id == p.getIdDispositivo() && p.getEncendido().equals("SI"))
            {
                copiarTexto(p.getIdDispositivo(),p.getNombreDelDispositivo());    
            }
        }
         }catch(NumberFormatException ex){}
        }catch(IOException e){}
     }
    
    public void pegarTextoPortatil()
    {
        mostrarLista();
        System.out.println("Selecciona el dispositivo en el que vas pegar el texto: ");
        try{
            try{
                int id = Integer.parseInt(bf.readLine());
                for(Portatil p: arrayPortatiles)
                {
                    if(id == p.getIdDispositivo() && p.getVisibilidad().equalsIgnoreCase("SI") && p.getEncendido().equals("SI"))
                    {
                        pegarTexto();
                    }
                }
            }catch(NumberFormatException ex){}
        }catch(IOException e){}
    }
    
    public void compartirDocumentoPortatil()
    {
        try{
        System.out.println("Escribe el nombre del documento que vas a compartir : ");
        String nombreDocumento = bf.readLine();
        
        mostrarListaVisibles();
        System.out.println("Selecciona el dispositivo al que se le va a compartir el documento.: ");
        int idDestino = Integer.parseInt(bf.readLine());
        
        System.out.println("Selecciona el dispositivo que va a compartir el documento : ");
        mostrarListaVisibles();
        int idOrigen = Integer.parseInt(bf.readLine());
        
        for(Portatil p: arrayPortatiles)
        {
            if(idOrigen == p.getIdDispositivo())
            {
                for(Portatil p1: arrayPortatiles)
                {
                    if(idDestino == p1.getIdDispositivo())
                    {
                        crearDocumento(p.getNombreDelDispositivo(), p1.getNombreDelDispositivo(),
                                p.getIdDispositivo(), nombreDocumento);
                    }
                }
            }
        }
        /*******/
        }catch(IOException e){}
        
    }
    
     public void mostrarDocumentosPortatil()
    {
        mostrarLista();
        System.out.println("Selecciona el dispositivo para ingresar a sus documentos compartidos : ");
        try{
        int id = Integer.parseInt(bf.readLine());
        for(Portatil p: arrayPortatiles)
        {
            if(p.getIdDispositivo() == id)
            {
                for(Documento f: arrayDocumentos)
                {
                    if(f.getIdDispositivo() == id )
                    {
                        System.out.println("***************************************************************");
                        System.out.println("Nombre del documento : " + f.getNombreDocumento());
                        System.out.println("Compartido desde: " + f.getnombreDispositivoOrigen());
                        System.out.println("Dispositivo Actual : " + f.getNombreDispositivoDestino());
                        System.out.println("***************************************************************");
                    }
                }
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
