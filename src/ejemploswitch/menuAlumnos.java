/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class menuAlumnos {
    
    
    
    public static void añadir(String[]alumnos){
        
        int nAlumno =util.Util.leerInt("Introduce el numero de lista: ");
        
        if(nAlumno>=0 && nAlumno<alumnos.length){
            String alumnito = util.Util.leerStr("Introduce el nombre del alumno: ");
            alumnos[nAlumno]=alumnito;
            System.out.println("Alumno añadido");
        }
   
    }
    
    public static void borrar(String[]alumnos){
        
        int nAlumno =util.Util.leerInt("Introduce el numero del alumno a borrar: ");
        
        if(nAlumno>=0 && nAlumno<alumnos.length){
            alumnos[nAlumno]="";
            System.out.println("Alumno: "+nAlumno+" Borrado");
        }
    }
    
    public static void modificar(String[]alumnos){
        int nAlumno = util.Util.leerInt("Introduce el numero del alumno a modificar: ");
        
        if(nAlumno>=0 && nAlumno<alumnos.length){
            alumnos[nAlumno]=util.Util.leerStr("Escribe el nuevo nombre del alumno: ");
            System.out.println("Alumno " +nAlumno+" Modificado");
        }
    }
    
    public static void listar(String[]alumnos){
        System.out.println("LISTADO DE TODOS LOS ALUMNOS");
        
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i]!=null){
                System.out.println("Nº " + i + " Alumno: " + alumnos[i]);
            }
        }
    }
    
    public static void consultar(String[]alumnos){
        String alumnito = util.Util.leerStr("Escribe el nombre del alumno: ");
        int buscar=util.Util.buscar(alumnito, alumnos);
        if(buscar==-1)buscar=0;
        System.out.println("El alumno " +alumnos[buscar]+" esta en la posicion " +buscar);
      
    }
    
    public static void ordenar(String[]alumnos){
        util.Util.ordenarStr(alumnos);
    }
    
    
    
    public static void menu(String[]alumnos){
        boolean salir= false;
        while(!salir){
        System.out.println("MENU NOTAS ALUMNOS");
        System.out.println("Pulsa 1. Para añadir un alumno");
        System.out.println("Pulsa 2. Para borrar un alumno");
        System.out.println("Pulsa 3. Para modificar un alumno");
        System.out.println("Pulsa 4. Para listar todos los alumnos");
        System.out.println("Pulsa 5. Para consultar un alumno");
        System.out.println("Pulsa 6. Para ordenar la lista");
        System.out.println("Pula 0. Para salir del menu");
        
        
        int opcion= util.Util.leerInt("Introduce la opcion del menu: ");
        
        switch(opcion){
            case 1:
                añadir(alumnos);
                break;
            case 2:
                borrar(alumnos);
                break;
            case 3:
                modificar(alumnos);
                break;
            case 4:
                listar(alumnos);
                break;
            case 5:
                consultar(alumnos);
                break;
            case 6:
                ordenar(alumnos);
                break;
            case 0:
                salir=true;
                break;
            default:
                System.out.println("Opcion incorrecta prueba de nuevo");
            
        
        }
        
        }
   
    }
    
    
    
    public static void main(String[] args) {
        String[]alumnos=new String[30];
        menu(alumnos);
    }
    
}
