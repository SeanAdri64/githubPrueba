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
public  class GuitarraElectroAcustica extends Guitarra {
    
    boolean microfono;
    boolean cajaDeResonancia;
    boolean ConexionARedElectrica;
    boolean pastillas;
    
    public  GuitarraElectroAcustica(String serial,String color,int NumeroDeCuerdas ,String TipoDeMadera,boolean microfono,String TipoDeCuerpo,boolean cajaDeResonancia,String tipodeCuerdas, boolean ConexionARedElectrica,boolean pastillas) {
        super(serial,color,NumeroDeCuerdas,TipoDeMadera,cajaDeResonancia,tipodeCuerdas,TipoDeCuerpo);
        //this.microfono=true;
        this.TipoDeCuerpo="curvas redondeadas";
    }

    @Override
    public String toString() {
        return "GuitarraElectroAcustica{" + "microfono=" + microfono + ", cajaDeResonancia=" + cajaDeResonancia + ", ConexionARedElectrica=" + ConexionARedElectrica + ", pastillas=" + pastillas + '}';
    }
    public boolean obtenerMicrofono() {
        return microfono;
    }

    public boolean obtenerCajaDeResonancia() {
        return cajaDeResonancia;
    }

    public boolean obtenerConexionARedElectrica() {
        return ConexionARedElectrica;
    }

    public boolean obtenerPastillas() {
        return pastillas;
    }


    public void establecerMicrofono(String TipoDeMadera) {
        this.microfono = true;
    }
    public void amplificar(){
        System.out.println("El sonido ha sido amplificado");
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
    public static void sonarGuitarraElectroAcustica(){
        System.out.println("La guitarra Electroacústica esta sonando");
    }
}
