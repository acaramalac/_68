package DotComGame;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
@Ignore
public class DotCom {

    private ArrayList<String> locationCells;  // an ArrayList of cell locations
    private String name;  // DotCom's name

    public void setLocationCells(ArrayList<String> loc) {  // A setter method that updates the DotCom's locations.
        locationCells = loc;
    }

    public void setName (String n) {  // Basic setter method
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);  // The ArrayList indexOf() method in action! If the user guess is one of te entries in the ArrayList, indexOf() will return its ArrayList location. If not, indexOf() will return -1
        if (index >= 0) {
            locationCells.remove(index);  // Using ArrayList remove() method to delete an entry

            if (locationCells.isEmpty()) {  // Using isEmpty() method to see if all of the locations have been guessed
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "  :( ");
            } else {
                result = "hit";
            }
        }
        return result;  // return 'miss' or 'hit'
    }
}