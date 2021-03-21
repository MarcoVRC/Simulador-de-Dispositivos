/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import procesador.Procesador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author RC
 */
public class ManejoArchivo {
    private static ManejoArchivo instancia;
    private ManejoArchivo()
    {}
    public static ManejoArchivo getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoArchivo();
        }
        return instancia;
    }
    private  static BufferedReader bufferedReader = null;
    private  static BufferedReader bufferedReader1 = new BufferedReader (new InputStreamReader(System.in));
    private static File file;
    private static FileInputStream inputStream;
   
    
    public  BufferedReader buscarArchivo(String ruta){
        try {
            file = new File(ruta);
            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            }catch (FileNotFoundException ex) 
            {
                
            }
        
        return bufferedReader;
    }
	
    public  void leerArchivo() {

	String ruta = "";
	
        
	do{
            System.out.println("*************************************");
            System.out.println("* ESCRIBA LA RUTA DEL ARCHIVO			* ");
            System.out.println("*************************************\n");
            System.out.println("  " + "Escriba salir si lo desea \n");

		try{
                    ruta = bufferedReader1.readLine();
                    if(!ruta.toLowerCase().equals("salir"))
                    {
                    BufferedReader bf = buscarArchivo(ruta);
                        
                       String linea= "";
                        while ((linea = bf.readLine()) != null)
                        {
                           Procesador.getInstancia().procesarAccion(linea);
                        }
                        bf.close();
                   
                    } else { break;	}
                     
		} catch (IOException ex) {}
	} while (true);
    }
}
