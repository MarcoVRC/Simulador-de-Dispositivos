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
        /**
        * 
        * MENU PRINCIPAL DE ACCIONES CON DISPOSITIVOS
        */
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
                    System.out.println("6. Acciones hechas por dispositivos ");
                    System.out.println("   "+"Escriba Salir Si Lo Desea");
                    opcion=dato.readLine();
                    switch(opcion){
                        case "1":
                            elegirAccionPortatil();
                            break;
                        case "2":
                        elegirAccionTablet();        
                            break;
                        case"3":
                        elegirAccionReloj();    
                            break;
                        case"4":
                            elegirAccionPhone();     
                            break;
                        case"5":
                    
                            break;
                        case"6":
                            elegirAccionMostrar();
                            break;
                    }
                }while (!opcion.toLowerCase().equals("salir"));
            }catch(IOException e){}
        }
        
        /**
        * 
        * MENU DE PORTATILES PARA REALIZAR ACCIONES CON LOS DISPOSITIVOS PORTATILES.
        */
        
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
                ManejoComputadoraPortatil.getInstancia().copiarTextoPortatil();
                    break;
                case"3":
                ManejoComputadoraPortatil.getInstancia().pegarTextoPortatil();    
                    break;
                case"4":
                   
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
        }
        
        /**
        * 
        * MENU DE TABLETS PARA REALIZAR ACCIONES CON TABLETS.
        */
        
        public void elegirAccionTablet(){
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
                    ManejoTablet.getInstancia().capturarFotoTablet();
                    break;
                
                case "2":
                    ManejoTablet.getInstancia().copiarTextoTablet();
                    break;
                case"3":
                    ManejoTablet.getInstancia().pegarTextoTablet();
                    break;
                case"4":
                   
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	} 
        
        /**
        * 
        * MENU DE SMARTWATCHS PARA REALIZAR ACCIONES CON SMARTWATCHS.
        */
        
        public void elegirAccionReloj(){
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
                    ManejoSmartWatch.getInstancia().capturarFotoReloj();
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
        
        /**
        * 
        * MENU DE SMARTPHONES PARA REALIZAR ACCIONES CON LOS DISPOSITIVOS SMARTPHONE.
        */
        
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
                ManejoSmartPhone.getInstancia().copiarTextoPhone();
                    break;
                case"3":
                ManejoSmartPhone.getInstancia().pegarTextoPhone();
                    
                    break;
                case"4":
                    
                    break;
                case"5":
                    
                    break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
        
        /**
        * 
        * MENU DE DISPOSITIVOS MUESTRA LAS ACCIONES REALIZADAS POR LOS DISPOSITIVOS.
        */
        
        public void elegirAccionMostrar(){
            try{
                String opcion = "";
                do{
                    System.out.println(" "); 
                    System.out.println("       "+"-----ACCIONES HECHAS POR DISPOSITIVOS-----");
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
                            mostrarAccionPortatil();
                            break;
                        case "2":
                        mostrarAccionTablet();    
                            break;
                        case"3":
                        mostrarAccionReloj();    
                            break;
                        case"4":
                        mostrarAccionPhone();    
                            break;
                        case"5":
                    
                            break;
                    }
                }while (!opcion.toLowerCase().equals("salir"));
            }catch(IOException e){}
        }
        
        /**
        * 
        * "MENU DE MOSTRAR ACCIONES DE PORTATILES" PARA MOSTRAR LAS ACCIONES REALIZADAS POR LOS DISPOSITIVOS PORTATILES.
        */
        
        public void mostrarAccionPortatil(){
        try{
                String opcion = "";
                do{
                    System.out.println(" "); 
                    System.out.println("       "+"-----ACCIONES HECHAS POR DISPOSITIVOS-----");
                    System.out.println("");
                    System.out.println("1. Galeria ");
                    System.out.println("2. Textos Copiados");
                    System.out.println("3. Pegar Texto");
                    System.out.println("4. Documentos Compartidos");
                    System.out.println("5. ");
                    System.out.println("   "+"Escriba Salir Si Lo Desea");
                    opcion=dato.readLine();
                    switch(opcion){
                        case "1":
                            ManejoComputadoraPortatil.getInstancia().mostrarFotoPortatil();
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
        
        /**
        * 
        * "MENU DE MOSTRAR ACCIONES DE TABLETS" PARA MOSTRAR LAS ACCIONES REALIZADAS POR LOS DISPOSITIVOS TABLETS.
        */
        public void mostrarAccionTablet(){
        try{
                String opcion = "";
                do{
                    System.out.println(" "); 
                    System.out.println("       "+"-----ACCIONES HECHAS POR DISPOSITIVOS-----");
                    System.out.println("");
                    System.out.println("1. Galeria ");
                    System.out.println("2. Textos Copiados");
                    System.out.println("3. Pegar Texto");
                    System.out.println("4. Documentos Compartidos");
                    System.out.println("5. ");
                    System.out.println("   "+"Escriba Salir Si Lo Desea");
                    opcion=dato.readLine();
                    switch(opcion){
                        case "1":
                            ManejoTablet.getInstancia().mostrarFotoTablet();
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
        
        /**
        * 
        * "MENU DE MOSTRAR ACCIONES DE SMARTWATCHS" PARA MOSTRAR LAS ACCIONES REALIZADAS POR LOS DISPOSITIVOS SMARTWATCHS.
        */
        
        public void mostrarAccionReloj(){
        try{
                String opcion = "";
                do{
                    System.out.println(" "); 
                    System.out.println("       "+"-----ACCIONES HECHAS POR DISPOSITIVOS-----");
                    System.out.println("");
                    System.out.println("1. Galeria ");
                    System.out.println("2. Textos Copiados");
                    System.out.println("3. Pegar Texto");
                    System.out.println("4. Documentos Compartidos");
                    System.out.println("5. ");
                    System.out.println("   "+"Escriba Salir Si Lo Desea");
                    opcion=dato.readLine();
                    switch(opcion){
                        case "1":
                            ManejoSmartWatch.getInstancia().mostrarFotoReloj();
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
        
        /**
        * 
        * "MENU DE MOSTRAR ACCIONES DE SMARTWATCHS" PARA MOSTRAR LAS ACCIONES REALIZADAS POR LOS DISPOSITIVOS SMARTWATCHS.
        */
        
        public void mostrarAccionPhone(){
            try{
                String opcion = "";
                do{
                    System.out.println(" "); 
                    System.out.println("       "+"-----ACCIONES HECHAS POR DISPOSITIVOS-----");
                    System.out.println("");
                    System.out.println("1. Galeria ");
                    System.out.println("2. Textos Copiados");
                    System.out.println("3. Pegar Texto");
                    System.out.println("4. Documentos Compartidos");
                    System.out.println("5. ");
                    System.out.println("   "+"Escriba Salir Si Lo Desea");
                    opcion=dato.readLine();
                    switch(opcion){
                        case "1":
                            ManejoSmartPhone.getInstancia().mostrarFotoPhone();
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
