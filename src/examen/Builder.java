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
public abstract class Builder {
    protected App app;
    public App getApp(){
        return app;
    }
    
    public void creatApp(){
        app = new App() {};
    }
    
    abstract void builderJuego();
    abstract void builderFitness();
    abstract void builderIdiomas();
    abstract void builderMusica();
    
}
