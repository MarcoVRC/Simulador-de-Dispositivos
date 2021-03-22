/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesador;

import io.ManejoSmartPhone;
import io.ManejoSmartWatch;
import io.ManejoTablet;
import io.ManejoComputadoraPortatil;

/**
 *
 * @author RC
 */
public class Procesador {
    	private static  Procesador instancia;
	private final String SEPARADOR = ",";
	private  Procesador()
	{
	}
        
	public static Procesador getInstancia()
	{
            if(instancia == null)
            {
            instancia = new Procesador();
            }
	return instancia;	
	}
        //tipo de dispositivo, numero de telefono, dispositivo asociado, correo electronico, nombre de dispositivo, visible
public void procesarAccion(String tipoDispositivo)
{
    String[] parts = tipoDispositivo.split(SEPARADOR);
    String dispositivo = parts[0];
      int posicion=1;
    
    switch(dispositivo.toUpperCase().trim())
    {
        case "COMPUTADORA PORTATIL":
           cargarPortatil(parts);
            break;
        case "SMARTPHONE":
            cargarPhone(parts);
            break;
        case"TABLET":
            cargarTablet(parts);
            break;
        case"SMARTWATCH":
            cargarReloj(parts);
            break;
    }        
    
}

public void cargarPortatil(String [] parts)
{
   String correo = parts[3];
    String nombre = parts[4];
    String visibilidad = parts[5];
    ManejoComputadoraPortatil.getInstancia().cargarPortatil(correo, nombre, visibilidad);
}

public void cargarPhone(String[] parts)
{
    
    String numero = parts[1];
    String correo = parts[3];
    String nombre = parts[4];
    String visible = parts[5];
    ManejoSmartPhone.getInstancia().cargarPhone( numero, correo, nombre, visible);		 
}

public void cargarTablet(String[] parts)
{
    String correo = parts[3];
    String nombre = parts[4];
    String visibilidad = parts[5];
    ManejoTablet.getInstancia().cargarTablet(nombre, correo, visibilidad);
}

public void cargarReloj(String[] parts)
{
    String correo = parts[3];
    String nombre = parts[4];
    String visibilidad = parts[5];
    ManejoSmartWatch.getInstancia().cargarReloj(correo, nombre, visibilidad);
}
}
