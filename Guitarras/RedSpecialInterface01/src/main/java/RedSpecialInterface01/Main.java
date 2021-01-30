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
    public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CarritoDeCompras Carro= new CarritoDeCompras();
        SalonGuitarra salon= new SalonGuitarra();
        /*
        System.out.println("Bienvenido a la tienda de guitarras Red Special");
        System.out.println("A continuación ingrese una opción:");
        System.out.println("1.Comprar Guitarra");
        System.out.println("2.Agregar Guitarra al inventario");
     */

        Main menu = new Main();
        menu.desplegarMenu(Carro,salon);
    }//main

     private void ejecutarOpcion(int opcionSeleccionada,Scanner sc,CarritoDeCompras Carro,SalonGuitarra salon){
            switch (opcionSeleccionada) {
                 
            case 1:
                
                System.out.println("Ingreso a la opción 1: Comprar Guitarra");
                System.out.println("Tenemos tres tipos de guitarras,selecciona la de tu interés:");
                System.out.println("1.Acústica");
                System.out.println("2.Electroacústica");
                System.out.println("3.Eléctrica");
                System.out.println("4.Bajo eléctrico");
                int opcionSeleccionada02 = Integer.parseInt(sc.nextLine());
                comprarGuitarra(salon,Carro );
                
                break;
            case 2:
                System.out.println("Ingreso a la opción 2:Agregar Guitarra al inventario");
                System.out.println(" Seleccionar tipo de guitarra:");
                System.out.println("Tenemos tres tipos de guitarras,selecciona la de tu interés:");
                System.out.println("1.Acústica");
                System.out.println("2.Electroacústica");
                System.out.println("3.Eléctrica");
                System.out.println("4.Bajo eléctrico");
                int opcionSeleccionada03 = Integer.parseInt(sc.nextLine());
                
                switch (opcionSeleccionada03) {
                    case 1:
                        CrearGuitarraAcustica(salon);
                    break;
                    case 2:
                        CrearGuitarraElectroAcustica(salon);
                    break;
                    case 3:
                         CrearGuitarraElectrica(salon);
                    break;
                    case 4:
                        CrearBajo(salon);
                        break;
                }
                break;
            case 3:           
                System.out.println();
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                System.exit(0);
                break;
             }

        
    }
            public void desplegarMenu(CarritoDeCompras Carro,SalonGuitarra salon) {
        //EXCEPTION 5.1
        Scanner sc = new Scanner(System.in);
        try{
                System.out.println("Bienvenido a la tienda de guitarras Red Special");
                System.out.println("A continuaci\"ón ingrese una opción:");
                System.out.println("1.Comprar Guitarra");
                System.out.println("2.Agregar Guitarra al inventario");
            System.out.print("Ingrese la opciòn: ");
            int opcionSeleccionada = Integer.parseInt(sc.nextLine());
            ejecutarOpcion(opcionSeleccionada,sc,Carro,salon);
            //desplegarMenu();
        }catch(NumberFormatException exception51){
            System.out.println(exception51.toString());
            //desplegarMenu();
        }finally{
            desplegarMenu(Carro,salon);
        }

       
        }//switch
        /*
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
        GuitarraAcustica guitarraParaAgregar=new GuitarraAcustica("fgi",1000000,0.15,8000000,"Verde",6 ,"Roble",true,"Metalicas","Curvas redondeadas") ;
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
*/
        
        
        
    
    public static void CrearGuitarraAcustica(SalonGuitarra salon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el color:");
        String colorSeleccinado = sc.nextLine();
        System.out.println("Selecciona el tipo de madera:");
        String TipoDeMaderaSeleccionada = sc.nextLine();
        int precioAcustica=1000000;
        double descuentoAcustica=0.15;
        double Total=PrecioTotal(precioAcustica,descuentoAcustica);
        GuitarraAcustica Guitar=new GuitarraAcustica("A1",precioAcustica,descuentoAcustica,Total,colorSeleccinado,6 ,TipoDeMaderaSeleccionada,true,"Metalicas","Curvas redondeadas") {
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
        salon.agregarGuitarra(Guitar);
        
   
    }
    public static double PrecioTotal(int precio, double descuento){
        double precioTotal = precio-(precio*descuento);
        return precioTotal;
    }
    public static void CrearGuitarraElectroAcustica(SalonGuitarra salon) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Selecciona el color:");
        String colorSeleccinadoEA = sc.nextLine();
        System.out.println("Selecciona el tipo de madera:");
        String TipoDeMaderaSeleccionadaEA = sc.nextLine();
        int precioElectroAcustica=2000000;        
        double descuentoElectroAcustica=0.15;
        double Total=PrecioTotal(precioElectroAcustica,descuentoElectroAcustica);
        
        GuitarraElectroAcustica GuitarEA=new GuitarraElectroAcustica("A2",precioElectroAcustica,descuentoElectroAcustica,Total,colorSeleccinadoEA,6 ,TipoDeMaderaSeleccionadaEA,true,"Curvas redondeadas",true ,"Acero Niquelado",true,true) {

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
        salon.agregarGuitarra(GuitarEA);
   
    }
    public static void CrearGuitarraElectrica(SalonGuitarra salon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el color:");
        String colorSeleccinadoE = sc.nextLine();
        System.out.println("Selecciona el tipo de madera:");
        String TipoDeMaderaSeleccionadaE = sc.nextLine();
        int precioElectrica=3000000;        
        double descuentoElectrica=0.15;
        double Total=PrecioTotal(precioElectrica,descuentoElectrica);
        GuitarraElectrica GuitarE=new GuitarraElectrica("A3",precioElectrica,descuentoElectrica,Total,colorSeleccinadoE,6 ,TipoDeMaderaSeleccionadaE,true,"Larga y puntiaguda",false ,"Acero Niquelado",true,true) {

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
        System.out.println(GuitarE.toString());
        salon.agregarGuitarra(GuitarE);
        
   
    }
        public static void CrearBajo(SalonGuitarra salon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el color:");
        String colorSeleccinadoE = sc.nextLine();
        System.out.println("Selecciona el tipo de madera:");
        String TipoDeMaderaSeleccionadaE = sc.nextLine();
        int precioBajo=3500000;        
        double descuentoBajo=0.15;
        double Total=PrecioTotal(precioBajo,descuentoBajo);
        BajoElectrico Bass=new BajoElectrico("A5",precioBajo,descuentoBajo,Total,"Morado",6 ,"Roble",true,"Metalicas","Curvas alargadas y puntiagudas")  {

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
        System.out.println(Bass.toString());
        salon.agregarGuitarra(Bass);
   
    }
    public static void comprarGuitarra(SalonGuitarra salon01,CarritoDeCompras Carrito ){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el serial de la Guitarra que desea comprar:");
        String serial= sc.nextLine();
        Guitarra guitarraCompra=salon01.obtenerGuitarra(serial);
        salon01.eliminarGuitarra(guitarraCompra);
        double PrecioFinal=guitarraCompra.getPrecioTotal();
        Orden ordenActual=new Orden( guitarraCompra ,PrecioFinal) {};
        Carrito.agregarOrden(ordenActual);
        System.out.println("El carrito de compras con sus ordenes es el siguiente:");
        System.out.println(Carrito.toString());
        System.out.println("Desea realizar la compra?");
        System.out.println("1.Si");
        System.out.println("2.No");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        if(opcionSeleccionada==1){
            System.out.println("Compra realizada con \"éxito");
        }else{
            System.out.println("Usted cancelo la compra");
        }
        //int respuesta= sc.nextLine();
    }  
        
    
   //
   
        
}//


    



