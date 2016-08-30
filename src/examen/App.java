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
public abstract class App {

    public Juegos getJuegos() {
        return juegos;
    }

    public void setJuegos(Juegos juegos) {
        this.juegos = juegos;
    }

    public Fitness getFitness() {
        return Fitness;
    }

    public void setFitness(Fitness Fitness) {
        this.Fitness = Fitness;
    }

    public Idiomas getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(Idiomas Idiomas) {
        this.Idiomas = Idiomas;
    }

    public Musica getMusica() {
        return Musica;
    }

    public void setMusica(Musica Musica) {
        this.Musica = Musica;
    }
    private Juegos juegos;
    private Fitness Fitness;
    private Idiomas Idiomas;
    private Musica Musica;
}
