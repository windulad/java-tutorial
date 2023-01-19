import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Map cars = new HashMap();
        cars.put("BMW",3);
        cars.put("Audi",2);
        cars.put("Mercedes",5);
        cars.put("Honda",7);
        cars.put("Mustang",1);

        System.out.println(cars);
    }
}