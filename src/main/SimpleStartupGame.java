package src.main;

import java.io.IOException;
//import java.util.Random;

import src.main.GameHelper.*;
import src.main.Startup.Startup;

import java.util.*;

public class SimpleStartupGame {
    
    public static void main(String[] args) throws IOException{

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        //Random location
        // Random rand = new Random();
        // int intRandom = rand.nextInt(5);
        // int intRandom2 = intRandom + 1;
        // int intRandom3 = intRandom + 2;

        
        ArrayList<String> randomPositions = new ArrayList<String>();

        randomPositions.add("A1");
        randomPositions.add("A2");
        randomPositions.add("A3");

        //SimpleStartup
        Startup sp = new Startup();

        //set random location in array
        sp.setLocationCells(randomPositions);
        
        String result = "";

        while(result != "kill"){

            //Get user input
            String guess = helper.getUserInput("enter a number");

                    //System.out.print(sp);

                    // for (int cell: sp){
                    //     System.out.print(cell);
                    // }
            

            result = sp.checkYourSelf(guess);
            numOfGuesses++;
        }//END WHILE

        System.out.print("congratulation, you made " + numOfGuesses + " guesses" );

    }//MAIN

}//CLASS