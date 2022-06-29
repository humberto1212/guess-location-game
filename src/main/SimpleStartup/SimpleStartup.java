package src.main.SimpleStartup;

public class SimpleStartup {

    int[] locationCells = new int[7];
    int numberOfHits = 0;
    

    public String checkYourSelf(int guess){

        String result = "miss";

        for (int cell: locationCells){
            if(guess == cell){
                result = "hit";

                numberOfHits++;
            
                break;
            } //END IF
        } //END FOR
        
        if(numberOfHits == 3){
            result = "kill"; 
        }

        System.out.println(result);

        return result;
    }


    public void setLocationCells(int[] locations) {
        //locationCells = locations;
        for(int l: locations){
            locationCells[l] = l;
        }
    }

    
}
