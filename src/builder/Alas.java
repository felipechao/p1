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
public class Alas {
   protected String marca;
    int numSerie;
    int hiper;
    int spoiler;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getHiper() {
        return hiper;
    }

    public void setHiper(int hiper) {
        this.hiper = hiper;
    }

    public int getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(int spoiler) {
        this.spoiler = spoiler;
    }

    void SetNumeroSerie(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMarcas(String windstores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNumSerie(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
