/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedSpecialInterface01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADRIAN
 */
public class CarritoDeCompras {
    
    List<Orden> ordenes;
    
    public CarritoDeCompras(){
        ordenes = new ArrayList<Orden>(); 
    }

    public  void agregarOrden(Orden orden01) {
        ordenes.add(orden01);
    }
    public  void eliminarOrden(Orden orden01) {
        ordenes.remove(orden01);
    }

    
    public String toString() {
        String vacio="";
        for (int j = 0; j < ordenes.size(); j++) {
            vacio=vacio+ "CarritoDeCompras{" + "ordenes=" + ordenes.get(j).toString() + '}';
            
        }
        return vacio;
    }
}
//