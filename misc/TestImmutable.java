final class ImmutableFactorial {

    private final int number; // Rule 1: private final
    
    public ImmutableFactorial(int number) {
    
    this.number = number; // Rule 3: set value once in constructor
    
    }
    
    public int getNumber() {
    
    return number; // Safe accessor
    
    }
    
    public long factorial() {
    
    long result = 1;
    
    for (int i = 2; i <= number; i++) {
    
    result *= i;
    
    }
    
    return result;
    
    }
    
    }
    
    // Main program
    
    public class TestImmutable {
    
    public static void main(String[] args) {
    
    ImmutableFactorial f = new ImmutableFactorial(6);
    
    System.out.println("Factorial: " + f.factorial());
    
    //f.number = 6;
    
    //f.setNumber(6);
    
    }
    
    }