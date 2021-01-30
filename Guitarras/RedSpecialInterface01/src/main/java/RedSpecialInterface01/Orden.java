/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedSpecialInterface01;

/**
 *
 * @author ADRIAN
 */
public abstract class Orden  {

    //double precioFinal;
    @Override
    public String toString() {
        return "Orden{" + "guitarCompra=" + guitarCompra.toString() + ", precioFin=" + precioFin + '}';
    }
    //SalonGuitarra salon;
    Guitarra guitarCompra;
    double precioFin;
    public Orden(Guitarra guitarCompra,double precioFin) {
        this.guitarCompra=guitarCompra;
        this.precioFin=precioFin;
    }
    /*
    public double getPrecioFinal() {
        return precioTotal;
    }

    public void setPrecioFinal(double descuento,int precio) {
        
        this.precioFinal = precio-(precio*descuento);
    }

    public void EliminarDeInventario(SalonGuitarra salon){
        
    }
*/
}
