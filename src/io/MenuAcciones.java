/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author RC
 */
public class MenuAcciones {
     private static final MenuAcciones Instancia = new MenuAcciones();
	private BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        
	private MenuAcciones(){
	}
	public static MenuAcciones getInstancia() {
	return Instancia;
	}
	
	public void elegirAccion(){
         try{   
	String opcion = "";
	do{
	System.out.println(" "); 
	System.out.println("       "+"-----ACCIONES CON DISPOSITIVOS-----");
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
               elegirAccionPortatil();
                    break;
                
                case "2":
                
                    break;
                case"3":
                    
                    break;
                case"4":
                elegirAccionPhone();     
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
        
        public void elegirAccionPortatil(){
         try{   
	String opcion = "";
	do{
	System.out.println(" "); 
	System.out.println("       "+"-----ACCIONES CON DISPOSITIVOS-----");
	System.out.println("");
	System.out.println("1. Tomar Fotografia ");
	System.out.println("2. Copiar Texto");
        System.out.println("3. Pegar Texto");
        System.out.println("4. Compartir Documentos");
        System.out.println("5. Reproducir Musica");
	System.out.println("   "+"Escriba Salir Si Lo Desea");
	
	opcion=dato.readLine();
	
	switch(opcion){
		case "1":
                    ManejoComputadoraPortatil.getInstancia().capturarFotoPortatil();
                    break;
                
                case "2":
                
                    break;
                case"3":
                    
                    break;
                case"4":
                    ManejoSmartPhone.getInstancia().capturarFotoPhone();
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
        
        public void elegirAccionPhone(){
         try{   
	String opcion = "";
	do{
	System.out.println(" "); 
	System.out.println("       "+"-----ACCIONES CON DISPOSITIVOS-----");
	System.out.println("");
	System.out.println("1. Tomar Fotografia ");
	System.out.println("2. Copiar Texto");
        System.out.println("3. Pegar Texto");
        System.out.println("4. Compartir Documentos");
        System.out.println("5. Reproducir Musica");
	System.out.println("   "+"Escriba Salir Si Lo Desea");
	
	opcion=dato.readLine();
	
	switch(opcion){
		case "1":
                   ManejoSmartPhone.getInstancia().capturarFotoPhone();
                    break;
                
                case "2":
                
                    break;
                case"3":
                    
                    break;
                case"4":
                    
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
}
