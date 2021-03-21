/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import bean.Dispositivo;
import bean.Foto;
import bean.Texto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author RC
 */
public class ManejoDispositivo {
    private static ManejoDispositivo instancia;
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    protected  ArrayList<Foto> arrayFotos = new ArrayList<>();
    protected ArrayList<Texto> arrayTexto = new ArrayList<>();
    private String textoCopiado="";
    protected String encendido="SI";
    private int idFoto=1;
    private int idTexto=1;
   public ManejoDispositivo()
    {
       /* if(!arrayFotos.isEmpty())
        {
        idFoto = arrayFotos.get(arrayFotos.size()-1).+1;
        }*/
        if(!arrayTexto.isEmpty())
        {
        idTexto = arrayTexto.get(arrayTexto.size()-1).getIdTexto()+1;
        }
    }
    
    public static ManejoDispositivo getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoDispositivo();
        }
        return instancia;
    }
    
    
    public Dispositivo crearDispositivo()
    {
        Dispositivo dispositivo = new Dispositivo();
        try{
        System.out.println("Correo Electronico : ");
        String correo = bf.readLine();
        System.out.println("Nombre del Dispositivo : ");
        String nombre = bf.readLine();
        System.out.println("Visible Para Conexion : ");
        String visible = bf.readLine();
        System.out.println(" Nota: El dispositivo esta encendido por defecto. " + "\n");
       
        dispositivo.setCorreoElectronico(correo);
        dispositivo.setNombreDelDispositivo(nombre);
        dispositivo.setEncendido(encendido);
        dispositivo.setVisibilidad(visible.toUpperCase());
       
        }catch(IOException e){ System.out.println("Entrada invalida!");}
        return dispositivo;
    }
    
    public void administrarDispositivo(ArrayList<Dispositivo> array, String ds){
        
        
        System.out.println("---------------------" + ds +"------------------------");
        for(Dispositivo d: array)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("ENCENDIDO : " + d.getEncendido()+"\n");
            System.out.println("VISIBLE A LOS DEMAS : " + d.getVisibilidad());
            System.out.println("--------------------------------------------------------------------");
        }
       
        
        try{
            System.out.println("Seleccione el dispositivo para administrar : ");
            int id = Integer.parseInt(bf.readLine());
            int opcion;
            String correo;
            String nombre;
            String visible;
            int respuesta;

            for(Dispositivo p: array)
            {
                if(id == p.getIdDispositivo())
                {
                    System.out.println("---------------------Administracion de Dispositivos------------------------");
                    System.out.println("1. Editar correo electronico ");
                    System.out.println("2. Editar nombre del dispositivo ");
                    System.out.println("3. Apagar visibilidad del dispositivo ");
                    System.out.println("4. Apagar el dispositivo ");
                    System.out.println("--------------------------------------------------------------------------------" + "\n");
                    System.out.println("Seleccione la propiedad a editar : ");

                    System.out.println("Correo : " + p.getCorreoElectronico() + "  , " + "Nombre : " + p.getNombreDelDispositivo() + " "); 
                    opcion = Integer.parseInt(bf.readLine());

                    switch(opcion){
                        case 1:
                            //Editar Correo
                        System.out.println("Escribe el nuevo CORREO del dispositivo");
                        correo = bf.readLine();
                        p.setCorreoElectronico(correo);
                            break;
                    
                        case 2:
                            //Editar Nombre
                        System.out.println("Escribe el nuevo NOMBRE del dispositivo");
                        nombre = bf.readLine();
                        p.setNombreDelDispositivo(nombre);
                            break;
                        case 3:
                            //Apagar visibilidad
                        if(p.getVisibilidad().toUpperCase().equals("SI"))
                        {
                            System.out.println("Actualmente el dispositivo es VISIBLE a los demas\n" 
                                    + "Desear hacer NO visible el dispositivo?\n" + "1. SI \n "+ "2. NO ");
                            respuesta = Integer.parseInt(bf.readLine());
                            if(respuesta == 1 )
                            {
                                visible="NO";
                                p.setVisibilidad(visible);
                                System.out.println("Se guardaron los cambios. Ahora el dispositivo NO es VISIBLE ");
                            }else if(respuesta == 2)
                                    {
                                        System.out.println("No se modifico la VISIBILIDAD del dispositivo." +
                                                "El dispositivo continua " + p.getEncendido());
                                    }
                           //Encender Visibilidad
                        } else if(p.getVisibilidad().toUpperCase().equals("NO"))
                        {
                            System.out.println("Actualmente el dispositivo NO es VISIBLE a los demas\n" 
                                    + "Desear hacer VISIBLE el dispositivo?\n" + "1 si\n "+ "2 no");
                            respuesta = Integer.parseInt(bf.readLine());
                            if(respuesta == 1)
                            {
                                visible="SI";
                                p.setVisibilidad(visible);
                                System.out.println("Se guardaron los cambios. Ahora el dispositivo es VISIBLE");
                            }else if(respuesta == 2)
                                    {
                                        System.out.println("No se modifico la VISIBILIDAD del dispositivo." +
                                                "El dispositivo continua " + p.getEncendido());
                                    }
                        }
                            break;
                            
                        case 4:
                            //Apagar Dispositivo
                            
                            if(p.getEncendido().equals("SI"))
                        {
                            System.out.println("Actualmente el dispositivo esta ENCENDIDO \n" 
                                    + "Desear APAGAR el dispositivo?\n" + "1. SI \n "+ "2. NO ");
                            respuesta = Integer.parseInt(bf.readLine());
                            if(respuesta == 1 )
                            {
                                encendido ="NO";
                                p.setEncendido(encendido);
                                System.out.println("Se guardaron los cambios. Ahora el dispositivo ESTA APAGADO. ");
                            }else if(respuesta == 2)
                                    {
                                        System.out.println("No se modifico el estado del dispositivo." +
                                                "El dispositivo continua " + p.getEncendido());
                                    }
                           //Encender Dispositivo
                            
                        } else if(p.getEncendido().equals("NO"))
                        {
                            System.out.println("Actualmente el dispositivo ESTA APAGADO \n" 
                                    + "Desear ENCENDER el dispositivo?\n" + "1. Si\n "+ "2. No");
                            respuesta = Integer.parseInt(bf.readLine());
                            if(respuesta == 1)
                            {
                                visible="SI";
                                p.setEncendido(encendido);
                                System.out.println("Se guardaron los cambios. Ahora el dispositivo ESTA ENCENDIDO");
                            }else if(respuesta == 2)
                                    {
                                        System.out.println("No se modifico el estado del dispositivo." +
                                                "El dispositivo continua " + p.getEncendido());
                                    }
                        }
                            break;
                    }
                   break;
                }

            }
        }catch(IOException e){ System.out.println("Entrada invalida!"); }
    }
    
    public String tomarFoto(String correo, String tipoDispositivo, String nombreDispositivo, int id)
    {
        Foto foto = new Foto();
        if(ManejoSmartPhone.getInstancia().verificar(correo) == true)
        {
            try
            {
                System.out.println("Escribe el nombre de la foto. ");
                String nombreFoto = bf.readLine();
                foto.setNombreFoto(nombreFoto);
                foto.setTipoDispositivo(tipoDispositivo);
                foto.setNombreDispositivo(nombreDispositivo);
                foto.setIdDispositivo(id);
                arrayFotos.add(foto);
            }catch(IOException e){}
            
            }else{System.out.println("El dispositivo no esta vinculado con este correo para tomar la Fotografia.");}
           return "Error!";
    }

    public void  copiarTexto(int idDispositivo, String nombreDispositivo)
    {
        Texto texto = new Texto();
        try
        {
            System.out.println("Escribe el texto que deseas copiar ");
            textoCopiado = bf.readLine();
            texto.setIdDispositivo(idDispositivo);
            texto.setIdTexto(idTexto);
            texto.setNombreDispositivo(nombreDispositivo);
            texto.setTextoCopiado(textoCopiado);
            arrayTexto.add(texto);
            idTexto++;
        }catch(IOException e){}
    }
    
     public void pegarTexto()
     {
        for(Texto t: arrayTexto)
        {
            System.out.println("Ultimo texto copiado, por el dispositivo es : " + t.getNombreDispositivo() 
                    + " " + t.getTextoCopiado());
        }
        
     }
   
}

