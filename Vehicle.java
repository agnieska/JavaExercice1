import java.awt.*;

/**
 * Created by Agnieszka on 28/01/17.
 */
public abstract class Vehicle {



                                    // ATRIBUTES
    protected String brand;
    protected Color color;
    protected float prix;



                                    // CONSTRUCTOR
    public          Vehicle         (String brand, Color color, float prix) {
                                                                                this.brand = brand;
                                                                                this.color = color;
                                                                                this.prix = prix;
                                                                            }
                                    // TO STRING
    public String    toString()                                             {
                                                                                return "Vehicle {" +
                                                                                        " brand :" + brand +
                                                                                        ", color :" + color +
                                                                                        ", prix HT :" + prix +
                                                                                        '}';
                                                                            }

                                    // OTHER METHODS
    public abstract float getPriceWithTax();



} //
