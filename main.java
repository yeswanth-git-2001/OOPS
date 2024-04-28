class Main {
    //Driving code i.e automatically main method will be called by JVM
    public static void main(String[] args) {

        //The variables which defined inside method called as local variables and memory would be on stack area
        //Memory for local variables will be given at method starts executing and memory will be deallocated after the method execution
        //There will be no default values for local variables, if you try to use it before initializing, compile time error will be thrown
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        //This is how we can create an object using the new keyword
        Student student = new Student();
        //Student : reference variable
        //by default the user didn't assigned any value to the instance variables, the default values will be stored

        student.id = 10;
        student.name = "Yeswanth chowdary";
        //id, name are instance variables which can change the data from one object to another object
        System.out.println(student.hashCode()); //reference of the object will be printed
    }//After this line the scope of the reference variable student will be gone, then we cant access instance variables of the class
    //If the reference variables student was not referring to the object, the garbage collector will the object from the heap area.
}

//Blue print
class Student{

    //HAS -> variables
    int id;
    String name;
    int age;
    String address;
    double height;
    double weight;

    //Does -> methods
    void study(){
        System.out.println("Student is studying");
    }

    void play(){
        System.out.println("Student is playing");
    }
    
    void sleep(){
        System.out.println("Student is sleeping");
    }
}
