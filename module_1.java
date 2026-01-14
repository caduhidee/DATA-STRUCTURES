
class Student{
    static final String UNIVERSITY_NAME = "Owl Tech Univeristy";
    static int studentCount = 0;

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        studentCount++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void displayStudentCOunt(){
        System.out.println("Total Students: " + studentCount);
    }
}