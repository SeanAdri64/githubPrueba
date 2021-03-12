/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.edu.jpa.vista;

import java.util.Scanner;
import konrad.edu.jpa.controlador.CiudadBusinessController;
import konrad.edu.jpa.controlador.PersonaBusinessController;
//import konrad.edu.jpa.modelo.Ciudad;
import konrad.edu.jpa.modelo.Persona;
/**
 *
 * @author ADRIAN
 */
public class PersonaView {

    private PersonaBusinessController personaLogica = new PersonaBusinessController();
    
    public void mostrarMenuPersona(){
        System.out.println("**** BIENVENIDO A LA ENTIDAD CIUDAD*****");
        System.out.println("");
        System.out.println("Elija la accion a realizar");
        System.out.println("1. Crear Persona");
        System.out.println("2. Actualizar Persona");
        System.out.println("3. Borrar Persona");
        System.out.println("4. Consultar todas las Persona");
        
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        
        switch(opcion){
            case "1":
                crearPersona();
                break;
            case "2":
                
                break;
            case "3":
               
                break;
            case "4":
                
                break;
            default:
                mostrarMenuPersona();
        }
        
    }
    
    public void crearPersona(){
        
        System.out.println("**** Bienvenido a la creacion de una Persona*****");
        System.out.println("");
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id de la Persona :");
        int idUsuario= sc.nextInt();
        Persona nuevaPersona = new Persona();
        nuevaPersona.setId(idUsuario);     
        int tipoDocumento= sc.nextInt();
        String nombrePersona= sc.nextLine();
        
        
        
        System.out.println("Escriba los nombres de la persona");
        nuevaPersona.setNombres(nombrePersona);
        System.out.println("Escriba los apellidos de la persona");
        nuevaPersona.setApellidos(nombrePersona);
        System.out.println("Digite el tipo de documento de la persona 1.CC 2.TI 3.CE ");
        nuevaPersona.getTipoDocumento();
      //nuevaPersona.setFechaNacimiento(fechaNacimiento);
        System.out.println("Escriba la ciudad donde vive de la persona");
        nuevaPersona.setCiudadNacimiento(nuevaCiudad);
       
        personaLogica.createPersona(nuevaPersona);
        
        
        
        System.out.println("Persona creada exitosamente");
    }
    /*
   public void actualizarCiudad(){
        Scanner sc =new Scanner(System.in);
        System.out.println("<<<<<<<< Bienvenido a la Actualizacion de una ciudad >>>>>>>>");
               
        System.out.println("Escriba el nuevo nombre de la ciudad");
       
        String ciudadAct= sc.nextLine();
        System.out.println("Escriba el Id de la ciudad a actualizar");   
        int ciudad = sc.nextInt();
        Ciudad nuevaCiudad= new Ciudad();
        nuevaCiudad.setId(ciudad); //mira el id
        nuevaCiudad.setNombre(ciudadAct); //guarda la nueva ciudad 
        ciudadLogica.updateCiudad(nuevaCiudad); // actualiza
       
        System.out.println("La Ciudad se actualizo satisfactoriamente");
   }
    
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
   }    */ 
}
 