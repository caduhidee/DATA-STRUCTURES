// Name:	    Caiden Hyde
// Class:	    Data Structures 
// Term:		Spring 2026
// Instructor:  Srilehka Dodda 
// Assignment:  1
// IDE Name:	Visual Studio Code	


import java.util.Scanner; //imports scanner package

public class TestRectangle {
    public static void main(String[] args) {
    Rectangle myRectangle = new Rectangle(); //initializes default Rectangle object
    Scanner s = new Scanner(System.in); //intializes scanner object


    System.out.print("What is the width of your rectangle? "); //requests width value for scanner
    double width = s.nextInt(); //intializes width with inputted value
    System.out.print("What is the height of your rectangle? "); //requests height value for scanner
    double height = s.nextInt(); //intializes height with inputted value

    Rectangle yourRectangle = new Rectangle(width, height); //initializes a new Rectangle object with inputted values


    //This block demonstrates all functions in Rectangle using myRectangle
    System.out.println("\nmyRectangle:");
    System.out.println("--------------");
    System.out.println("Width:       " + myRectangle.getWidth());
    System.out.println("Height:      " + myRectangle.getHeight());
    System.out.println("Area:        " + myRectangle.getArea());
    System.out.println("Perimeter:   " + myRectangle.getPerimeter());
    System.out.println("\n" + myRectangle.printRectangle("myRectangle") + "\n");

    //This block demonstrates all functions in Rectangle using yourRectangle
    System.out.println("yourRectangle:");
    System.out.println("--------------");
    System.out.println("Width:      " + yourRectangle.getWidth());
    System.out.println("Height:     " + yourRectangle.getHeight());
    System.out.println("Area:       " + yourRectangle.getArea());
    System.out.println("Perimeter:  " + yourRectangle.getPerimeter());
    System.out.println("\n" + yourRectangle.printRectangle("yourRectangle") + "\n");

    //tests all Rectangle functions that returns ints 
    System.out.println("Testing method getWidth() on object myRectangle:     " + myRectangle.getWidth());
    System.out.println("Testing method getHeight() on object myRectangle:    " + myRectangle.getHeight());
    System.out.println("Testing method getArea() on object myRectangle:      " + myRectangle.getArea());
    System.out.println("Testing method getPerimeter() on object myRectangle: " + myRectangle.getPerimeter());

    s.close(); //closes the scanner
    }
}


