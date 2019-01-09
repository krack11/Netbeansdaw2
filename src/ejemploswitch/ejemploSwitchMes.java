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
public class ejemploSwitchMes {

    //Escribir un metodo que reciba un numero del mes, y nos devuelva el nombre del mes.
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("MENU DE SELECCION");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero del mes: (0 para salir) ");
        int numerito = teclado.nextInt();
        
        switch (numerito){
            
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            case 0:
                System.out.println("SALIIIIIR AAAAAAA");
                break;
            default:
                System.out.println("NUMERO MAL");
        }
        
    }
    
}
