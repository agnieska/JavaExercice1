import java.awt.*;

/**
 * Created by Agnieszka on 28/01/17.
 */
public class LifeGarage  {


    public static void main(String[] args) {

        // PREMIERE PARTIE

        Car car1 = new Car("Renault   ", Color.RED, 999.9F);

        System.out.println(car1.toString());


        Garage garage1 = new Garage("Simplon");

        Car car2 = new Car("Peugeot   ", Color.GREEN, 800.60F);
        Car car3 = new Car("Volkswagen", Color.BLUE, 1000.1F);
        Car car4 = new Car("Reanult   ", Color.RED, 700.80F);

        garage1.getList().addElement(car1);
        garage1.getList().addElement(car2);
        garage1.getList().addElement(car3);
        garage1.getList().addElement(car4);

        System.out.println();
        System.out.println(garage1.toString());

        /* // DEUXIEME PARTIE

        Bike bike1 = new Bike ("Harley    ", Color.RED, 800F);
        Bike bike2 = new Bike ("Ducati    ", Color.BLUE, 1000F);
        Bike bike3 = new Bike ("Bmw       ", Color.GREEN, 1999.9F);

        garage1.getList().add(bike1);
        garage1.getList().add(bike2);
        garage1.getList().add(bike3);


        System.out.println(garage1.toString());
*/

    }





}
