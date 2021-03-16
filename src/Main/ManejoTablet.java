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
 * @author RC
 */
public class ManejoTablet {
    private static ManejoTablet instancia;
    private ManejoTablet()
    {
    
    }
    public static ManejoTablet getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoTablet();
        }
        return instancia;
    }
    private ArrayList<Tablet> tablets = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int Id=1;
    public void crearDispositivo()
    {
       Tablet tablet = new Tablet();
        System.out.println("Correo Electronico : ");
        String correo = sc.nextLine();
        System.out.println("Nombre del Dispositivo : ");
        String nombre = sc.nextLine();
        
        System.out.println("Visible Para Conexion : ");
        String visible = sc.nextLine();
        System.out.println(" Nota: El dispositivo esta encendido por defecto. " + "\n");
        String encendido = "SI";
        
        tablet.setIdDispositivo(Id);
        tablet.setCorreoElectronico(correo);
        tablet.setNombreDelDispositivo(nombre);
        tablet.setEncendido(encendido);
        tablet.setVisibilidad(visible);
        tablets.add(tablet);
        Id++;
    }
    
    public void mostrar()
    {
        
        for(Tablet d: tablets)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("TIPO DE DISPOSITIVO: " + d.getTipoDeDispositivo()+"\n");
            System.out.println("ENCENDIDO : " + d.getEncendido()+"\n");
            System.out.println("VISIBLE A LOS DEMAS : " + d.getVisibilidad());
            System.out.println("--------------------------------------------------------------------");
        }
    
    }
}
