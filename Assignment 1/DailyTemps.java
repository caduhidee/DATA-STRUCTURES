// Name:	    Caiden Hyde
// Class:	    Data Structures 
// Term:		Spring 2026
// Instructor:  Srilehka Dodda 
// Assignment:  1
// IDE Name:	Visual Studio Code	

public class DailyTemps {
    int[] temps = new int[7];

    public DailyTemps(int[] temps) {
        this.temps = temps;
    }

    public void setTemp(int index, int temp){
        temps[index] = temp;
    }

    public int Freezing(){
        int freezeCount = 0;
        for(int i = 0; i < 7; i++){
            if(temps[i] > 32)
                freezeCount++;
        }
        return freezeCount;
    }

    public String Warmest(){
        int warmestTemp = 0;
        int warmestDay = 0;
        for(int i = 0; i < 7; i ++){
            if(temps[i] > warmestTemp){
                warmestTemp = temps[i];
                warmestDay = i;
            }
        }
        switch(warmestDay){
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return null;
        }
    }
    
    public String printTemps(){
        return "Monday       " + temps[0] +
             "\nTuesday      " + temps[1] +
             "\nWednesday    " + temps[2] +
             "\nThursday     " + temps[3] +
             "\nFriday       " + temps[4] +
             "\nSaturday     " + temps[5] +
             "\nSunday       " + temps[6];

    }

    

}
