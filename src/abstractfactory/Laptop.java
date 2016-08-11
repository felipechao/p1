
package abstractfactory;

public class Laptop extends Computadora {

    @Override
    public void configurar() {
     System.out.println("configando Laptop");
    }

    @Override
    public void ensamblar() {
        System.out.println("Ensamblando Laptop");
    }

    @Override
    public void instsoft() {
        System.out.println("Instalando software de Laptop");
    }

    @Override
    public void embalar() {
        System.out.println("Emblamando Laptop");
    }
    
    
}
