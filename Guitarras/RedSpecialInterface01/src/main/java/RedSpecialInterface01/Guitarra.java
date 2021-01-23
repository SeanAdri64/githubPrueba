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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
public abstract class Guitarra {
    String color;
    int NumeroDeCuerdas ;
    String TipoDeMadera;
    boolean cajaDeResonancia;
    String tipoDeCuerdas;
    String TipoDeCuerpo;

    String serial;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public  Guitarra(String serial,String color,int NumeroDeCuerdas ,String TipoDeMadera,boolean cajaDeResonancia,String tipoDeCuerdas,String TipoDeCuerpo) {
                        
        this.color=color;
        this.TipoDeCuerpo=TipoDeCuerpo;
        this.TipoDeMadera=TipoDeMadera;
        this.cajaDeResonancia=cajaDeResonancia;
        this.tipoDeCuerdas=tipoDeCuerdas;
        this.NumeroDeCuerdas=NumeroDeCuerdas;
        this.serial=serial;
    }
    public abstract void tocar();
    public abstract void afinar();
    public abstract void sonar();
    //public  void cambiar cuerdas();
}

