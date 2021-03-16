/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * tipo de dispositivo, numero de telefono, dispositivo asociado, correo electronico, nombre de dispositivo, visible

 * @author RC
 */
public class ManejoComputadoraPortatil{
  //  private String tipoDeDispositivo;
    private static ManejoComputadoraPortatil instancia;
    private ManejoComputadoraPortatil()
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
    private ArrayList<Portatil> dispositivos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int Id=1;
    public void crearDispositivo()
    {
       Portatil pc = new Portatil();
        System.out.println("Correo Electronico : ");
        String correo = sc.nextLine();
        System.out.println("Nombre del Dispositivo : ");
        String nombre = sc.nextLine();
        
        System.out.println("Visible Para Conexion : ");
        String visible = sc.nextLine();
        System.out.println(" Nota: El dispositivo esta encendido por defecto. " + "\n");
        String encendido = "SI";
        
        pc.setIdDispositivo(Id);
        pc.setCorreoElectronico(correo);
        pc.setNombreDelDispositivo(nombre);
        pc.setEncendido(encendido);
        pc.setVisibilidad(visible);
        dispositivos.add(pc);
        Id++;
    }
    
    public void mostrar()
    {
        
        for(Portatil d: dispositivos)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("TIPO DE DISPOSITIVO: " + d.getTipoDeDispositivo()+"\n");
            System.out.println("ENCENDIDO : " + d.getEncendido()+"\n");
            System.out.println("VISIBLE A LOS DEMAS : " + d.getVisibilidad());
            System.out.println("--------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------");
        }
    
    }
    
    public void modificar(int id)
    {
        int opcion=0;
        for(Portatil p: dispositivos)
        {
            if(p.getIdDispositivo() == id)
            {
                System.out.println("");
                switch(opcion)
                {
                    case 1:
                        
                         break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                
                }
            }
        }
    }
}
