/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.edu.jpa.vista;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MenuView {
    
        public void mostrarMenu(){
        System.out.println("**** BIENVENIDO *****");
        System.out.println("");
        System.out.println("Elija la entidad a gestionar");
        System.out.println("1. Tipo de documento");
        System.out.println("2. Ciudad");
        System.out.println("3. Persona");
        
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        
        switch(opcion){
            case "1":
                break;
            case "2":
                CiudadView ciudadView = new CiudadView();
                ciudadView.mostrarMenuCiudad();
                break;
            case "3":
                break;
            default:
                mostrarMenu();
        }
        
    }
    

}
