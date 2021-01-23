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
public   class GuitarraAcustica extends Guitarra{
    
    //boolean cajaDeResonancia=true;
    public  GuitarraAcustica(String serial,String color,int NumeroDeCuerdas ,String TipoDeMadera,boolean cajaDeResonancia,String tipodeCuerdas,String TipoDeCuerpo) {
        super( serial,color,NumeroDeCuerdas,TipoDeMadera,cajaDeResonancia,tipodeCuerdas,TipoDeCuerpo);
        //this.TipoDeCuerpo="curvas redondeadas";
       

    }
    public String toString() {
        return "Guitarra{" + "color=" + color + ", NumeroDeCuerdas=" + NumeroDeCuerdas + ", TipoDeMadera=" + TipoDeMadera + ", cajaDeResonancia=" + cajaDeResonancia + ", tipodeCuerdas=" + tipoDeCuerdas + ", TipoDeCuerpo=" + TipoDeCuerpo + '}';
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
    public static void sonarGuitarraAcustica(){
        System.out.println("La guitarra acústica esta sonando");
        System.out.println("A Johnny Cash le gusta como suena eso");
    }
}
