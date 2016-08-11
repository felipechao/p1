
package abstractfactory;


public class Desktop {
    public class Laptop extends Computadora {

    @Override
    public void configurar() {
     System.out.println("configando Desktop");
    }

    @Override
    public void ensamblar() {
        System.out.println("Ensamblando Desktop");
    }

    @Override
    public void instsoft() {
        System.out.println("Instalando software de Desktop");
    }

    @Override
    public void embalar() {
        System.out.println("Emblamando Desktop");
    }
    
    
}
}
