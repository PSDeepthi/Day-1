//The interface body can contain abstract methods, default methods, and static methods.
// abstract method inside interface cannot have body

public interface InterfaceWithBody {
   
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyInterface implements InterfaceWithBody {
    // Implementing abstract method from the interface
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod in MyClass.");
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyInterface obj = new MyInterface();

        // Calling methods
        obj.abstractMethod();  
        obj.defaultMethod();   
        InterfaceWithBody.staticMethod(); 
    }
}

