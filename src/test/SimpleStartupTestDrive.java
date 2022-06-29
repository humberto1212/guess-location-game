package src.test;

import src.main.SimpleStartup.SimpleStartup;


public class SimpleStartupTestDrive {

    public static void main (String[] args){
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2,3,4};
        int userGuess = 2;

        //SET LOCATION
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
