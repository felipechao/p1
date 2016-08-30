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
public class AppBuilder extends Builder {
    
    void BuilderJuegos(){
        
        Juegos juegos = new Juegos ();
        juegos.setMemoria (20);
        juegos.setName ("GoW");
        juegos.setTipo ("Accion");
        app.setJuegos (juegos);
    }

    @Override
    void builderJuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void builderFitness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void builderIdiomas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void builderMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
