package NagaPractice.com;
import java.util.ArrayList;
 class InheritanceClass extends AbstactExg {
     ArrayList<String> cars = new ArrayList<String>();



     public void abstractMethod() {
         cars.add("BMW");
         cars.add("Benz");
         cars.add("LandRover");
         System.out.println(cars);

     }
 }
