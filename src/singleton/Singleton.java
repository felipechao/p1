
package singleton;


public class Singleton {
    private Singleton(){
        
    }
public static Singleton getInstance (){
    if (singleton != null){
    } 
    else {
        singleton = new Singleton();
    }
   return singleton;
    }
        
 
 private static Singleton singleton; 
}
