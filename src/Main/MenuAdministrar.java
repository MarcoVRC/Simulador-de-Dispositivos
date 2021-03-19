/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author RC
 */
public class MenuAdministrar {
    private static final MenuAdministrar Instancia = new MenuAdministrar();
	private BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        
	private MenuAdministrar(){
	}
	public static MenuAdministrar getInstancia() {
	return Instancia;
	}
	
	public void administar(){
         try{   
	String opcion = "";
	do{
	System.out.println(" "); 
	System.out.println("       "+"-----ADMINISTRAR DISPOSITIVOS-----");
	System.out.println("");
	System.out.println("1. Computadora Portatil ");
	System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. SmartPhone");
        System.out.println("5. Auriculares Inalambricos");
	System.out.println("   "+"Escriba Salir Si Lo Desea");
	
	opcion=dato.readLine();
	
	switch(opcion){
		case "1":
                ManejoComputadoraPortatil.getInstancia().administrarPortatil();
                    break;
                
                case "2":
                ManejoTablet.getInstancia().administrarTablet();
                    break;
                case"3":
                    
                    break;
                case"4":
                     ManejoSmartPhone.getInstancia().administrarSmartPhone();
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
}
