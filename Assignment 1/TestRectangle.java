// Name:	    Caiden Hyde
// Class:	    Data Structures 
// Term:		Spring 2026
// Instructor:  Srilehka Dodda 
// Assignment:  1
// IDE Name:	Visual Studio Code	


import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
    Rectangle myRectangle = new Rectangle();
    Scanner s = new Scanner(System.in);

    System.out.print("What is the width of your rectangle? ");
    double width = s.nextInt();
    System.out.print("What is the height of your rectangle? ");
    double height = s.nextInt();

    Rectangle yourRectangle = new Rectangle(width, height);


    System.out.println("\nmyRectangle:");
    System.out.println("--------------");
    System.out.println("Width:       " + myRectangle.getWidth());
    System.out.println("Height:      " + myRectangle.getHeight());
    System.out.println("Area:        " + myRectangle.getArea());
    System.out.println("Perimeter:   " + myRectangle.getPerimeter());
    System.out.println("\n" + myRectangle.printRectangle("myRectangle") + "\n");

    System.out.println("yourRectangle:");
    System.out.println("--------------");
    System.out.println("Width:      " + yourRectangle.getWidth());
    System.out.println("Height:     " + yourRectangle.getHeight());
    System.out.println("Area:       " + yourRectangle.getArea());
    System.out.println("Perimeter:  " + yourRectangle.getPerimeter());
    System.out.println("\n" + yourRectangle.printRectangle("yourRectangle") + "\n");


    System.out.println("Testing method getWidth() on object myRectangle:     " + myRectangle.getWidth());
    System.out.println("Testing method getHeight() on object myRectangle:    " + myRectangle.getHeight());
    System.out.println("Testing method getArea() on object myRectangle:      " + myRectangle.getArea());
    System.out.println("Testing method getPerimeter() on object myRectangle: " + myRectangle.getPerimeter());

    s.close();
    }
}


