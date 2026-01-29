// Name:	    Caiden Hyde
// Class:	    Data Structures 
// Term:		Spring 2026
// Instructor:  Srilehka Dodda 
// Assignment:  1
// IDE Name:	Visual Studio Code	

public class Rectangle {
    private double width;
    private double height;

    //default constructor for Rectangle
    public Rectangle() {
        width = 1;
        height = 1;
    }

    //constructor for Rectangle
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //returns width value of the object
    public double getWidth(){
        return width;
    }

    //returns height value of the object
    public double getHeight(){
        return height;
    }

    //returns area value of the object (width * height)
    public double getArea(){
        return width * height;
    }

    //returns perimeter value of the object (height + height + width + width)
    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }

    //prints the name of the object and its height and width values
    public String printRectangle(String objectName){
        return "Rectangle " + objectName + " is " + width + " units wide and " + height + " units high.";
    }
    
}
