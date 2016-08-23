
package builder;


public class BoingBuilder extends Builder {

    @Override
    void buildAlas() {
        Alas alas = new Alas();
        alas.setHiper(5);
        alas.setMarcas("windstores");
        alas.SetNumeroSerie(123344);
        avion.setAlas(alas);
        
    }

    @Override
    void buildMotor() {
        Motor motor = new Motor ();
        avion.setNumeroSerie (12344);
        avion.setPotencia (1233);
        avion.setMotor (motor);
    }

    @Override
    void buildNumSerie() {
    avion.setNumeroSerie (13232);    
    }

    @Override
    void buildModelo() {
        avion.setModelo ("747");
    }
    
    
    
}
