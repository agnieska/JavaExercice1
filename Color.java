/**
 * Created by Agnieszka on 28/01/17.
 */

import java.lang.*;


public enum Color {

    RED ("rouge"),
    GREEN  ("vert"),
    BLUE  ("blue");

    /*
    RED ("#FFFF00"),
    GREEN  ("#008000"),
    BLUE  ("#0000FF"); */

    /*
        GREY("142, 142, 147"),
        RED("255, 59, 48"),
        GREEN("76, 217, 100"),
        PURPLE("88, 86, 214"),
        LIGHTBLUE ("52, 170, 220");    //... etc, this is a shorted list
        */

    private final String string;

    private Color(final String string)      {
                                                this.string = string;
                                            }

    public String getDecimal()              {
                                                    return string;
                                            }




}
