// Name:	    Caiden Hyde
// Class:	    Data Structures 
// Term:		Spring 2026
// Instructor:  Srilehka Dodda 
// Assignment:  1
// IDE Name:	Visual Studio Code	

import java.util.Scanner; //imports scanner package

public class TestTemps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //initializes scanner object
        int[] temps = new int[7]; //initializes an array to hold all temps

        //requests a temp for each day and adds them to temps
        for(int i = 0; i < 7; i++){
            System.out.print("Enter a temperature value for day " + i + ": ");
            int temp = s.nextInt();
            temps[i] = temp;
        }

        DailyTemps dt = new DailyTemps(temps); //initializes a DailyTemps object using temps

        //this block of code tests the function setTemp()
        System.out.println("\n\nTesting method setTemp: ");
        System.out.print("Enter index value for the day: ");
        int index = s.nextInt(); //the index is set by the inputted value
        System.out.print("Enter temperature value: ");
        int temp = s.nextInt(); //temp is set by the inputted value
        dt.setTemp(index, temp); //setTemp is called

        //this block tests the function Freezing()
        System.out.println("\n\nTesting method Freezing: ");
        int freezeCount = dt.Freezing(); //freezeCount is initialized with the value returned by Freezing()
        System.out.println("Number of freezing days is " + freezeCount + " days"); //freezeCount is printed with context

        //this block tests the function Warmest()
        System.out.println("\n\nTesting method Warmest: ");
        String warmestDay = dt.Warmest(); //warmestDay is initialized with the value returned by Warmest()
        System.out.println("The warmest day of the week is " + warmestDay); //warmestDay

        //this block tests the funciton printTemps()
        System.out.println("\n\nTesting method printTemps: ");
        System.out.println(dt.printTemps()); //prints printTemps()

        s.close(); //closes scanner
    }
    

}
