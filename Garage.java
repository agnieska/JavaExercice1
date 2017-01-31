import java.util.ArrayList;
import java.util.*;

/**
 * Created by Agnieszka on 28/01/17.
 */
public class Garage {


                                // ATTRIBUTS
    private String nom;
    private Vector <Car> list;
    //private Vector <Vehicle> list;
    //private ArrayList <Car> list;
    // private ArrayList <Vehicle> list;



                                                // CONSTRUCTOR
    public      Garage          (String nom)
                                                                {
                                                                    this.nom = nom;
                                                                    list = new Vector<Car>();
                                                                    //list = new Vector<Vehicle>();
                                                                    //list = new ArrayList<Car>();
                                                                    //list = new ArrayList<Vehicle>();
                                                                }


                                                // GETTERS & SETTERS

    public String         getNom()                              { return nom; }
    public Vector<Car>    getList()                           { return list; }
   public void           setList  (Vector<Car> list)          { this.list = list; }
   //public Vector<Vehicle>    getList()                          { return list; }
   //public void           setList  (Vector<Vehicle> list)        { this.list = list; }
  //public ArrayList<Car> getList()                             { return list; }
  //public void           setList  (ArrayList<Car> list)        { this.list = list; }
  //public ArrayList<Vehicle> getList()                         { return list; }
  //public void           setList  (ArrayList<Vehicle> list)    { this.list = list; }



                                                //  TO STRING
    public String           toString()
                                                                {
                                                                    String st =  "Garage"  +
                                                                            "nom du garage = '" + this.nom + '\'' +
                                                                            ", liste de vehicules = " + "\n" ;
                                                                    for (int i=0; i< this.list.size(); i++)
                                                                    { st = st + this.list.get(i).toString()+ "\n";}
                                                                    return  st + "\n";

                                                                }


                                                // OTHER METHODS


   public Car    returnCar   (int index)                     { return this.list.get(index); }
   public void   addCar      (Car car)                       { this.list.add(car); }

    //public Vehicle  returnCar   (int index)                     { return this.list.get(index); }
    //public void     addCar      (Vehicle veh)                   { this.list.add(veh); }



}
