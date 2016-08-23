/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


public class AirbusBuilder extends Builder{

    @Override
    void buildAlas() {
       Alas a = new Alas();
       a.setHiper (0);
       a.setMarca("wingstop");
       a.setSpoiler(2333);
       a.setNumSerie(233);
    }

    @Override
    void buildMotor() {
        Motor m = new Motor();
        m.setNumSerie(123);
        m.setPotencia(10000);
        avion.setMotor(m);
    }

    @Override
    void buildNumSerie() {
        avion.setNumeroSerie(223);
        
    }

    @Override
    void buildModelo() {
        avion.setModelo("a380");
    }
    
    
    
}
