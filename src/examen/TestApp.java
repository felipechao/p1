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
public class TestApp {
    public static void main(String[] args) {
        Director d = new Director();
        d.setBuilder(new AppBuilder());
        d.buildApp();
        App miJuego = d.getApp();
        System.out.println("el juego es:" + miJuego.getJuegos().getName());
    }
}
