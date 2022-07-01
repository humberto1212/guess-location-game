package src.main.GameHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    //--------------
    //Get User Input
    //--------------
    public int getUserInput(String prompt) throws IOException{

        System.out.print(prompt + ": ");

          // Enter data using BufferReader
          BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

            // Reading data using readLine
            String hitNumberStr = reader.readLine();
            int hitNumberInt = Integer.parseInt(hitNumberStr);

            return hitNumberInt;

    }
}
