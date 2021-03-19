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
public class ManejoTablet extends ManejoDispositivo{
    private static ManejoTablet instancia;
    private ManejoTablet()
    {
    
    }
    public static ManejoTablet getInstancia()
    {
        if(instancia == null)
        {
            instancia = new ManejoTablet();
        }
        return instancia;
    }
    private ArrayList<Tablet> tablets = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int Id=1;
    
    public void crearTablet()
    {
        Dispositivo d = crearDispositivo();
        Tablet tablet = new Tablet();
        tablet.setIdDispositivo(d.getIdDispositivo());
        tablet.setCorreoElectronico(d.getCorreoElectronico());
        tablet.setNombreDelDispositivo(d.getNombreDelDispositivo());
        tablet.setVisibilidad(d.getVisibilidad());
        tablet.setEncendido(d.getEncendido());
           tablets.add(tablet);
    }
    
    public void administrarTablet(){
        Tablet tablet = new Tablet();
       
       ArrayList<Dispositivo> myArrayList = castArrayList(tablets);
       administrarDispositivo(myArrayList, tablet.getTipoDeDispositivo());
    }	
    
    public static <Dispositivo, Tablet> ArrayList<Dispositivo> castArrayList(ArrayList<Tablet> list){
    ArrayList<Dispositivo> newlyCastedArrayList = new ArrayList<Dispositivo>();
    for(Tablet listObject : list){
        newlyCastedArrayList.add((Dispositivo)listObject);
    }
    return newlyCastedArrayList;
    }
}
