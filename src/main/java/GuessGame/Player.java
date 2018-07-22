package GuessGame;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class Player {

    int number  = 0; // where the guess goes

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("i'm guessing " + number);
    }
}
