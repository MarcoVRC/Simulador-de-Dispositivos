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
public class MenuCrear {
     private static final MenuCrear Instancia = new MenuCrear();
	private BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        
	private MenuCrear(){
	}
	public static MenuCrear getInstancia() {
	return Instancia;
	}
	
	public void elegirOpcion(){
         try{   
	String opcion = "";
	do{
	
	System.out.println("\n" + "-----CREAR DISPOSITIVO-----");
	System.out.println("\n" + "1. Computadora Portatil ");
	System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. SmartPhone");
        System.out.println("5. Auriculares Inalambricos");
	System.out.println("   "+"Escriba Salir Si Lo Desea");
	
	opcion=dato.readLine();
	
	switch(opcion){
		case "1":
                    ManejoComputadoraPortatil.getInstancia().crearDispositivo();	
                        break;
                case "2":
                    ManejoTablet.getInstancia().crearDispositivo();
                    break;
                case"3":
                    
                    break;
                case"4":
                    ManejoSmartPhone.getInstancia().crearDispositivo();
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
}
