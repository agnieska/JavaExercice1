import java.awt.*;

/**
 * Created by Agnieszka on 28/01/17.
 */
public class Car extends Vehicle

{

    //PREMIERE PARTIE
  /* private String brand;
   private Color color;
   private float prix;



                                                         // CONSTRUCTOR

    public        Car    (String brand, Color color, float prix)
                                                        {
                                                            this.brand = brand;
                                                            this.color = color;
                                                            this.prix = prix;
                                                        }
*/


    public          Car   (String brand, Color color, float prix)
                                                        {
                                                            super(brand, color, prix);
                                                        }


                                                        /*
                                                        GETTERS/ SETTERS
                                                         */
    public String   getBrand()                          { return brand; }
    public void     setBrand(String brand)              { this.brand = brand;}
    public Color    getColor()                          { return color; }
    public void     setColor(Color color)               { this.color = color; }
    public float    getPrix()                           { return prix;}
    public void     setPrix(float prix)                 { this.prix = prix; }


                                                        // TO STRING

  /*  public String    toString()                         {
                                                            return "Car {" +
                                                                    "brand :" + brand +
                                                                    ", color :" + color +
                                                                    ", prix :" + prix +
                                                                    '}';
                                                        }
                                                        */
   public String   toString()
                                                        {
                                                            return super.toString()+ " prix TTC :"+ this.getPriceWithTax() +" Type : Car";
                                                        }

                                                        // OTHER METHODS
    public  float getPriceWithTax()
                                                        {
                                                            return this.prix + 2;
                                                        }



}
