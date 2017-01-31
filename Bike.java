/**
 * Created by Agnieszka on 28/01/17.
 */
public class Bike extends Vehicle
{

                                                        // CONSTRUCTOR

    public          Bike        (String brand, Color color, float prix)
                                                        {
                                                            super(brand, color, prix);
                                                        }


                                                        // GETTERS & SETTERS
    public String   getBrand()                          { return brand; }
    public void     setBrand(String brand)              { this.brand = brand;}
    public Color    getColor()                          {  return color; }
    public void     setColor(Color color)               {  this.color = color; }
    public float    getPrix()                           {  return prix;}
    public void     setPrix(float prix)                 {  this.prix = prix; }


                                                        // TO STRING
    public String   toString()
                                                        {
                                                            return super.toString()+ " prix TTC :"+ this.getPriceWithTax() +" Type : Bike";
                                                        }


                                                        // METHODS
    public  float   getPriceWithTax()                   {
                                                            return super.prix + 1;
                                                        }




} //
