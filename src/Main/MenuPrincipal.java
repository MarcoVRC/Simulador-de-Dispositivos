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
public class MenuPrincipal {
    private static final MenuPrincipal Instancia=
	new MenuPrincipal();
	private BufferedReader dato = 
	new BufferedReader(new InputStreamReader(System.in));
	private MenuPrincipal(){
	}
	public static MenuPrincipal getInstancia() {
	return Instancia;
	}
	
	public void elegirOpcion(){
	String opcion = "";
        try{
	do{
	System.out.println(" "); 
	System.out.println("       "+"-----ECOSISTEMA DE DISPOSITIVOS-----");
	System.out.println("");
	System.out.println("1. Crear Dispositivo ");
	System.out.println("2. Administrar Dispositivo");
        System.out.println("3. Acciones con Dispositivos");
        System.out.println("4. Acciones externas con dispositivos");
        System.out.println("5. Carga Masiva");
        System.out.println("6. Logs");
	System.out.println("   "+"Escriba Salir Si Lo Desea");
	
	opcion=dato.readLine();
	
	switch(opcion){
		case "1":
			MenuCrear.getInstancia().elegirOpcion();
		break;
		case "2":
			MenuAdministrar.getInstancia().administar();
			break;
		}
		}while (!opcion.toLowerCase().equals("salir"));
        }catch(IOException e){}
	}
}
