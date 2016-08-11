
package abstractfactory;


public class Netbook {
    public class Laptop extends Computadora {

    @Override
    public void configurar() {
     System.out.println("configando Netbook");
    }

    @Override
    public void ensamblar() {
        System.out.println("Ensamblando Netbook");
    }

    @Override
    public void instsoft() {
        System.out.println("Instalando software de Netbook");
    }

    @Override
    public void embalar() {
        System.out.println("Emblamando Netbook");
    }
    
    
}
}
