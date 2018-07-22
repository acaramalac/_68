package GuessGame;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class GameLauncher {

        public static void main(String[] args) {

            GuessGame game = new GuessGame();
            game.startGame();
        }
    }
