package DotComGame;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.*;
@Ignore
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>(); // Make an ArrayList of DotCom objects
    private int numOfGuesses = 0;

    private void setUpGame() {
        // First make some Dot Coms and give them locations
        // Make three DotCom objects, give 'em names, and stick 'em in the ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {                    // Repeat with each DotCom in the List
            ArrayList<String> newLocation = helper.placeDotCom(3); // Ask the helper for a DotCom location (an ArrayList of Strings)
            dotComToSet.setLocationCells(newLocation);             // Call the setter method on this DotCom to give it the location you just got from the helper
        }
    } // Close set up game method

    private void startPlaying() {
        while(!dotComList.isEmpty()) {                                        // As long as the DotCom list is NOT empty
            String userGuess = helper.getUserInput("Enter a guess");  // Get user input
            checkUserGuess(userGuess);                                        // Call our own checkUserGuess method
        }
        finishGame();         // Call our own finishGame method
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;                        // Increment the number of guesses the user has made
        String result = "miss";                // Assume it's a miss, unless told otherwise

        for (DotCom dotComToTest : dotComList) {            // Repeat with all DotComs in the list
            result = dotComToTest.checkYourself(userGuess); // ask the DotCom ti check the user guess, looking for a hit (or kill)
            if (result.equals("hit")) {
                break;        // Get out of the loop early, no point in testing the others
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;        // This guy's dead, so take him out of the DotComs list then get out of the loop
            }
        }
        System.out.println("result");
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main (String [] args) {
        DotComBust game = new DotComBust();         // Create the game object
        game.setUpGame();                           // Tell the game object to set up the game
        game.startPlaying();                        // Tell the game object to start the main game play loop (keeps asking for user input and checking the guess)
    }
}
