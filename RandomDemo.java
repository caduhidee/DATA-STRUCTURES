import java.util.Random;
public class RandomDemo {


private Random random; 
private int upperBound; 

public static int objectCount = 0;

public static final int DEFAULT_BOUND = 1000;

public RandomDemo(int seed, int upperBound) {
this.random = new Random(seed); 
this.upperBound = upperBound;
objectCount++;
}

public int generateNumber() {
return random.nextInt(upperBound);
}

public int getUpperBound() {
return upperBound;
}

public void setUpperBound(int upperBound) {
this.upperBound = upperBound;
}

public static void printObjectCount() {
System.out.println("Objects created: " + objectCount);
}

public void changePrimitive(int x) {
x = 999; 
}

public void changeObject(RandomDemo demo) {
demo.upperBound = 50; 
}

public static void main(String[] args) {
RandomDemo random1 = new RandomDemo(3, DEFAULT_BOUND);
RandomDemo random2 = new RandomDemo(3, DEFAULT_BOUND);
System.out.print("From random1: ");
for (int i = 0; i < 10; i++) {
System.out.print(random1.generateNumber() + " ");
}
System.out.print("\nFrom random2: ");
for (int i = 0; i < 10; i++) {
System.out.print(random2.generateNumber() + " ");
}
System.out.println();
RandomDemo.printObjectCount();
}
}