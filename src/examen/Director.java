/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Escuela
 */
public class Director {
    Builder builder;
    public void setBuilder (Builder builder){
        this.builder = builder;
    }
    public App getApp(){
        return builder.getApp();
    }
    
    public void buildApp(){
    builder.creatApp();
    builder.buildJuegos();
    builder.buildFitness();
    builder.buildIdiomas();
    builder.buildMusica();
}
}
