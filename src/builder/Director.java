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
public class Director {
    Builder builder;
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    Avion getAvion(){
        return builder.getAvion();
    }
    
    
    public void buildAvion(){
        builder.createAvion();
        builder.buildAlas();
        builder.buildMotor();
        builder.buildModelo();
        builder.buildNumSerie();
        
        
    }
}
