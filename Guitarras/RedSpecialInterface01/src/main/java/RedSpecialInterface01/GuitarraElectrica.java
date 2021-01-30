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
public  class GuitarraElectrica extends Guitarra{

    @Override
    public String toString() {
        return "GuitarraElectrica{" + "microfono=" + microfono + ", cajaDeResonancia=" + cajaDeResonancia + ", ConexionARedElectrica=" + ConexionARedElectrica + ", pastillas=" + pastillas + '}';
    }
    
    boolean microfono=true;
    boolean cajaDeResonancia=false;
    boolean ConexionARedElectrica=true;
    boolean pastillas=true;
    public boolean isMicrofono() {
        return microfono;
    }
    public  GuitarraElectrica(String serial,int precio,double descuento,double precioTotal,String color,int NumeroDeCuerdas ,String TipoDeMadera,boolean microfono,String TipoDeCuerpo,boolean cajaDeResonancia,String tipodeCuerdas, boolean ConexionARedElectrica,boolean pastillas) {

        super(serial,precio,descuento,precioTotal,color,NumeroDeCuerdas,TipoDeMadera,cajaDeResonancia,tipodeCuerdas,TipoDeCuerpo);
        
        this.TipoDeCuerpo="Sólido y puntiagudo";
        
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = 3000000;
    }


    public boolean obtenerConexionARedElectrica() {
        return ConexionARedElectrica;
    }

    public boolean obtenerPastillas() {
        return pastillas;
    }
    
    public boolean obtenerMicrofono() {
        return microfono;
    }
    public void amplificar(){
        System.out.println("El sonido ha sido amplificado");
    }
    public  void efecto(){
        System.out.println("La guitarra esta ahciendo un efecto de sonido");
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
    public static void sonarGuitarraElectrica() {
        System.out.println("La guitarra eléctrica esta sonando ");
        System.out.println("Brian May estaria orgulloso...");
    }
}
