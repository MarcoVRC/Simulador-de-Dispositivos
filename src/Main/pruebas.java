/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RC
 */
public class pruebas {
    private static final String separador=",";
    
 public void leerArchivo(){
     BufferedReader buffer = null;
     
     try{
         buffer = new BufferedReader(new FileReader("dispositivos.csv"));
         String linea = buffer.readLine();
         while(null != linea)
         {
             String [] fields = linea.split(separador);
             System.out.println(Arrays.toString(fields));
            linea = buffer.readLine();
         }
     }catch(IOException e){}
     
 
 }
}
