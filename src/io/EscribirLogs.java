/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author RC
 */
public class EscribirLogs {
    
    public void escribir(){
    String titulo = "";
   
    FileWriter filewriter = null;
    PrintWriter printw = null;
       
 try{
     filewriter = new FileWriter("logs.html");//declarar el archivo
     printw = new PrintWriter(filewriter);//declarar un impresor
           
     printw.println("<html>");
     printw.println("<head><title> LOGS </title></head>");
     printw.println("<body bgcolor=\"#FFFFFF\">");
     printw.println("<center><h1><font color=\"navy\">"+ titulo +"</font></h1></center>");
     printw.println("<center><h4><TABLE BORDER><TR><TH>" + "TIPO DE ACCION" + "</TH> <TH>" + "ORIGEN" + "</TH> <TH>Head3</TH></TR>"
             + "<TR><TD>A</TD> <TD>B</TD> <TD>C</TD></TR><TR><TD>D</TD> <TD>E</TD> <TD>F</TD></TR></TABLE></h4></center>");
     printw.println("</body>");
     printw.println("</html>");
     printw.close();
           
     System.out.println("Generado exitosamente");
}catch(IOException e){}
    }
}
