/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


public class TestBuilder {

    public static void main(String[] args) {
            Director d = new Director();
            d.setBuilder(new BoingBuilder());
            d.buildAvion();
            Avion miAvionBoing = d.getAvion();
            System.out.println("La marca de mi Avion: "); miAvionBoing.getMarca();
            
            d.setBuilder (new AirbusBuilder ());
            d.buildAvion();
            Avion miAirbus = d.getAvion();
       
            
            System.out.println("mi Nuevo avion es un " + miAirbus.getModelo());
            
    }
    
}
