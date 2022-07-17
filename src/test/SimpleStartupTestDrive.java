package src.test;

import java.util.ArrayList;

import src.main.Startup.Startup;


public class SimpleStartupTestDrive {

    public static void main (String[] args){
       Startup dot = new Startup();
       
        String userGuess = "A2";

        //SET LOCATION
                
        ArrayList<String> locations = new ArrayList<String>();

        locations.add("A1");
        locations.add("A2");
        locations.add("A3");

        dot.setLocationCells(locations);

        String result = dot.checkYourSelf(userGuess);

        String testResult = "failed";

        if (result.equals("hit")){
            testResult = "passed";

        }

        if (result.equals("kill")){
            testResult = "you made <X> moves";
        }
        
        if(result.equals("failed")){
            System.out.println(testResult);
        }

        System.out.println(testResult);

    }
}
