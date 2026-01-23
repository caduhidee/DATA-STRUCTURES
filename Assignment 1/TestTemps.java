// Name:	    Caiden Hyde
// Class:	    Data Structures 
// Term:		Spring 2026
// Instructor:  Srilehka Dodda 
// Assignment:  1
// IDE Name:	Visual Studio Code	

import java.util.Scanner;

public class TestTemps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] temps = new int[7];


        for(int i = 0; i < 7; i++){
            System.out.print("Enter a temperature value for day " + i + ": ");
            int temp = s.nextInt();
            temps[i] = temp;
        }

        DailyTemps dt = new DailyTemps(temps);

        System.out.println("\n\nTesting method setTemp: ");
        System.out.print("Enter index value for the day: ");
        int index = s.nextInt();
        System.out.print("Enter temperature value: ");
        int temp = s.nextInt();
        dt.setTemp(index, temp);

        System.out.println("\n\nTesting method Freezing: ");
        int freezeCount = dt.Freezing();
        System.out.println("Number of freezing days is " + freezeCount + " days");


        System.out.println("\n\nTesting method Warmest: ");
        String warmestDay = dt.Warmest();
        System.out.println("The warmest day of the week is " + warmestDay);

        System.out.println("\n\nTesting method printTemps: ");
        System.out.println(dt.printTemps());

        s.close();
    }
    

}
