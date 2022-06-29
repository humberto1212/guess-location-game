package src.main;

import java.util.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import src.main.SimpleStartup.SimpleStartup;

public class SimpleStartupGame {
    
    public static void main(String[] args) throws IOException{

        int numOfGuesses = 0;

        

        //Random location
        Random rand = new Random();
        int intRandom = rand.nextInt(5);
        int intRandom2 = intRandom + 1;
        int intRandom3 = intRandom + 2;
        int[] randomPositions = {intRandom, intRandom2, intRandom3};

        // // Enter data using BufferReader
        // BufferedReader reader = new BufferedReader(
        //     new InputStreamReader(System.in));

        // // Reading data using readLine
        // String hitNumberStr = reader.readLine();
        // int hitNumberInt = Integer.parseInt(hitNumberStr);

        //SimpleStartup
        SimpleStartup sp = new SimpleStartup();

        //set random location in array
        sp.setLocationCells(randomPositions);
        
        String result = "";

        while(result != "kill"){

             // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        String hitNumberStr = reader.readLine();
        int hitNumberInt = Integer.parseInt(hitNumberStr);

            result = sp.checkYourSelf(hitNumberInt);
            numOfGuesses++;
        }

        System.out.print("congratulation, you made " + numOfGuesses + " guesses" );

    }//MAIN

}//CLASS