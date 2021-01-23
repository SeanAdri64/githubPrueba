/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedSpecialInterface01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADRIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la tienda de guitarras Red Special");
        
        GuitarraAcustica Guitar=new GuitarraAcustica("ABC","Rojo",6 ,"Roble",true,"Metalicas","Curvas redondeadas") ;
        GuitarraElectroAcustica GuitarEA=new GuitarraElectroAcustica("ABCD","Azul",6 ,"Arce",true,"Curvas redondeadas",true ,"Acero Niquelado",true,true) ;
        GuitarraElectrica GuitarE=new GuitarraElectrica("ABCDE","Negro",6 ,"Nogal",true,"Larga y puntiaguda",false ,"Acero Niquelado",true,true) ;
        Guitarra GuitarEA2=new GuitarraElectroAcustica("ABCDEF","Azul",6 ,"Arce",true,"Curvas redondeadas",true ,"Acero Niquelado",true,true) ;
        BajoElectrico Bass=new BajoElectrico("A5","Morado",6 ,"Roble",true,"Metalicas","Curvas alargadas y puntiagudas") {} ;
        BajoElectrico.sonarBajoElectrico();
        Guitar.sonarGuitarraAcustica();
        GuitarE.sonarGuitarraElectrica();
        GuitarEA.sonarGuitarraElectroAcustica();
        
        
        System.out.println(Guitar.toString());
        System.out.println(GuitarEA.toString());
        System.out.println(GuitarE.toString());
        //Guitar.cambiarCuerdas();
        GuitarE.amplificar();
        List<Guitarra> ListaGuitarras = new ArrayList<Guitarra>();
        
        SalonGuitarra salon= new SalonGuitarra();
        GuitarraAcustica guitarraParaAgregar=new GuitarraAcustica("fgi","Verde",6 ,"Roble",true,"Metalicas","Curvas redondeadas") ;
        System.out.println("A continuacion se agregaran 2 Guitarras Acústicas,1 Eléctrica, una electroacústica y un bajo a la colección del salon Guitarra Red Special:");
        salon.agregarGuitarra(Guitar);
        salon.agregarGuitarra(GuitarEA);
        salon.agregarGuitarra(GuitarE);

        salon.agregarGuitarra(Bass);
        salon.agregarGuitarra(guitarraParaAgregar);
        System.out.println("Las guitarras y el bajo se han agregado");
        System.out.println("Ingresa el serial de la guitarra o bajo deseado: ");
        String serialIntroducido = sc.nextLine();
        System.out.println(salon.obtenerGuitarra(serialIntroducido));
        System.out.println("Ahora veamos todas las guitarras que tenemos:");
        System.out.println(salon.toString());

        
        
    }
    public static void CrearGuitarraAcustica() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el color:");
        String colorSeleccinado = sc.nextLine();
        System.out.println("Selecciona el tipo de madera:");
        String TipoDeMaderaSeleccionada = sc.nextLine();
        
        GuitarraAcustica Guitar=new GuitarraAcustica("A1",colorSeleccinado,6 ,TipoDeMaderaSeleccionada,true,"Metalicas","Curvas redondeadas") {
            @Override
            public void tocar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void afinar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void sonar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }  ;
        System.out.println(Guitar.toString());
        
   
    }
    
    public static void CrearGuitarraElectroAcustica() {
         Scanner sc = new Scanner(System.in);
        String colorSeleccinadoEA = sc.nextLine();
        String TipoDeMaderaSeleccionadaEA = sc.nextLine();
        GuitarraElectroAcustica GuitarEA=new GuitarraElectroAcustica("A2",colorSeleccinadoEA,6 ,TipoDeMaderaSeleccionadaEA,true,"Curvas redondeadas",true ,"Acero Niquelado",true,true) {

            @Override
            public void tocar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void afinar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void sonar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }  ;
        System.out.println(GuitarEA.toString());
        
   
    }
    public static void CrearGuitarraElectrica() {
        Scanner sc = new Scanner(System.in);
        String colorSeleccinadoE = sc.nextLine();
        String TipoDeMaderaSeleccionadaE = sc.nextLine();
        GuitarraElectrica GuitarEA=new GuitarraElectrica("A3",colorSeleccinadoE,6 ,TipoDeMaderaSeleccionadaE,true,"Larga y puntiaguda",false ,"Acero Niquelado",true,true) {

            @Override
            public void tocar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void afinar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void sonar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }  ;
        System.out.println(GuitarEA.toString());
        
   
    }
        
    
   
   
        
 }


    
