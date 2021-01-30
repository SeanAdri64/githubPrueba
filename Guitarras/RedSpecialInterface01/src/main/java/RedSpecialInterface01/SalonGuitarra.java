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
    public class SalonGuitarra {
    List<Guitarra> guitarras;
    
    public SalonGuitarra(){
        guitarras = new ArrayList<Guitarra>(); 
        /*
        tipo de guitarra
        precio final
        agregara orden
        eliminar del inventario
        */
        
    }

    public List<Guitarra> getGuitarras() {
        return guitarras;
    }

    public void setGuitarras(List<Guitarra> Guitarras) {
        this.guitarras = Guitarras;
    }
    public Guitarra  obtenerGuitarra(String serial) {
        
        for (int i = 0; i < guitarras.size(); i++) {
   
            if(guitarras.get(i).getSerial().equalsIgnoreCase(serial)){
                return guitarras.get(i);
            }
        }
        return null;
        
        
    }
    public  void agregarGuitarra(Guitarra guitar) {
        guitarras.add(guitar);
    }
    public  void eliminarGuitarra(Guitarra guitar) {
        guitarras.remove(guitar);
    }

    
    public String toString() {
        String vacio="";
        for (int j = 0; j < guitarras.size(); j++) {
            vacio=vacio+ "SalonGuitarra{" + "guitarras=" + guitarras.get(j).toString() + '}';
            
        }
        return vacio;
    }
    
}