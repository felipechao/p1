package singleton;
import java.util.Calendar;
import java.util.Date;

public class Clock {
    private Clock () {
    
}
public static Clock getInstance (){
    if (singleton != null){
    } 
    else {
        singleton = new Clock();
    }
   return singleton;
    }
private static Clock singleton; 

    public Date getTime(){
        
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println("La fecha y hora es");
        System.out.println(d.toString());
        return d;
    }
   

}
