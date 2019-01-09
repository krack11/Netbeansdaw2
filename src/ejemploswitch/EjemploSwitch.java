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
public class EjemploSwitch {

    //Escribir un programa que nos permita pulsar una opcion 1,2,3,4,5, y que nos muestre un texto en funcion de la opcion pulsada.
    //El programa se repetira hasta que pulsemos 0.
    
    public static void anadirdatos(){
        
    }
    public static void borrardatos(){
        
    }
    public static void modificardatos(){
        
    }
    public static void listardatos(){
        
    }

    public static void main(String[] args) {
        System.out.println("MENU DE SELECCION");
        System.out.println("1 - Añadir datos");
        System.out.println("2 - Borrar datos");
        System.out.println("3 - Modificar datos");
        System.out.println("4 - Listar datos");
        System.out.println("Pulsa opción. 0 Salir del programa");
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numerito no más: ");
        int numerito = teclado.nextInt();
        
        switch (numerito){
            
            case 1:
                System.out.println("Has dicho añadir datos");
                break;
            case 2:
                System.out.println("Has dicho borrar datos");
                break;
            case 3:
                System.out.println("Has dicho modificar datos");
                break;
            case 4:
                System.out.println("Has dicho listar datos");
                break;
            case 0:
                System.out.println("Has dicho salir del programa");
                break;
            default:
                System.out.println("No sabes pulsar una teclaxd");
        }          
    }
        
    }
    

