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
 * @author RC
 */


public class ManejoSmartPhone extends ManejoDispositivo{
    private static ManejoSmartPhone instancia;
    private ManejoSmartPhone()
    {
    }
    
    public static ManejoSmartPhone getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoSmartPhone();
        }
        return instancia;
    }
    
    private ArrayList<SmartPhone> telefonos = new ArrayList<>();
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private int Id=1;
    
    
    @Override
    public SmartPhone crearDispositivo()
    {
     SmartPhone phone = new SmartPhone();
      try{
        System.out.println("Correo Electronico : ");
        String correo = bf.readLine();
        System.out.println("Nombre del Dispositivo : ");
        String nombre = bf.readLine();
        System.out.println("Numero del Dispositivo : ");
        int numero = Integer.parseInt(bf.readLine());
        System.out.println("Visible Para Conexion : ");
        String visible = bf.readLine();
        System.out.println(" Nota: El dispositivo esta encendido por defecto. " + "\n");
        
        phone.setIdDispositivo(Id);
        phone.setCorreoElectronico(correo);
        phone.setNombreDelDispositivo(nombre);
        phone.setNumero(numero);
        phone.setEncendido(encendido);
        phone.setVisibilidad(visible.toUpperCase());
        telefonos.add(phone);
        Id++;
        }catch(IOException e){ System.out.println("Entrada invalida!");}
        return phone;
    }
    
    public void administrarSmartPhone(){
      
        System.out.println("---------------------" + "SmartPhones" +"------------------------");
        for(SmartPhone d: telefonos)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("TELEFONO : " + d.getNumero()+"\n");
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
            int numero;
            int respuesta;

            for(SmartPhone p: telefonos)
            {
                if(id == p.getIdDispositivo())
                {
                    System.out.println("---------------------Administracion de Computadoras Portatiles------------------------");
                    System.out.println("1. Editar correo electronico ");
                    System.out.println("2. Editar nombre del dispositivo ");
                    System.out.println("3. Editar Numero de Telefono ");
                    System.out.println("4. Apagar visibilidad del dispositivo ");
                    System.out.println("5. Apagar el dispositivo ");
                    System.out.println("--------------------------------------------------------------------------------" + "\n");
                    System.out.println("Seleccione la propiedad a editar : ");

                    System.out.println("Correo Y Nombre : " + p.getCorreoElectronico() + "  , " + p.getNombreDelDispositivo() + " "); 
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
                        System.out.println("Escribe el nuevo NUMERO del dispositivo");
                        numero = Integer.parseInt(bf.readLine());
                        p.setNumero(numero);
                            break;
                        case 4:
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
                            
                        case 5:
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
    
    public Boolean verificar(String correo)
    {
        for(SmartPhone s: telefonos)
        {
            if(s.getCorreoElectronico().equals(correo) & s.getEncendido().equals("SI"))
            {
                return true;
            }
        }
        return false;
    }
}	
    

