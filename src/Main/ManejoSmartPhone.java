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


public class ManejoSmartPhone {
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
    private Scanner sc = new Scanner(System.in);
    private int Id=1;
    
    public void crearDispositivo()
    {
       SmartPhone telefono = new SmartPhone();
        System.out.println("Correo Electronico : ");
        String correo = sc.nextLine();
        System.out.println("Nombre del Dispositivo : ");
        String nombre = sc.nextLine();
        System.out.println("Numero De Telefono : ");
        int numero = sc.nextInt();
        
        System.out.println("Visible Para Conexion : ");
        String visible = sc.nextLine();
        System.out.println(" Nota: El dispositivo esta encendido por defecto. " + "\n");
        String encendido = "SI";
        
        telefono.setIdDispositivo(Id);
        telefono.setCorreoElectronico(correo);
        telefono.setNombreDelDispositivo(nombre);
        telefono.setNumero(numero);
        telefono.setEncendido(encendido);
        telefono.setVisibilidad(visible);
        telefonos.add(telefono);
        Id++;
    }
    
    public void mostrar()
    {
        
        for(SmartPhone d: telefonos)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID : " + d.getIdDispositivo()+"\n");
            System.out.println("CORREO DEL DISPOSITIVO : " + d.getCorreoElectronico()+"\n");
            System.out.println("NOMBRE DEL DISPOSITIVO : " + d.getNombreDelDispositivo()+"\n");
            System.out.println("NUMERO DE TELEFONO : " + d.getNumero()+"\n");
            System.out.println("TIPO DE DISPOSITIVO: " + d.getTipoDeDispositivo()+"\n");
            System.out.println("ENCENDIDO : " + d.getEncendido()+"\n");
            System.out.println("VISIBLE A LOS DEMAS : " + d.getVisibilidad());
            System.out.println("--------------------------------------------------------------------");
        }
    
    }
    
    public void modificar(int id)
    {
        
    }
}

