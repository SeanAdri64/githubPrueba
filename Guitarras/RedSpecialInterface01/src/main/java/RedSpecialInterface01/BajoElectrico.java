/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedSpecialInterface01;

/**
 *
 * @author ADRIAN
 */
public abstract class BajoElectrico extends Guitarra{

    public BajoElectrico(String serial, String color, int NumeroDeCuerdas, String TipoDeMadera, boolean cajaDeResonancia, String tipoDeCuerdas, String TipoDeCuerpo) {
        super(serial, color, NumeroDeCuerdas, TipoDeMadera, cajaDeResonancia, tipoDeCuerdas, TipoDeCuerpo);
    }

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
    public static void sonarBajoElectrico(){
        System.out.println("El Bajo Eléctrico esta sonando");
        System.out.println("John Deacon tiene un apunte al respecto");
    } 
    public String toString() {
        return "Bajo{" + "color=" + color + ", NumeroDeCuerdas=" + NumeroDeCuerdas + ", TipoDeMadera=" + TipoDeMadera + ", cajaDeResonancia=" + cajaDeResonancia + ", tipodeCuerdas=" + tipoDeCuerdas + ", TipoDeCuerpo=" + TipoDeCuerpo + '}';
    }
    
}
