/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Escuela
 */
public abstract class Builder {

    public Avion getAvion() {
        return avion;
    }
    protected Avion avion;
   
    public void createAvion(){
        avion = new Avion ();
    }


    abstract void buildAlas();
    abstract void buildMotor();
    abstract void buildNumSerie();
    abstract void buildModelo();
    


}
