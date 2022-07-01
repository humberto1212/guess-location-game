package src.main;

import java.io.IOException;
import java.util.Random;

import src.main.SimpleStartup.SimpleStartup;
import src.main.GameHelper.*;

public class SimpleStartupGame {
    
    public static void main(String[] args) throws IOException{

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        //Random location
        Random rand = new Random();
        int intRandom = rand.nextInt(5);
        int intRandom2 = intRandom + 1;
        int intRandom3 = intRandom + 2;
        int[] randomPositions = {intRandom, intRandom2, intRandom3};

        //SimpleStartup
        SimpleStartup sp = new SimpleStartup();

        //set random location in array
        sp.setLocationCells(randomPositions);
        
        String result = "";

        while(result != "kill"){

            //Get user input
            int guess = helper.getUserInput("enter a number");

            result = sp.checkYourSelf(guess);
            numOfGuesses++;
        }//END WHILE

        System.out.print("congratulation, you made " + numOfGuesses + " guesses" );

    }//MAIN

}//CLASS