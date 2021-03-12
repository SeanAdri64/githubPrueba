/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.edu.jpa.vista;

import java.util.Scanner;
import konrad.edu.jpa.controlador.CiudadBusinessController;
import konrad.edu.jpa.modelo.Ciudad;

/**
 *
 * @author LENOVO
 */
public class CiudadView {
    
    private CiudadBusinessController ciudadLogica = new CiudadBusinessController();
    
    public void mostrarMenuCiudad(){
        System.out.println("**** BIENVENIDO A LA ENTIDAD CIUDAD*****");
        System.out.println("");
        System.out.println("Elija la accion a realizar");
        System.out.println("1. Crear ciudad");
        System.out.println("2. Actualizar ciudad");
        System.out.println("3. Borrar ciudad");
        System.out.println("4. Consultar todas las ciudades");
        
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        
        switch(opcion){
            case "1":
                crearCiudad();
                break;
            case "2":
                actualizarCiudad();
                break;
            case "3":
                borrarCiudad();
                break;
            case "4":
                break;
            default:
                
        }
        
    }
    
    public void crearCiudad(){
        
        System.out.println("**** BIENVENIDO A LA CREACION DE UNA CIUDAD*****");
        System.out.println("");
        System.out.println("Escriba el nombre");

        Scanner sc = new Scanner(System.in);
        String nombreCiudad = sc.nextLine();
        
        Ciudad nuevaCiudad = new Ciudad();
        nuevaCiudad.setNombre(nombreCiudad);

        ciudadLogica.createCiudad(nuevaCiudad);
        
        System.out.println("CIUDAD CREADA EXITOSAMENTE");
    }/*
    public void EliminarCiudad(){
        
        System.out.println("**** BIENVENIDO A LA ELIMINACION DE UNA CIUDAD*****");
        System.out.println("");
        
        System.out.println("Escriba el nombre de la ciudad que desea borrar");
        Scanner sc = new Scanner(System.in);
        String nombreCiudad = sc.nextLine();
        String nombreCiudad = sc.nextLine();
        
        Ciudad nuevaCiudad = ();

        ciudadLogica.deleteCiudad(nuevaCiudad);
        
        System.out.println("CIUDAD ELIMINADA EXITOSAMENTE");
    }*/
     public void borrarCiudad(){
       Scanner sc =new Scanner(System.in);
        System.out.println("<<<<<<<< Bienvenido a la Eliminación de una ciudad >>>>>>>>");
        System.out.println("");
        // System.out.println("prueba1");
        Ciudad nuevaCiudad2= new Ciudad();
        System.out.println("Escriba el nombre de la ciudad a eliminar");
        String nombreCiudad2 = sc.nextLine();
        System.out.println("Escriba el Id de la ciudad a eliminar");     
        int ciudad = sc.nextInt();
        
        //System.out.println("PRUEBA2");
        nuevaCiudad2.setId(ciudad);
        nuevaCiudad2.setNombre(nombreCiudad2);
        //System.out.println("prueba3");
        ciudadLogica.deleteCiudad(nuevaCiudad2);
        
        System.out.println("La Ciudad se Elimino satisfactoriamente");
   }    
     public void actualizarCiudad(){
        Scanner sc =new Scanner(System.in);
        System.out.println("<<<<<<<< Bienvenido a la Actualizacion de una ciudad >>>>>>>>");
               
        System.out.println("Escriba el nuevo nombre de la ciudad");
       
        String ciudaAct= sc.nextLine();
        System.out.println("Escriba el Id de la ciudad a actualizar");   
        int ciudad = sc.nextInt();
        Ciudad nuevaCiudad= new Ciudad();
        nuevaCiudad.setId(ciudad); //mira el id
       

        nuevaCiudad.setNombre(ciudaAct); //guarda la nueva ciudad 
        ciudadLogica.updateCiudad(nuevaCiudad); // actualiza
       
        System.out.println("La Ciudad se actualizo satisfactoriamente");
   }
}
//